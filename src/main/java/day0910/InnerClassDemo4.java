package day0910;

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
			System.out.println("Inner Class show ..." + num);
		}
	}

	Demo demo1 = new Demo() // 匿名内部类1-生成对象。
	{
		@Override
		void show()
		{
			System.out.println("Anonymouse Inner class show ........" + num);
		}
	};

	public void method()
	{
		new Inner().show(); // 1正常定义类

		new Demo() // 匿名内部类2-直接调用方法。 // 2匿名内部类
		{
			@Override
			void show()
			{
				System.out.println("Anonymouse Inner class show ........" + num);
			}
		}.show();

		demo1.show(); // 3内部类对象调用
	}
}

class InnerClassDemo4
{
	public static void main(String[] args)
	{
		new Outer4().method();
	}
}
