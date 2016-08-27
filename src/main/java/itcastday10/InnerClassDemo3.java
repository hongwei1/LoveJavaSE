package itcastday10;

/*
内部类可以存放在局部位置上。
	内部类在局部位置上只能访问局部中被final修饰的局部变量。
*/

class Outer3
{
	int num = 3;

	public Object method()
	{

		final int x = 9; // BK --day10 Class 9Inner class 2放在局部代码块
		// BK --day10 Class 9Inner class 4注意事项 1Final -JDK1.8 支持

		class Inner
		{
			@Override
			public String toString()
			{
				return "show ..." + x;
			}
		}

		Object in = new Inner();
		return in;// 0x0045
		// in.show();
	}

}

public class InnerClassDemo3
{
	public static void main(String[] args)
	{
		Outer3 out = new Outer3();
		Object obj = out.method();
		System.out.println(obj);

	}
}