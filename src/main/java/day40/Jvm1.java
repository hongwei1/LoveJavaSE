package day40;

//http://blog.csdn.net/ant_ren/article/details/2903630
import java.util.ArrayList;
import java.util.List;

public class Jvm1
{
	private static double d = 3.14;

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		int size = list.size();
		String s = null;
		if (size > 0)
		{
			s = list.get(0);
		}
		if (s != null)
		{
			s += " World!";// +=返回的都是一个新的String对象
		}
		System.out.println(d);
		System.out.println(s);
	}
}

/**
 * <pre>
这里用到一些基本语法，例如接口签名、整型赋值、String构造、String操作等。之后我们执行javac Demo.java编译成Demo.class文件，JDK提供了一个反编译指令集命令javap，执行javap -c Demo > Instructions.txt会解析class文件，排版针对Demo.class文件生成JVM字节码，再来看看这个字节码吧：

[java] view plain copy print?
Compiled from "Demo.java"
public class Demo extends java.lang.Object{
public Demo();
  Code:
   0:   aload_0 //表示从执行栈的下标0出读取一个引用出来
   1:   invokespecial   #1; //Method java/lang/Object."<init>":()V //<init>动作用于创建对象时进行初始化,包括实例变量的赋值和初始化静态块等
	   Invoke the method, special handling for superclass, private, and instance initialization method invocations
	   这里要区别于下面出现的invokevirtual指令(字节码：0xb6)，它们的区别也就是invokevirtual更加通用一点，会调用一个实例的方法，而invokespecial是定制针对三种情况下用的：
	        1、私有方法
	        2、调用父类继承下来的方法
	        3、每个对象的初始化
        	4:   return
public static void main(java.lang.String[]);
  Code:
   0:   new #2; //class java/util/ArrayList
   3:   dup //赋值整个操作栈
   4:   invokespecial   #3; //Method java/util/ArrayList."<init>":()V
   7:   astore_1
   8:   aload_1
   9:   ldc #4; //String Hello //ldc是指Push item from runtime constant pool，即从常量池中取值压入操作栈中
   11:  invokeinterface #5,  2; //InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
   16:  pop //pop弹出操作栈顶层值
   17:  aload_1
   18:  invokeinterface #6,  1; //InterfaceMethod java/util/List.size:()I
   23:  istore_2
   24:  aconst_null
   25:  astore_3
   26:  iload_2
   27:  ifle    41
   30:  aload_1
   31:  iconst_0
   32:  invokeinterface #7,  2; //InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
   37:  checkcast   #8; //class java/lang/String
   40:  astore_3
   41:  aload_3
   42:  ifnull  65
   45:  new #9; //class java/lang/StringBuilder
   48:  dup
   49:  invokespecial   #10; //Method java/lang/StringBuilder."<init>":()V
   52:  aload_3
   53:  invokevirtual   #11; //Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   56:  ldc #12; //String  World!
   58:  invokevirtual   #11; //Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   61:  invokevirtual   #13; //Method java/lang/StringBuilder.toString:()Ljava/lang/String;
   64:  astore_3
   65:  getstatic   #14; //Field java/lang/System.out:Ljava/io/PrintStream;
   68:  getstatic   #15; //Field d:D
   71:  invokevirtual   #16; //Method java/io/PrintStream.println:(D)V
   74:  getstatic   #14; //Field java/lang/System.out:Ljava/io/PrintStream;
   77:  aload_3
   78:  invokevirtual   #17; //Method java/io/PrintStream.println:(Ljava/lang/String;)V
   81:  returns
static {};
  Code:
   0:   ldc2_w  #18; //double 3.14d
   3:   putstatic   #15; //Field d:D
   6:   return
}
 * </pre>
 */