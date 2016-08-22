package itcastday13;

//需求：卖票。

/**
 * way1: use the static number and extends the threads :still wrong
 *
 * <pre>
 * it use the static number to share data with four different objects.
   while the problem is still happening when add line 39
   "for (long i = -99999999; i < 99999999; i++);"
   This app needs more than one command to finish its job.
   So the -1,-2 ticket is coming .
 * </pre>
 *
 * @author zhanghongwei
 */
class TicketWay1 extends Thread
{
	private static int num = 10;

	@Override
	public void run()
	{
		while (TicketWay1.num > 0)
		{
			for (long i = -99999999; i < 99999999; i++)
			{
				;
			}
			System.out.println(Thread.currentThread().getName() + ".....sale...." + TicketWay1.num--);
		}
	}
}

class TicketDemoWay1
{
	public static void main(String[] args)
	{
		TicketWay1 t1 = new TicketWay1();// 创建1个线程任务对象。
		TicketWay1 t2 = new TicketWay1();// 创建2个线程任务对象。
		TicketWay1 t3 = new TicketWay1();// 创建3个线程任务对象。
		TicketWay1 t4 = new TicketWay1();// 创建4个线程任务对象。

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

/**
 * way2: use the Runnable interface :still wrong
 *
 * <pre>
 * If the ticket object has the relevant with the number,(kinds of tickets)
   so it should not be static.
   This way use the runnable interface ,do not use the static key words.
 *
 * </pre>
 *
 * @author zhanghongwei
 *
 */
class TicketWay2 implements Runnable
{
	private int num = 10;

	@Override
	public void run()
	{
		while (this.num > 0)
		{
			for (long i = -99999999; i < 99999999; i++)
			{
				;
			}
			System.out.println(Thread.currentThread().getName() + ".....sale...." + this.num--);
		}
	}
}

class TicketDemoWay2
{
	public static void main(String[] args)
	{
		TicketWay2 t = new TicketWay2();// 创建1个线程任务对象。

		new Thread(t).start();// call 4 个线程任务对象。
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}
}

/**
 * way 3: use synchronized code
 *
 * @author zhanghongwei
 *
 */
class TicketWay3 implements Runnable// extends Thread
{
	private int num = 10000;

	Object obj = new Object();

	@Override
	public void run()
	{
		while (true)
		{
			synchronized (this.obj)
			{
				if (this.num > 0)
				{
					try
					{
						Thread.sleep(2);
					}
					catch (InterruptedException e)
					{
					}

					System.out.println(Thread.currentThread().getName() + ".....sale...." + this.num--);
				}
			}
		}
	}
}

public class TicketDemo3
{
	public static void main(String[] args)
	{
		TicketWay3 t = new TicketWay3();// 创建一个线程任务对象。

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
