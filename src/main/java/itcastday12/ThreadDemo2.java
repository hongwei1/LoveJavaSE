package itcastday12;

/*

5: Multithreading 1 -- 05-多线程(多线程创建的方式一-继承Thread类).avi (25:27)
		1 Thread Concept
			创建线程的目的是为了开启一条执行路径，去运行指定的代码和其他代码实现同时运行。
			而运行的指定代码就是这个执行路径的任务。
			JVM创建的主线程的任务都定义在了主函数中。
			而自定义的线程它的任务在哪儿呢？
			Thread类用于描述线程，线程是需要任务的。所以Thread类也对任务的描述。
			这个任务就通过Thread类中的run方法来体现。也就是说，run方法就是封装自定义线程运行任务的函数。
			run方法中定义就是线程要运行的任务代码。
			开启线程是为了运行指定代码，所以只有继承Thread类，并复写run方法。
			将运行的代码定义在run方法中即可。
		2 创建线程方式一：继承Thread类。
			步骤：
			1，定义一个类继承Thread类。
			2，覆盖Thread类中的run方法。
			3，直接创建Thread的子类对象创建线程。

*/
class Demo2 extends Thread // BK --day12 Multithreading 02继承Thread类
{

	Demo2(String name)
	{
		super(name);// set the name for thread object
	}

	public Demo2(ThreadGroup threadGroup, String name)
	{
		super(threadGroup, name);
	}

	@Override
	public void run()
	{
		for (int x = 0; x < 10; x++)
		{
			System.out.println("Thread name=" + Thread.currentThread().getName() + ", thread id =" + x);
		}
	}
}

class ThreadDemo2
{

	public static void main(String[] args)
	{
		Demo2 d1 = new Demo2(new ThreadGroup("hongwei"), "旺财");
		Demo2 d2 = new Demo2(new ThreadGroup("hongwei"), "小强");
		// d1.run();// 开启线程，调用run方法。
		// d2.run();

		d1.start();// 开启线程，调用run方法。
		d2.start();
		d1.run();

		System.out.println("over...." + Thread.currentThread().getName());
	}
}
