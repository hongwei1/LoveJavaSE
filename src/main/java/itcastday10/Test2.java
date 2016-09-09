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
		show();
	}

	void show()
	{
		System.out.println("fu show ");
	}
}

class ZiT2 extends FuT2
{
	int numNormal = 1;
	static int numStatic = 1;
	static
	{
		System.out.println("zi static constructor code ..." + ZiT2.numStatic);
		ZiT2.numStatic = 2;
	}
	{
		System.out.println("zi constructor code ..." + ZiT2.numStatic);
		ZiT2.numStatic = 3;
		numNormal = 2;
	}

	ZiT2()
	{
		super();
		System.out.println("zi constructor ..." + ZiT2.numStatic);
	}

	@Override
	void show()
	{
		System.out.println("zi show ... " + ZiT2.numStatic);
	}

}

public class Test2
{
	public static void main(String[] args)
	{
		System.out.println("----new1 object");
		new ZiT2();
		System.out.println("----new2 object");
		new ZiT2();
	}
}