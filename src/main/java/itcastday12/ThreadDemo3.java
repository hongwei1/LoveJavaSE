package itcastday12;

class Demo3 extends Thread
{
	private String name;

	Demo3(String name)
	{
		this.name = name;
	}

	@Override
	public void run()
	{
		int[] arr = new int[3];
		System.out.println(arr[3]);
		for (int x = 0; x < 10; x++)
		{
			System.out.println("....x=" + x + ".....name=" + Thread.currentThread().getName());
		}
	}
}

public class ThreadDemo3
{
	public static void main(String[] args)
	{
		Demo3 d1 = new Demo3("Íú²Æ");
		Demo3 d2 = new Demo3("xiaoqiang");
		d1.start();
		d2.start();
		System.out.println(4 / 0); // throw new ArithmeticException();
		for (int x = 0; x < 20; x++)
		{
			System.out.println(x + "...." + Thread.currentThread().getName());
		}
	}
}
