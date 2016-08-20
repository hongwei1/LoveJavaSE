package itcastday11;

/*
1 definition：
	异常:是在运行时期发生的不正常情况。在java中用类的形式对不正常情况进行了描述和封装对象。
		描述不正常的情况的类，就称为异常类。 
		其实异常就是java通过面向对象的思想将问题封装成了对象,用异常类对其进行描述。

	以前:正常流程代码和问题处理代码相结合. 			eg:public static void sleep2(int time)
	现在:将正常流程代码和问题处理代码分离。提高阅读性. eg:public static void sleep(int time)

2 体系 System
	不同的问题用不同的类进行具体的描述。 比如角标越界。空指针等等,问题很多，意味着描述的类也很多，将其共性进行向上抽取，形成了异常体系。

	1 最终问题（不正常情况）就分成了两大类。
		|--1，一般不可处理的。Error
				特点：是由JVM抛出的严重性的问题。这种问题发生一般不针对性处理。直接修改程序
				     eg:int[] arr = new int[1024*1024*800];//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
		|--2，可以处理的。Exception
					 eg: int [] arr =null; sop(arr[0]);    //Exception in thread "main" java.lang.NullPointerException
		
	2 Throwable:无论是error，还是异常，问题，问题发生就应该可以抛出，让调用者知道并处理。
		该体系的特点就在于Throwable及其所有的子类都具有可抛性。
			  
	3 可抛性到底指的是什么呢？怎么体现可抛性呢？
		其实是通过两个关键字来体现的。
		throws and throw ,凡是可以被这两个关键字所操作的类和对象都具备可抛性.
			  			  
	4 该体系的特点：
		子类的后缀名都是用其父类名作为后缀，阅读性很想。

3 运行原理 ( running principle )eg:ExceptionDemo2.java
	1 As the information said, the exception will be thrower level by level. 
	  Until to the main and to JVM, if no one resolve it.
	  
		Exception in thread "main" java.lang.NullPointerException
		at itcastday11.Demo2.method(ExceptionDemo2.java:15)
		at itcastday11.ExceptionDemo2.main(ExceptionDemo2.java:39)
	2 the sentences under the exception will not be executed.
		eg: System.out.println("over"); 
	3 When I know how the exception work by default, I can initialise my own exceptions.
		eg: throw new NullPointerException("数组的引用不能为空！");
		


6 异常处理的捕捉形式： 可以对异常进行针对性处理的方式。 eg:ExceptionDemo4.java
	1 格式	：
		try
		{
			//需要被检测异常的代码。
		}
		catch(异常类 变量)//该变量用于接收发生的异常对象
		{
			//处理异常的代码。
		}
		finally
		{
			//一定会被执行的代码。
		}
	2 多catch情况：使用的函数抛几个异常，就用几个catch接受。
		eg:catch(Exception e)//多catch父类的catch放在最下面。 {

7 异常处理的原则：
	1，函数内容如果抛出需要检测的异常，那么函数上必须要声明。
		否则必须在函数内用trycatch捕捉，否则编译失败。
		
	2，如果调用到了声明异常的函数，要么trycatch要么throws，否则编译失败。
	
	3，什么时候catch，什么时候throws 呢？
		功能内容可以解决，用catch。
		解决不了，用throws告诉调用者，由调用者解决 。
	
	4，一个功能如果抛出了多个异常，那么调用时，必须有对应多个catch进行针对性的处理。
		内部又几个需要检测的异常，就抛几个异常，抛出几个，就catch几个。
		
8 Finally 的使用 eg:ExceptionDemo5.java
	1 // return ; 					-- finally 执行
	  // System.exit(0);//退出jvm。   -- finally 不执行
	2 应用
		连接数据库 查询。Exception 关闭连接。
	3 try catch finally 代码块组合特点：
		* 1，try catch finally
		* 2, try catch(多个)当没有必要资源需要释放时，可以不用定义finally。
	    * 3, try finally 异常无法直接catch处理，但是资源需要关闭。
		 	void show()throws Exception {  // 没有catch必须throws
		 		try { 
		 			//开启资源。 throw new Exception(); 
		 		} finally { 
		 			//关闭资源。 
		 		}	  

*/



class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[1024*1024*800];//java.lang.OutOfMemoryError: Java heap space
//		arr = null;
//		System.out.println(arr[3]);
//
//
//		sleep(-5);
	}


	public static void sleep2(int time)
	{
		if(time<0)
		{
//			处理办法。
//			处理办法。
//			处理办法。
//			处理办法。
//			处理办法。
		}
		if(time>100000)
		{
//			处理办法。
//			处理办法。
//			处理办法。
//			处理办法。
//			处理办法。
//			处理办法。
		}
		System.out.println("我睡。。。"+time);

//		sleep(-5);
	}
	public static void sleep(int time)
	{
		if(time<0)
		{
//			抛出 new FuTime();//就代码着时间为负的情况，这个对象中会包含着问题的名称，信息，位置等信息。
		}
		if(time>100000)
		{
//			抛出 new BigTime();
		}
		System.out.println("我睡。。。"+time);
	}
}
/*
class FuTime
{
}
class BigTime
{
}
*/