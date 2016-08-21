package itcastday09;

class Fu
{
	int num;

	Fu()
	{
		this.num = 10;
		System.out.println("A fu run");
	}

	Fu(int x)
	{
		System.out.println("B fu run..." + x);
	}
}

class Zi extends Fu
{
	int num;

	Zi()
	{
		// super();// 默认调用的就是父类中的空参数的构造函数。
		System.out.println("C zi run" + this.num);
	}

	Zi(int x)
	{
		this();
		// super();
		// super(x);
		System.out.println("D zi run " + x);
	}
}

class ExtendsDemo4
{
	public static void main(String[] args)
	{
		new Zi(6);
	}
}
