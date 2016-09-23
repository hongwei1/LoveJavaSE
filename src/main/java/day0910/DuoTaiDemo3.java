package day0910;

class Fu
{
	int num = 1;
	static int numStaic = 1;

	// normal method show num
	void show()
	{
		System.out.println("fu show num = " + num);
		System.out.println("fu show static num= " + numStaic);
		show2();// private
	}

	// private method show num
	private void show2()
	{
		System.out.println("fu private method show number= " + num);
		System.out.println("fu private method show static number= " + numStaic);
	}

	// static method
	static void staticMethod()
	{
		System.out.println("fu static method");
		System.out.println("fu static method show static num= " + numStaic);
	}

}

class Zi extends Fu
{
	int num = 2;
	static int numStaic = 2;

	@Override
	void show()
	{
		System.out.println("zi show =" + num);
		System.out.println("zi show static =" + num);
		show2();
	}

	void show1()
	{
		System.out.println("zi show " + num);
		System.out.println("zi show static number=" + num);
	}

	void show2()
	{
		System.out.println("zi show " + num);
		System.out.println("zi show static number =" + num);
	}

	static void staticMethod()
	{
		System.out.println("zi static method");
		System.out.println("zi static method show static num =" + numStaic);
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
		// f.show1(); // ! Compile Error: no show1 in Fu
		f.show(); // zi show ： 动态绑定，只运行右边对象的成员函数。

		// BK --day10 Class 8Polymorphism 4变量函数 3静态成员函数
		Fu.staticMethod();
		Zi.staticMethod();

	}
}
