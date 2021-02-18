//https://www.liaoxuefeng.com/wiki/1252599548343744/1264804593397984
package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class proxy1 {
    //interface 不能实例化,必须向上转型并指向某个实例.用Dynamic Proxy 可以不编写实现类,直接再运行期间创建某个interface的实例.
    // 运行期间动态创建 vs 静态代理
    public static void main(String[] args) {
        //通常的方式: 定义interface --> 实现类 --> 再创建实例,调用method
//        Hello hello = new HelloWorld();
//        hello.morning("Bob");

        // dynamic code.
        // 左边是一个具体的object --> 右边是一个匿名的实现类.
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("morning")) {//仅仅是通过method来确定方法
                    System.out.println("Good morning, " + args[0]);
                } else if(method.getName().equals("test")){
                    System.out.println("Good testing, name=" + args[0] +", age = "+ args[1]);
                }
                return null;
            }
        };
        // newProxyInstance 返回的object 强制转化为 Hello 接口.
        Class[] interfaceClasses = {Hello.class};
        Hello hello = (Hello) Proxy.newProxyInstance(
                Hello.class.getClassLoader(), // 传入ClassLoader
                interfaceClasses,             // 传入要实现的接口 Class<?>[]
                handler                       // InvocationHandler--> 实现接口未实现的方法.
        ); // 传入处理调用方法的InvocationHandler
        hello.morning("Bob");
//        hello.test("Bob",12);
        //这样就实现了,只提供一个接口,没有具体实现,也可以
        
        //动态代理实际上是JVM再运行期动态创建class字节码并加载的过程.--> 就是JVM 帮我们写的如下的代码: 


    }
    
}

//静态代理:
interface Hello {
    void morning(String name);
//    void test(String name, int age);
}

class HelloWorld implements Hello {
    public void morning(String name) {
        System.out.println("Good morning, " + name);
    }
}

//
class HelloDynamicProxy implements Hello {
    InvocationHandler handler;
    public HelloDynamicProxy(InvocationHandler handler) {
        this.handler = handler;
    }
    public void morning(String name) {
        try {
            handler.invoke(
                    this,
                    Hello.class.getMethod("morning", String.class),
                    new Object[] { name }
                    );
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}






















































































