package goodtests;

/**
 *
 * Two selling windows ,is selling the same tickets. number= 10. Should not be wrong. //TODO 8 wrong ticket shop ? how to make it re-open ???
 *
 * 需求:储户，两个，每个都到银行存钱每次存100，，共存三次。
 */
public class T10SellTickets
{
	int ticketNum = 1000;

	Object lock = new Object();

	class Seller1 implements Runnable
	{
		@Override
		public void run()
		{
			while (true)
			{
				synchronized (T10SellTickets.this.lock)
				{
					if (T10SellTickets.this.ticketNum > 0)
					{
						System.out.println(Thread.currentThread().getName() + "---" + --T10SellTickets.this.ticketNum);
						try
						{
							Thread.sleep(1);
						}
						catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
			}
		}

		class Seller2 implements Runnable
		{
			@Override
			public void run()
			{
				while (T10SellTickets.this.ticketNum > 0)
				{
					System.out.println(--T10SellTickets.this.ticketNum);
					try
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		final T10SellTickets t10SellTickets = new T10SellTickets();
		Runnable seller1 = t10SellTickets.new Seller1();
		// Runnable seller2 = t10SellTickets.new Seller2();
		new Thread(seller1).start();
		new Thread(seller1).start();
		new Thread(seller1).start();
		new Thread(seller1).start();
	}

}

class BackAccount implements Runnable
{
	Bank bank = new Bank();

	@Override
	public void run()
	{
		for (int i = 0; i < 3; i++)
		{
			this.bank.add(100);
		}
	}
}

class Bank
{
	int sum = 0;

	synchronized public void add(int money)
	{
		this.sum = this.sum + money;
		System.out.println(this.get());
	}

	public int get()
	{
		return this.sum;

	}

	public static void main(String[] args)
	{
		Runnable use1 = new BackAccount();
		new Thread(use1).start();
		new Thread(use1).start();

	}

}

class Person
{
	static String name;
	static String sex;
}

class InputPerson implements Runnable
{

	@Override
	public void run()
	{
		boolean flag = true;
		while (true)
		{
			synchronized (Person.class)
			{
				if (flag)
				{
					Person.name = "Hongwei";
					Person.sex = "Boy";
					flag = false;
				}
				else
				{
					Person.name = "Yanlu";
					Person.sex = "Girl";
					flag = true;
				}

				try
				{
					Person.class.notify();
					Person.class.wait();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}

		}
	}
}

class OutputPerson implements Runnable
{
	@Override
	public void run()
	{

		int i = 0;
		while (true)
		{

			synchronized (Person.class)
			{
				System.out.println(i++ + ":" + Person.name + ":" + Person.sex);
				try
				{
					Person.class.notify();
					Person.class.wait();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}

/**
 *
 * Two tasks,two threads. one for input value ,another for output value. Although there are two threads ,but I use the same Lock. It can control the thread goes
 * well. Firstly, write the person by one thread. and than read by another thread.
 *
 * @author zhanghongwei
 *
 */
class PersonTest
{
	public static void main(String[] args)
	{
		InputPerson inputPerson = new InputPerson();
		OutputPerson outputPerson = new OutputPerson();

		new Thread(outputPerson).start();
		new Thread(inputPerson).start();
	}
}
