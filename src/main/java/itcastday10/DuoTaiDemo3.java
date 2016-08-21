package itcastday10;

class Fu
{
	int num = 1;

	void show()
	{
		System.out.println("fu show " + this.num);
	}

	static void staticMethod()
	{
		System.out.println("fu static method");
	}
}

class Zi extends Fu
{
	int num = 2;

	@Override
	void show()
	{
		System.out.println("zi show " + this.num);
	}

	void show1()
	{
		System.out.println("zi show " + this.num);
	}

	static void staticMethod()
	{
		System.out.println("zi static method");
	}
}

class DuoTaiDemo3
{
	public static void main(String[] args)
	{

		// BK --day10 Class 8Polymorphism 4变量函数 1成员变量
		Zi z = new Zi();
		System.out.println(z.num); // Zi 的 num

		Fu f = new Zi();
		System.out.println(f.num); // Fu 的 num

		// BK --day10 Class 8Polymorphism 4变量函数 2成员函数
		// f.show1(); // Compile Error: no show1 in Fu
		f.show(); // zi show ： 动态绑定，只运行右边对象的成员函数。

		// BK --day10 Class 8Polymorphism 4变量函数 3静态成员函数
		Fu.staticMethod();
		Zi.staticMethod();

	}
}
