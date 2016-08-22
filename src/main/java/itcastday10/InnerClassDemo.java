package itcastday10;

class Outer
{
	private static int num = 31;

	class Inner// 内部类。
	{
		void show()
		{
			System.out.println("show run..." + Outer.num);
		}
		/*
		 * static void function()//如果内部类中定义了静态成员，该内部类也必须是静态的。 { System.out.println("function run ...."+num); }
		 */
	}

	static class InnerStatic// 内部类。
	{
		void show()
		{
			System.out.println("show run..." + Outer.num);
		}

		public static void showStatic()
		{
		}
	}

	public void method()
	{
		Inner in = new Inner();
		in.show();
	}

	static public void methodStatic()
	{
		Inner in = new Outer().new Inner();
	}
}

class InnerClassDemo
{
	public static void main(String[] args)
	{
		Outer out = new Outer();
		Outer.methodStatic();

		// BK --day10 Class 9Inner class 1三种访问方式
		// 直接访问外部类中的内部类中的成员-不多见
		Outer.Inner in1 = new Outer().new Inner();
		in1.show();

		// 如果内部类是静态的。 相当于一个外部类，不依赖外部类的对象了。
		Outer.InnerStatic innerStatic = new Outer.InnerStatic();
		// InnerStatic innerStatic = new InnerStatic();
		innerStatic.show();

		// 如果内部类是静态的，成员是静态的。-常见
		Outer.InnerStatic.showStatic();

	}
}
