/**
ExceptionDemo.java
异常抛出过程.bmp
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
					     eg:int[] arr = new int[1024*1024*800];
					     //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
			|--2，可以处理的。Exception
						 eg: int [] arr =null; sop(arr[0]);    
						 //Exception in thread "main" java.lang.NullPointerException
			
		2 Throwable:无论是error，还是异常，问题，问题发生就应该可以抛出，让调用者知道并处理。
			该体系的特点就在于Throwable及其所有的子类都具有可抛性。
				  
		3 可抛性到底指的是什么呢？怎么体现可抛性呢？
			其实是通过两个关键字来体现的。
			throws and throw ,凡是可以被这两个关键字所操作的类和对象都具备可抛性.
				  			  
		4 该体系的特点：
			子类的后缀名都是用其父类名作为后缀，阅读性很想。
			
ExceptionDemo2.java
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
			
ExceptionDemo3.java
	异常处理trycatch.bmp
		4 自定义异常
		如果让一个类称为异常类，必须要继承异常体系，因为只有称为异常体系的子类才有资格具备可抛性。
		才可以被两个关键字所操作，throws throw
		1 定义自己的异常就extends exception
		2 在调用自定义异常的地方用throws:谁调用，谁声明throws
			eg1: public int method(int[] arr, int index) throws FuShuIndexException// throws
			eg2: public static void main(String[] args) throws FuShuIndexException 
	
	5 异常的分类：自定义异常时，要么继承Exception。要么继承RuntimeException。
		1，编译时被检测异常:只要是Exception和其子类都是，除了特殊子类RuntimeException体系。 
				这种问题一旦出现，希望在编译时就进行检测，让这种问题有对应的处理方式。
				这样的问题都可以针对性的处理。
		2，编译时不检测异常(运行时异常):就是Exception中的RuntimeException和其子类。
				这种问题的发生，无法让功能继续，运算无法进行，更多是因为调用者的原因导致的而或者引发了内部状态的改变导致的。
				那么这种问题一般不处理，直接编译通过，在运行时，让调用者调用时的程序强制停止,让调用者对代码进行修正。
		3 throws 和throw的区别。
			1，throws使用在函数上。
			   throw使用在函数内。
			2，throws抛出的是异常类，可以抛出多个，用逗号隔开。
			   throw抛出的是异常对象。
			   
ExceptionDemo4.java
	6 异常处理的捕捉形式： 可以对异常进行针对性处理的方式。
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
		
ExceptionDemo5.java
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
ExceptionTest.java
	9 异常的转换（封装）
	//把冒烟异常（电脑的）转换为 课程无法完成（公司的）
	catch (MaoYanException e)
		{
			System.out.println(e.toString());
			test();
			//可以对电脑进行维修。
			throw new NoPlanException("课时进度无法完成，原因："+e.getMessage());
		}
			 		
ExceptionDemo6.java
	10 异常的注意事项：
		1，子类在覆盖父类方法时，父类的方法如果抛出了异常，
		那么子类的方法只能抛出父类的异常或者该异常的子类。
		
		2，如果父类抛出多个异常，那么子类只能抛出父类异常的子集。
		
		
		
		简单说：子类覆盖父类只能抛出父类的异常或者子类或者子集。 
		
		注意：如果父类的方法没有抛出异常，那么子类覆盖时绝对不能抛，就只能try .


InnerClassTest.java

 */
/**
 * @author zhanghongwei
 *
 */
package day11;