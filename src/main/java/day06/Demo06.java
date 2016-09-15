package day06;

//基本数据类型参数传递
class Demo06
{
	// 引用数据类型参数传递
	static class Demo1
	{
		public int x = 3;

		public void show(Demo1 d)
		{
			d.x = 4;
		}
	}

	public static void main(String[] args)
	{
		int x = 3;
		show(x);
		System.out.println("x=" + x);

		Integer x1 = 3;
		show(x1);
		System.out.println("x=" + x1);

		Demo1 d = new Demo1();
		d.show(d);// 引用参数
		System.out.println(d.x);
	}

	public static void show(int x)
	{
		x = 4;
	}

	public static void show(Integer x)// Integer.value is final, so it is the same as int
	{
		x = 4;
	}

}
