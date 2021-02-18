//https://zhuanlan.zhihu.com/p/62660956
package proxy;

import java.lang.reflect.*;
import java.util.Date;

import java.lang.reflect.Method;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class proxy3 {
    //这个会比较Calculator接口的Class对象 和 CalculatorImpl实现类的Class对象
    public static void main(String[] args) {
		/*Calculator接口的Class对象
          得到Class对象的三种方式：1.Class.forName(xxx) 
                                2.xxx.class 
                                3.xxx.getClass()
          注意，这并不是我们new了一个Class对象，而是让虚拟机加载并创建Class对象            
        */
        // 这是让JVM 加载并创建Class对象.
        Class<Calculator> calculatorClazz = Calculator.class;
        
        //Calculator接口的构造器信息
        Constructor[] calculatorClazzConstructors = calculatorClazz.getDeclaredConstructors();
        //Calculator接口的方法信息
        Method[] calculatorClazzMethods = calculatorClazz.getDeclaredMethods();
        //打印
        System.out.println("------接口Class的构造器信息------");
        printClassInfo(calculatorClazzConstructors);
        System.out.println("------接口Class的方法信息------");
        printClassInfo(calculatorClazzMethods);

        //Calculator实现类的Class对象
        Class<CalculatorImpl> calculatorImplClazz = CalculatorImpl.class;
        //Calculator实现类的构造器信息
        Constructor<?>[] calculatorImplClazzConstructors = calculatorImplClazz.getDeclaredConstructors();
        //Calculator实现类的方法信息
        Method[] calculatorImplClazzMethods = calculatorImplClazz.getDeclaredMethods();
        //打印
        System.out.println("------实现类Class的构造器信息------");
        printClassInfo(calculatorImplClazzConstructors);
        System.out.println("------实现类Class的方法信息------");
        printClassInfo(calculatorImplClazzMethods);


        //把目标对象通过构造器塞入代理对象
        Calculator calculator = new CalculatorProxy(new CalculatorImpl());
        //代理对象调用目标对象方法完成计算，并在前后打印日志
        calculator.add(1, 2);
        calculator.subtract(2, 1);
    }

    public static void printClassInfo(Executable[] targets){
        for (Executable target : targets) {
            // 构造器/方法名称
            String name = target.getName();
            StringBuilder sBuilder = new StringBuilder(name);
            // 拼接左括号
            sBuilder.append('(');
            Class[] clazzParams = target.getParameterTypes();
            // 拼接参数
            for(Class clazzParam : clazzParams){
                sBuilder.append(clazzParam.getName()).append(',');
            }
            //删除最后一个参数的逗号
            if(clazzParams!=null && clazzParams.length != 0) {
                sBuilder.deleteCharAt(sBuilder.length()-1);
            }
            //拼接右括号
            sBuilder.append(')');
            //打印 构造器/方法
            System.out.println(sBuilder.toString());
        }
    }
}

/**
 * Calculator接口
 */
interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
}



/**
 * 目标对象实现类，实现Calculator接口
 */
class CalculatorImpl implements Calculator {

    //加
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    //减
    public int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

    //乘法、除法...
}

/**
 * 代理对象实现类，实现Calculator接口
 */
class CalculatorProxy implements Calculator {
    //代理对象内部维护一个目标对象引用
    private Calculator target;

    //构造方法，传入目标对象
    public CalculatorProxy(Calculator target) {
        this.target = target;
    }

    //调用目标对象的add，并在前后打印日志
    @Override
    public int add(int a, int b) {
        System.out.println("add方法开始...");
        int result = target.add(a, b);
        System.out.println("add方法结束...");
        return result;
    }

    //调用目标对象的subtract，并在前后打印日志
    @Override
    public int subtract(int a, int b) {
        System.out.println("subtract方法开始...");
        int result = target.subtract(a, b);
        System.out.println("subtract方法结束...");
        return result;
    }

    //乘法、除法...
}



//是用new出的calculatorImpl 作为参数:
class ProxyTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /*
         * 参数1：Calculator的类加载器（当初把Calculator加载进内存的类加载器）
         * 参数2：代理对象需要和目标对象实现相同接口Calculator
         * */
        Class calculatorProxyClazz = Proxy.getProxyClass(Calculator.class.getClassLoader(), Calculator.class);
        //以Calculator实现类的Class对象作对比，看看代理Class是什么类型
        System.out.println(CalculatorImpl.class.getName());
        System.out.println(calculatorProxyClazz.getName());
        //打印代理Class对象的构造器
        Constructor[] constructors = calculatorProxyClazz.getConstructors();
        System.out.println("----构造器----");
        printClassInfo(constructors);
        //打印代理Class对象的方法
        Method[] methods = calculatorProxyClazz.getMethods();
        System.out.println("----方法----");
        printClassInfo(methods);
        
        //创建代理对象
        
        //得到有参数构造函数: 
        Constructor constructor = calculatorProxyClazz.getConstructor(InvocationHandler.class);
        
        //反射创建代理实例:
        Calculator calculatorProxyImpl = (Calculator) constructor.newInstance(new InvocationHandler() {
            //每次调用代理对象方法就会调用invoke,这个返回值就是代理方法的返回值的.
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                
//                ：设法在invoke()方法得到目标对象，并调用目标对象的同名方法。
                //这里就可以模拟实现具体方法的实现了.
                CalculatorImpl calculatorImpl = new CalculatorImpl();
                
                //这个方法调用
                Object result = method.invoke(calculatorImpl, args);
                
                return result;
            }
        });
        System.out.println(calculatorProxyImpl.add(1,2));
        System.out.println(calculatorProxyImpl.subtract(2,1));
    }

    public static void printClassInfo(Executable[] targets) {
        for (Executable target : targets) {
            // 构造器/方法名称
            String name = target.getName();
            StringBuilder sBuilder = new StringBuilder(name);
            // 拼接左括号
            sBuilder.append('(');
            Class[] clazzParams = target.getParameterTypes();
            // 拼接参数
            for (Class clazzParam : clazzParams) {
                sBuilder.append(clazzParam.getName()).append(',');
            }
            //删除最后一个参数的逗号
            if (clazzParams != null && clazzParams.length != 0) {
                sBuilder.deleteCharAt(sBuilder.length() - 1);
            }
            //拼接右括号
            sBuilder.append(')');
            //打印 构造器/方法
            System.out.println(sBuilder.toString());
        }
    }
}
//方法封装,把calculatorImpl 作为参数传入: 
class ProxyTest2 {
    public static void main(String[] args) throws Throwable {
        CalculatorImpl target = new CalculatorImpl();
        //传入目标对象
        //目的：1.根据它实现的接口生成代理对象 2.代理对象调用目标对象方法
        Calculator calculatorProxy = (Calculator) getProxy(target);
        calculatorProxy.add(1, 2);
        calculatorProxy.subtract(2, 1);
    }

    private static Object getProxy(final Object target) throws Exception {
        //参数1：随便找个类加载器给它， 参数2：目标对象实现的接口，让代理对象实现相同接口
        Class proxyClazz = Proxy.getProxyClass(target.getClass().getClassLoader(), target.getClass().getInterfaces());
        Constructor constructor = proxyClazz.getConstructor(InvocationHandler.class);
        Object proxy = constructor.newInstance(new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName() + "方法开始执行...");
                Object result = method.invoke(target, args);
                System.out.println(result);
                System.out.println(method.getName() + "方法执行结束...");
                return result;
            }
        });
        return proxy;
    }
}

//直接传入带你对象:
class ProxyTest3 {
    public static void main(String[] args) throws Throwable {
        CalculatorImpl target = new CalculatorImpl();
        Calculator calculatorProxy = (Calculator) getProxy(target);
        calculatorProxy.add(1, 2);
        calculatorProxy.subtract(2, 1);
    }

    private static Object getProxy(final Object target) throws Exception {
        Object proxy = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),/*类加载器*/
                target.getClass().getInterfaces(),/*让代理对象和目标对象实现相同接口*/
                new InvocationHandler(){/*代理对象的方法最终都会被JVM导向它的invoke方法*/
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println(method.getName() + "方法开始执行...");
                        Object result = method.invoke(target, args);
                        System.out.println(result);
                        System.out.println(method.getName() + "方法执行结束...");
                        return result;
                    }
                }
        );
        return proxy;
    }
}


interface Advice {
    void beforeMethod(Method method);
    void afterMethod(Method method);
}

class MyLogger implements Advice {

    public void beforeMethod(Method method) {
        System.out.println(method.getName() + "方法执行开始...");
    }

    public void afterMethod(Method method) {
        System.out.println(method.getName() + "方法执行结束...");
    }
}

class ProxyTest4 extends ClassLoader{
    public static void main(String[] args) throws Throwable {
        CalculatorImpl target = new CalculatorImpl();
        Calculator calculatorProxy = (Calculator) getProxy(target, new MyLogger());
        calculatorProxy.add(1, 2);
        calculatorProxy.subtract(2, 1);
    }

    private static Object getProxy(final Object target, Advice logger) throws Exception {
        /*代理对象的方法最终都会被JVM导向它的invoke方法*/
        Object proxy = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),/*类加载器*/
                target.getClass().getInterfaces(),/*让代理对象和目标对象实现相同接口*/
                (proxy1, method, args) -> {
                    logger.beforeMethod(method);
                    Object result = method.invoke(target, args);
                    System.out.println(result);
                    logger.afterMethod(method);
                    return result;
                }
        );
        return proxy;
    }

//    @Override
//    public Class<?> findClass(String name) throws ClassNotFoundException {
//        try {
//		   /*自己另外写一个getClassData() 通过IO流从指定位置读取xxx.class文件得到字节数组*/
//            byte[] datas = getClassData(name);
//            if(datas == null) {
//                throw new ClassNotFoundException("类没有找到：" + name);
//            }
//            //调用类加载器本身的defineClass()方法，由字节码得到Class对象
//            return this.defineClass(name, datas, 0, datas.length);
//        } catch (IOException e) {
//            e.printStackTrace();
//            throw new ClassNotFoundException("类找不到：" + name);
//        }
//    }
}































































