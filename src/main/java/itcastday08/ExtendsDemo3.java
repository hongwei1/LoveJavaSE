package itcastday08;

class Fu1
{
	public static void show()
	{
		System.out.println("fu show run");
	}
}

class Zi1 extends Fu1
{
	public static void show()
	{
		System.out.println("Zi1 show run");
	}
}

class ExtendsDemo3
{
	public static void main(String[] args)
	{
		// case1
		Zi1.show();

		// case2
		NewPhone p = new NewPhone();
		p.show();
		p.call();
	}
}

class Phone
{
	void call()
	{
	}

	void show()
	{
		System.out.println("number");
	}
}

class NewPhone extends Phone
{
	@Override
	void show()
	{
		System.out.println("name");
		System.out.println("pic");
		super.show();
	}
}
