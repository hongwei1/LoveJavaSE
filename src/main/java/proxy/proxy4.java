//https://www.jianshu.com/p/4e6fff9d27b5
//https://www.jianshu.com/p/514e498c1dd6
package proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//做蛋糕的机器
interface CakeMachine{
    void makeCake();
}

//专门做水果蛋糕的机器
class FruitCakeMachine implements CakeMachine{
    public void makeCake() {
        System.out.println("Making a fruit cake...");
//        System.out.println("adding apricot..."); 不能直接加这句话,应该让代理类区实现吧., 查看FruitCakeMachineProxy
    }
}

//专门做巧克力蛋糕的机器
class ChocolateCakeMachine implements CakeMachine{
    public void makeCake() {
        System.out.println("making a Chocolate Cake...");
    }
}

//水果蛋糕机代理(这个是静态代理),需要为每一个具体对象写代理: 巧克力代理,水果代理,,,这样代理类会太多了.
class FruitCakeMachineProxy implements CakeMachine{
    private CakeMachine cakeMachine;
    public FruitCakeMachineProxy(CakeMachine cakeMachine) {
        this.cakeMachine = cakeMachine;
    }
    public void makeCake() {
        cakeMachine.makeCake();
        System.out.println("adding apricot...");
    }
}

class ChocolateCakeMachineProxy implements CakeMachine{
    private CakeMachine cakeMachine;
    public ChocolateCakeMachineProxy(CakeMachine cakeMachine) {
        this.cakeMachine = cakeMachine;
    }
    public void makeCake() {
        cakeMachine.makeCake();
        System.out.println("adding apricot...");
    }
}

//Java 中早已经有了针对这种情况而设计的一个接口，专门用来解决类似的问题，它就是动态代理 —— InvocationHandler。
//动态代理与静态代理的区别是静态代理只能针对特定一种类型（某种蛋糕机）做某种代理动作（撒杏仁），而动态代理则可以对所有类型（所有蛋糕机）
//做某种代理动作（撒杏仁）。

//杏仁动态代理
class ApricotHandler implements InvocationHandler {

    private Object object;

    public ApricotHandler(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);    //调用真正的蛋糕机做蛋糕
        System.out.println("adding apricot...");
        return result;
    }
}

class ApricotInterceptor implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        methodProxy.invokeSuper(o, objects);
        System.out.println("adding apricot...");
        return o;
    }
}


//蛋糕店
class CakeShop {
    public static void main(String[] args) {

/*****************************************静态代理****************************************************************/
        FruitCakeMachine fruitCakeMachineStatic = new FruitCakeMachine();
        FruitCakeMachineProxy fruitCakeProxyStatic = new FruitCakeMachineProxy(fruitCakeMachineStatic);
        fruitCakeProxyStatic.makeCake();   //making a Fruit Cake...   adding apricot...

        ChocolateCakeMachine chocolateCakeMachineStatic = new ChocolateCakeMachine();
        ChocolateCakeMachineProxy chocolateCakeProxyStatic = new ChocolateCakeMachineProxy(chocolateCakeMachineStatic);
        chocolateCakeProxyStatic.makeCake();   //making a Fruit Cake...   adding apricot...

/*****************************************动态代理****************************************************************/
        //水果蛋糕撒一层杏仁
        CakeMachine fruitCakeMachine = new FruitCakeMachine();
        ApricotHandler fruitCakeApricotHandler = new ApricotHandler(fruitCakeMachine);
        // 这里必须限制是CakeMachine的接口.不能值具体类:
        // Java.lang.ClassCastException: proxy.$Proxy0 cannot be cast to proxy.FruitCakeMachine
        CakeMachine fruitCakeProxyDynamic = (CakeMachine) Proxy.newProxyInstance( 
                fruitCakeMachine.getClass().getClassLoader(),
                fruitCakeMachine.getClass().getInterfaces(),
                fruitCakeApricotHandler
        );
        fruitCakeProxyDynamic.makeCake();

        //巧克力蛋糕撒一层杏仁
        CakeMachine chocolateCakeMachine = new ChocolateCakeMachine();
        ApricotHandler chocolateCakeApricotHandler = new ApricotHandler(chocolateCakeMachine);
        CakeMachine chocolateCakeProxy = (CakeMachine) Proxy.newProxyInstance(
                chocolateCakeMachine.getClass().getClassLoader(),
                chocolateCakeMachine.getClass().getInterfaces(),
                chocolateCakeApricotHandler
        );
        chocolateCakeProxy.makeCake();

/*****************************************CGLib代理****************************************************************/
        //CGLib就是直接叫增强类,直接方法增加逻辑,然后生成对象,直接调用.
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(FruitCakeMachine.class);
        enhancer.setCallback(new ApricotInterceptor());
        FruitCakeMachine fruitCakeMachine2 = (FruitCakeMachine) enhancer.create();
        fruitCakeMachine2.makeCake();

        Enhancer enhancer2 = new Enhancer();
        enhancer2.setSuperclass(ChocolateCakeMachine.class);
        enhancer2.setCallback(new ApricotInterceptor());
        ChocolateCakeMachine chocolateCakeMachine2 = (ChocolateCakeMachine) enhancer2.create();
        chocolateCakeMachine2.makeCake();
     
    }
}