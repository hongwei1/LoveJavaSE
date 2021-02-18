//https://www.zhihu.com/question/20794107

package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//1 static proxy:
interface Subject
{
    public void doSomething();
}

// 实现 一个接口, 然后实现这个接口的方法.
class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println( "call doSomething()" );
    }
}

//Subject 的静态代理
// String AOP 和 Struts 2 的拦截器:
class SubjectProxy implements Subject
{
    Subject subimpl = new RealSubject();
    
    @Override
    public void doSomething()
    {
        System.out.println( "before ---- call doSomething " );
        subimpl.doSomething();
        System.out.println( "after ----- call doSomething()" );
    }
}


// 动态代理
class ProxyHandler implements InvocationHandler
{
    private Object tar;

    //绑定委托对象，并返回代理类
    public Object bind(Object tar)
    {
        this.tar = tar;
        //绑定该类实现的所有接口，取得代理类 
        return Proxy.newProxyInstance(
                tar.getClass().getClassLoader(),
                tar.getClass().getInterfaces(),
                this
        );
    }

    public Object invoke(Object proxy , Method method , Object[] args)throws Throwable
    {
        Object result = null;
        //这里就可以进行所谓的AOP编程了
        //在调用具体函数方法前，执行功能处理
        result = method.invoke(tar,args);
        //在调用具体函数方法后，执行功能处理
        return result;
    }
}

public class proxy2
{
    public static void main(String args[])
    {
        //这个是生成一个RealSubject
        RealSubject realSubject = new RealSubject();
        realSubject.doSomething();
        
        //这是一个代理Subject
        Subject sub = new SubjectProxy();
        sub.doSomething();

        //这是动态代理example:
        ProxyHandler proxy = new ProxyHandler();
        //绑定该类实现的所有接口
        Subject sub1 = (Subject) proxy.bind(new RealSubject());
        sub1.doSomething();

    }
}




