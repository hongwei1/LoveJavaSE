//https://www.jianshu.com/p/4e6fff9d27b5

package proxy;

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

//蛋糕店
class CakeShop {
    public static void main(String[] args) {
        
        FruitCakeMachine fruitCakeMachineStatic = new FruitCakeMachine();
        FruitCakeMachineProxy fruitCakeProxyStatic = new FruitCakeMachineProxy(fruitCakeMachineStatic);
        fruitCakeProxyStatic.makeCake();   //making a Fruit Cake...   adding apricot...

        ChocolateCakeMachine chocolateCakeMachineStatic = new ChocolateCakeMachine();
        ChocolateCakeMachineProxy chocolateCakeProxyStatic = new ChocolateCakeMachineProxy(chocolateCakeMachineStatic);
        chocolateCakeProxyStatic.makeCake();   //making a Fruit Cake...   adding apricot...
        
        
        //水果蛋糕撒一层杏仁
        CakeMachine fruitCakeMachine = new FruitCakeMachine();
        ApricotHandler fruitCakeApricotHandler = new ApricotHandler(fruitCakeMachine);
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
    }
}