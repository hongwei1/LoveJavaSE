package goodtests;

/**
 * <pre>
 * 两个生产者，两个消费者，同一个烤鸭厂。
 *
 * 1 生产者只能生产最多100只，放在一个数组里面，两个生产者可以一起生产。
 * 2 只要有duck，消费者就可以买，两个消费者可以一直买到0。
 * 3 不相互影响。
 *
 * </pre>
 *
 * @author zhanghongwei
 *
 */
public class T11ManyProduceManyBuyers
{
	public static void main(String[] args)
	{
		Ducks r = new Ducks();

		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);

		Thread t0 = new Thread(pro);
		Thread t1 = new Thread(pro);

		Thread t2 = new Thread(con);
		Thread t3 = new Thread(con);

		t0.start();
		t1.start();
		t2.start();
		t3.start();

	}
}

/**
 * Ducks 表示库存的ducks。生产者，消费者共享一个duck类。
 *
 * @author zhanghongwei
 *
 */
class Ducks
{
	/**
	 * The max number of ducks will be created ,now is 100
	 */
	final int TOTAL_LIMITED_NUMBER = 3;
	/**
	 * 库存的duck 数量，生产者会累加，消费者会减少
	 */
	int duckNumber = 0;

	/**
	 * 生产者生产duck，每次生产一个。
	 *
	 * @throws InterruptedException
	 */
	public synchronized void makeDuck()
	{
		if (this.duckNumber < this.TOTAL_LIMITED_NUMBER)
		{
			this.duckNumber++;
			// 线程n make the i ducks.
			System.out.println(Thread.currentThread().getName() + "make the " + this.duckNumber + "ducks");
			// 每次生产就唤醒别的线程
			this.notify();
			// 然后自己release 优先权
			try
			{
				this.wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			this.notify();
			try
			{
				this.wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}

		}
	}

	/**
	 * 消费者买duck，每次买一个。
	 */
	public synchronized void sellDuck()
	{
		if (this.duckNumber > 0)
		{
			// 线程n buy the i ducks.
			System.out.println(Thread.currentThread().getName() + "sell the " + this.duckNumber + "ducks");
			this.duckNumber--;
			// 每次消费就唤醒别的线程
			this.notify();
			// 然后自己release 优先权
			try
			{
				this.wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			this.notify();
			try
			{
				this.wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}

		}

	}
}

class Producer implements Runnable
{

	Ducks ducks;

	public Producer(Ducks r)
	{
		this.ducks = r;
	}

	@Override
	public void run()
	{
		while (true)
		{
			this.ducks.makeDuck();
		}
	}

}

class Consumer implements Runnable
{
	Ducks ducks;

	public Consumer(Ducks r)
	{
		this.ducks = r;
	}

	@Override
	public void run()
	{
		while (true)
		{
			this.ducks.sellDuck();
		}
	}

}