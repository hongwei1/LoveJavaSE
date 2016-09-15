package day10;

interface Interfacce
{
	void show1();

	void show2();
}

/**
 * 通常的使用场景之一： 当函数参数是接口类型时，而且接口中的方法不超过三个。 可以用匿名内部类作为实际参数进行传递
 */
public class InnerClassDemo5
{

	static class Inner implements Interfacce
	{
		@Override
		public void show1()
		{
			System.out.println("normal show1");
		}

		@Override
		public void show2()
		{
			System.out.println("normal show2");
		}
	}

	static public void methodNormal()
	{
		Inner innner = new Inner();
		innner.show1();
		innner.show2();
	}

	static public void methodInnerAnonymous()
	{
		Interfacce in = new Interfacce()
		{
			@Override
			public void show1()
			{
				System.out.println("methodInnerAnonymous show1");
			}

			@Override
			public void show2()
			{
				System.out.println("methodInnerAnonymous show2");
			}

		};
		in.show1();
		in.show2();
	}

	public static void show(Interfacce in)
	{
		in.show1();
		in.show2();
	}

	public static void main(String[] args)
	{
		InnerClassDemo5.show(new Interfacce()
		{
			@Override
			public void show1()
			{
				System.out.println("show1");
			}
	
			@Override
			public void show2()
			{
				System.out.println("show2");
			}
		});
	
		InnerClassDemo5.methodNormal();
		InnerClassDemo5.methodInnerAnonymous();
	
	}
}
