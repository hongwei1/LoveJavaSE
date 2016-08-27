package itcastday06;

class Car1
{
	// attributes
	int tyreNumber;
	String color;

	// method
	void show()
	{
		System.out.println(this.color);
	}

	public static void main(String[] args)
	{
		new Car1().show();
	}
}

class Car
{
	// attributes
	int num;
	String color;

	// methods
	void run()
	{
		System.out.println(this.num + "..." + this.color);
	}
}

class CarDemo
{
	public static void main(String[] args)
	{
		// 在计算机中创建一个car的实例。通过new关键字。
		// Car c = new Car(); // c就是一个类类型的引用变量，指向了该类的对象。
		// c.num = 4;
		// c.color = "red";

		// c.run();//要使用对象中的内容可以通过 对象.成员 的形式来完成调用。

		// Car c1 = new Car();
		// c1.num = 4;
		// c1.color = "red";

		// Car c2 = new Car();
		// c2.num = 4;
		// c2.color = "red";

		// Car c1 = new Car();
		// Car c2 = new Car();
		// show(c1);
		// show(c2);

		/**
		 * <pre>
		 * //BK --day06 Class 3匿名对象。
		 * 没有名字的对象，其实就是定义对象的简写格式。
		 * 两种使用情况 ：
			 * 1，当对象对方法仅进行一次调用的时候，就可以简化成匿名对象。
			 * 2，匿名对象可以作为实际参数进行传递。
		 * </pre>
		 */
		// 匿名对象
		new Car().num = 5;
		new Car().color = "green";
		new Car().run();

		// Car c1 = new Car();
		// show(c1);
		CarDemo.show(new Car());
	}

	// 汽车改装厂。
	public static void show(Car c)// 类类型的变量一定指向对象。要不就是null。
	{
		c.num = 3;
		c.color = "black";
		System.out.println(c.num + "..." + c.color);
	}
}
