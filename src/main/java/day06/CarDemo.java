package day06;

class Car1
{
	// attributes
	int tyreNumber;
	String color;

	// method
	void show()
	{
		System.out.println(color);
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
		System.out.println(num + "..." + color);
	}
}

class CarDemo
{
	public static void main(String[] args)
	{
		/**
		 * <pre>
		 * //BK --day06 Class 3匿名对象
		 * 没有名字的对象，其实就是定义对象的简写格式
		 * 两种使用情况
			 * 1，当对象对方法仅进行1次调用的时,就可以简化成匿名对象
			 * 2，匿名对象可以作为实际参数进行传递
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

	public static void show(Car c)
	{
		c.num = 3;
		c.color = "black";
		System.out.println(c.num + "..." + c.color);
	}
}
