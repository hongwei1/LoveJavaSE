package itcastday10;

class FuT2
{
	static
	{
		System.out.println("fu lei static construction code run ");
	}
	{
		System.out.println("fu lei construction code run ");
	}

	FuT2()
	{
		System.out.println("fu lei constructor run ");
		this.show();
	}

	void show()
	{
		System.out.println("fu show ");
	}
}

class ZiT2 extends FuT2
{
	static int num = 1;
	static
	{
		System.out.println("zi static constructor code ..." + ZiT2.num);
		ZiT2.num = 2;
	}
	{
		System.out.println("zi constructor code ..." + ZiT2.num);
		ZiT2.num = 3;
	}

	ZiT2()
	{
		super();
		System.out.println("zi constructor ..." + ZiT2.num);
	}

	@Override
	void show()
	{
		System.out.println("zi show ... " + ZiT2.num);
	}

}

public class Test2
{
	public static void main(String[] args)
	{
		new ZiT2();
	}
}