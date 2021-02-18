//https://blog.csdn.net/briblue/article/details/54973413
//一看你就懂，超详细java中的ClassLoader详解


package classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class HelloWorld {

    public void say(){
        System.out.println("Say Hello");
    }

    //HelloWorld.class字节码格式文件.java虚拟机并不能直接识别.java源文件,需要javac换成.class文件.
    //C或者Python的也可以转成.class文件.

    //classloader 会从下面3个地方去找.class文件.
    //JAVA_HOME,  eg:C:\Program Files\Java\jdk1.8.0_91
    //         是安装java的路劲
    // PATH,  eg: PATH=%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;%PATH%;
    //         原来的PATH路径上添加JDK目录下的bin目录和jre目录的bin. --> javac, java 就可以直接运行了.
    // CLASSPATH, eg: CLASSPATH=.;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar
    //         一看就是指向jar包路径。需要注意的是前面的.;，.代表当前目录


    //Java自带3个类加载器: --> 最顶层的加载类，主要加载核心类库，%JRE_HOME%\lib下的rt.jar、resources.jar、charsets.jar和class等.
    //1st: Bootstrap ClassLoader
    //2rd: Extension ClassLoader --> 扩展的类加载器，加载目录%JRE_HOME%\lib\ext目录下的jar包和class文件。还可以加载-D java.ext.dirs选项指定的目录
    //3rd: Appclass Loader(SystemAppClass) --> 当前应用的classpath的所有类
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("sun.boot.class.path:" + System.getProperty("sun.boot.class.path"));
        System.out.println("java.ext.dirs:" + System.getProperty("java.ext.dirs"));
        System.out.println("java.class.path:" + System.getProperty("java.class.path"));

        // TODO Auto-generated method stub

        ClassLoader cl = HelloWorld.class.getClassLoader();
        //HelloWorld.class文件是由AppClassLoader加载的。
        System.out.println("ClassLoader is:" + cl.toString());
        //-->ClassLoader is:sun.misc.Launcher$AppClassLoader@33909752

//        cl = int.class.getClassLoader();
//        System.out.println("int ClassLoader is:"+cl.toString()); 
// --> Exception in thread "main" java.lang.NullPointerException
        //因为: int.class是由Bootstrap ClassLoader加载的

        //每个类加载器都有父加载器.
        System.out.println("ClassLoader\'s parent is:" + cl.getParent().toString());
        //-->ClassLoader's parent is:sun.misc.Launcher$ExtClassLoader@42a57993
        //AppClassLoader的父加载器是ExtClassLoader

//        System.out.println("ClassLoader\'s grand father is:"+cl.getParent().getParent().toString());
        //-->Exception in thread "main" java.lang.NullPointerException
        //ExtClassLoader也没有父加载器


//        cl = String.class.getClassLoader();
//
//        System.out.println("String ClassLoader is:"+cl.toString());

        //父加载器不是父类

        //Bootstrap ClassLoader是由C++编写的。
        //它本身是JVM的一部分,不是一个Java类的. JVM启动时, 通过Boostrap类加载器加载rt.jar等核心jar包中的class文件,
        //int.class String.class 都是由它加载.
        //JVM 初始化sun.misc.Launcher --> 创建ExtClassLoader and AppClassLoader. 

        //双亲委托--> 查看下图: 
//        classloader/HelloWorld.java:65

//        自定义ClassLoader
//        自定义步骤
//        1 编写一个类继承自ClassLoader抽象类。
//        2 复写它的findClass()方法。
//        3 在findClass()方法中调用defineClass()。

        //创建自定义classloader对象。
        DiskClassLoader diskLoader = new DiskClassLoader("/Users/zhanghongwei/Documents/workspaceScala/LoveJavaSE/src/main/java/lib");
        try {
            //加载class文件
            Class c = diskLoader.loadClass("classloader.Test");

            if(c != null){
                try {
                    Object obj = c.newInstance();
                    Method method = c.getDeclaredMethod("say",null);
                    //通过反射调用Test类的say方法
                    method.invoke(obj, null);
                } catch (InstantiationException | IllegalAccessException
                        | NoSuchMethodException
                        | SecurityException |
                        IllegalArgumentException |
                        InvocationTargetException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



//        玩出花之Class解密类加载器
//        可以加密解密class
        
        
//        Context ClassLoader 线程上下文类加载器
        //每个线程都有自己的classloader. 默认是AppClassLoader, 子线程默认使用父线程的.
        
        
    }       
}

class DiskClassLoader extends ClassLoader {

    private String mLibPath;

    public DiskClassLoader(String path) {
        // TODO Auto-generated constructor stub
        mLibPath = path;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        // TODO Auto-generated method stub

        String fileName = getFileName(name);

        File file = new File(mLibPath, fileName);

        try {
            FileInputStream is = new FileInputStream(file);

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            int len = 0;
            try {
                while ((len = is.read()) != -1) {
                    bos.write(len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            byte[] data = bos.toByteArray();
            is.close();
            bos.close();

            return defineClass(name, data, 0, data.length);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return super.findClass(name);
    }

    //获取要加载 的class文件名
    private String getFileName(String name) {
        // TODO Auto-generated method stub
        int index = name.lastIndexOf('.');
        if (index == -1) {
            return name + ".class";
        } else {
            return name.substring(index + 1) + ".class";
        }
    }

}

