//https://blog.csdn.net/briblue/article/details/54973413
package classloader;

public class HelloWorld{

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
    public static void main(String[] args){
        System.out.println("Hello world!");
        System.out.println("sun.boot.class.path:"+System.getProperty("sun.boot.class.path"));
        System.out.println("java.ext.dirs:"+System.getProperty("java.ext.dirs"));
        System.out.println("java.class.path:"+System.getProperty("java.class.path"));
    }
}