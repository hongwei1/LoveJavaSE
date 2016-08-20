package itcastday10;
/*
1 definition: 
	前提：
		内部类必须继承或者实现一个外部类或者接口。
	本质：匿名内部类：其实就是一个匿名子类对象，就是内部类的简写格式。 

2	格式：new 父类or接口(){子类内容}
	
3  通常的使用场景之一： InnerClassDemo5.java
	当函数参数是接口类型时，而且接口中的方法不超过三个。
	可以用匿名内部类作为实际参数进行传递
	eg:show(new Inter()

4 一道面试题：InnerClassDemo6.java

	Object obj = new Object()
	{
		public void show()
		{
			System.out.println("show run");
		}

	};
	obj.show();//因为匿名内部类这个子类对象被向上转型为了Object类型。
					//这样就不能在使用子类特有的方法了。

*/

abstract class Demo {
	abstract void show();
}

class Outer4 {
	int num = 5;

	public void method() {
		class Inner extends Demo { // Formal Inner Class
			void show() {
				System.out.println("Inner Class show ..." + num);
			}
		}
		new Inner().show();

		new Demo()// 匿名内部类。
		{
			void show() {
				System.out.println("Anonymouse Inner class show ........" + num);
			}
		}.show();
	}
}

class InnerClassDemo4 {
	public static void main(String[] args) {
		new Outer4().method();
	}
}
