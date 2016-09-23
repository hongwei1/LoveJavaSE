package day1234;

/*
	同步函数的使用的锁是this；

	同步函数和同步代码块的区别：同步函数的锁是固定的this。

	同步代码块的锁是任意的对象。

	建议使用同步代码块。
*/
class Ticket2 implements Runnable
{
	private int num = 10;
	Object obj = new Object();
	boolean flag = true;

	@Override
	public void run()
	{
		// System.out.println("this:"+this);

		if (this.flag)
		{
			while (true)
			{
				synchronized (this) // this.obj
				{
					if (this.num > 0)
					{
						try
						{
							Thread.sleep(10);
						}
						catch (InterruptedException e)
						{
						}
						System.out.println(Thread.currentThread().getName() + ".....obj...." + this.num--);
					}
				}
			}
		}
		else
		{
			while (true)
			{
				this.show();
			}
		}
	}

	public synchronized void show()
	{
		if (this.num > 0)
		{
			try
			{
				Thread.sleep(10);
			}
			catch (InterruptedException e)
			{
			}

			System.out.println(Thread.currentThread().getName() + ".....function...." + this.num--);
		}
	}
}

/**
 * 线程1是同步代码块 ，线程2同步函数。要不是同一个this锁就会出现重复。 通过换锁Object obj = new Object(); 来验证函数正确。
 *
 * @author zhanghongwei
 *
 */
public class SynFunctionLockDemo
{
	public static void main(String[] args)
	{
		Ticket2 t = new Ticket2();

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		t1.start();
		try
		{
			Thread.sleep(10);
		}
		catch (InterruptedException e)
		{
		}
		t.flag = false;
		t2.start();
	}
}
