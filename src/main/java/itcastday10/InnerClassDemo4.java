package itcastday10;

abstract class Demo
{
	abstract void show();
}

class Outer4
{
	int num = 5;

	public void method()
	{
		class Inner extends Demo
		{ // Formal Inner Class
			@Override
			void show()
			{
				System.out.println("Inner Class show ..." + Outer4.this.num);
			}
		}
		new Inner().show();

		new Demo()// 匿名内部类。
		{
			@Override
			void show()
			{
				System.out.println("Anonymouse Inner class show ........" + Outer4.this.num);
			}
		}.show();
	}
}

class InnerClassDemo4
{
	public static void main(String[] args)
	{
		new Outer4().method();
	}
}
