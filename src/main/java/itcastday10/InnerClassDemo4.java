package itcastday10;

abstract class Demo
{
	abstract void show();
}

class Outer4
{
	int num = 5;

	class Inner extends Demo // 正常内部类。
	{
		@Override
		void show()
		{
			System.out.println("Inner Class show ..." + Outer4.this.num);
		}
	}

	Demo demo1 = new Demo() // 匿名内部类1-生成对象。
	{
		@Override
		void show()
		{
			System.out.println("Anonymouse Inner class show ........" + Outer4.this.num);
		}
	};

	public void method()
	{
		new Inner().show();

		new Demo() // 匿名内部类2-直接调用方法。
		{
			@Override
			void show()
			{
				System.out.println("Anonymouse Inner class show ........" + Outer4.this.num);
			}
		}.show();

		this.demo1.show();
	}
}

class InnerClassDemo4
{
	public static void main(String[] args)
	{
		new Outer4().method();
	}
}
