package day10;

import java.util.Iterator;

class Outer
{
	private static int num = 31;
	InnerPrivate innerPrivate = new InnerPrivate();
	Inner innerPublic = new Inner();

	public InnerPrivate getInnerPrivateInstance()
	{
		return new InnerPrivate();
	}

	class Inner// 内部类。
	{
		int test = 5;

		void show()
		{
			System.out.println("show run..." + Outer.num);
		}

		// BK --day10 Class 9Inner class 4注意事项 2Static
		// 如果内部类中定义了静态成员，该内部类也必须是静态的。
		// static int number = 5;// 或者变成final
		//
		// static void function()
		// {
		// System.out.println("function run ...." + Outer.num);
		// }

	}

	// BK --day10 Class 9Inner class 4注意事项 3Priavte 还可能访问
	private class InnerPrivate implements Iterable<Object>// 内部类。
	{
		int test = 5;

		void show()
		{
			System.out.println("show run..." + Outer.num);
		}

		@Override
		public Iterator<Object> iterator()
		{
			return null;
		}

	}

	static class InnerStatic// 内部类。
	{
		static int number = 5;

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
		// 先创建外部类对象，再创建内部类对象-不多见
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
