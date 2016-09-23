package day0678;

class Person2
{
	private String name = "007";
	private int age;

	// 定义一个Person类的构造函数。
	Person2()// 构造函数，而且是空参数的。
	{
		Person2 a = new Person2();
		name = "baby";
		age = 1;
		System.out.println("person run " + name);
		return;
	}

	// 如果有的孩子一出生就有名字。
	Person2(String n)
	{
		System.out.println("person run " + name);
		name = n;

	}

	Person2(String n, int a)
	{
		name = n;
		age = a;
		return;
	}

	public void setName(String n)
	{
		name = n;
	}

	public void speak()
	{
		System.out.println(name + ":" + age);
	}

}

class ConsDemo
{
	public static void main(String[] args)
	{
		// p.speak();
		Person2 p1 = new Person2("旺财");
		p1.setName("旺旺");

		p1.speak();

		Person2 p2 = new Person2("小强", 10);
		p2.speak();
	}
}
