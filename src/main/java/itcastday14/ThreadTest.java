package itcastday14;

//1 如果错误 错误发生在哪一行？错误在第一行，应该被abstract修饰

/*class Test implements Runnable
{
	public void run(Thread t)
	{}
}*/

class ThreadTest
{
	public static void main(String[] args)
	{
		// 2 运行那个run？
		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				System.out.println("runnable run");
			}
		})
		{
			@Override
			public void run()
			{
				System.out.println("subThread run");
			}
		}.start();

		new Thread()
		{
			@Override
			public void run()
			{
				for (int x = 0; x < 50; x++)
				{
					System.out.println(Thread.currentThread().getName() + "....x=" + x);
				}

			}
		}.start();

		for (int x = 0; x < 50; x++)
		{
			System.out.println(Thread.currentThread().getName() + "....y=" + x);
		}

		Runnable r = new Runnable()
		{
			@Override
			public void run()
			{
				for (int x = 0; x < 50; x++)
				{
					System.out.println(Thread.currentThread().getName() + "....z=" + x);
				}
			}
		};
		new Thread(r).start();

	}
}
