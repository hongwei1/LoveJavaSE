package day0910;

/*! final */class FuFinal
{
			/* ! final */void method()
	{
		// 调用了底层系统的资源。
	}
}

class ZiFinal extends FuFinal
{
	public static final double MY_PI = 3.14;
	static final int x = 7;
	final int NUMBER = 9;

	@Override
	void method()
	{
		final int x = 9;
		// !x = 9;
		System.out.println(ZiFinal.MY_PI);
	}
}

class FinalDemo
{
	public static void main(String[] args)
	{
		System.out.println(ZiFinal.MY_PI);
	}
}
