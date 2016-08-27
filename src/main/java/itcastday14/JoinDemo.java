package itcastday14;

class Demo implements Runnable
{
	@Override
	public void run()
	{
		for (int x = 0; x < 50; x++)
		{
			System.out.println(Thread.currentThread().toString() + "....." + x);
			Thread.yield(); // 释放执行权，不放执行资格，不放锁。别的线程和自己重新compete
		}
	}
}

class JoinDemo
{
	public static void main(String[] args) throws Exception
	{
		Demo d = new Demo();

		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);

		t1.start();

		t2.start();
		// t2.setPriority(Thread.MAX_PRIORITY);

		// t1.join();// t1线程要申请加入进来，运行。临时加入一个线程运算时可以使用join方法。
		// Main线程已经放弃执行权，在等t1执行，t1执行完，main才开始执行。

		for (int x = 0; x < 50; x++)
		{
			// System.out.println(Thread.currentThread() + "....." + x);
		}
	}
}
