package itcastday12;

/*
1:definition  -- 01-多线程(概述).avi (12: 6)
	进程：正在进行中的程序(直译). 只分配开应用程序的应用空间
	线程：就是进程中一个负责程序执行的控制单元(执行路径)；一个进程中可以多执行路径，称之为多线程。
		 每一个线程都有自己运行的内容。这个内容可以称为线程要执行的任务。
	关系：一个进程中至少要有一个线程，开启多个线程是为了同时运行多部分代码。

2：Pro and Con -- 02-多线程(好处与弊端).avi ( 9:31)
	好处：解决了多部分同时运行的问题。
	弊端：线程太多回到效率的降低。其实应用程序的执行都是cpu在做着快速的切换完成的。这个切换是随机的。

3: JVM multithreading --  03-多线程(JVM中的多线程解析).avi (17:13)
	JVM启动时就启动了多个线程，至少有两个线程可以分析的出来。
		1，执行main函数的线程，
				该线程的任务代码都定义在main函数中。
		2，负责垃圾回收的线程。
	eg: ThreadDemo 中有main和多个匿名对象。匿名对象一创建就是垃圾，就等着被回收的。
		tips:垃圾回收还没结束，虚拟机就可能直接关闭，就不等垃圾回收了，所有有时只输出一个或两个值（ ThreadDemo 中的结果）
*/

class Demo extends Object
{
	public void finalize()
	{
		System.out.println("demo ok");
	}
}


class  ThreadDemo
{
	public static void main(String[] args) 
	{

		System.out.println("Hello World!");
		new Demo();
		new Demo();
		new Demo();
		System.gc();
	}
}
