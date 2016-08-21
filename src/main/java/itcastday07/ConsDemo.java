package itcastday07;

class Person
{
	private String name = "007";
	private int age;

	// 定义一个Person类的构造函数。
	Person()// 构造函数，而且是空参数的。
	{
		Person a = new Person();
		name = "baby";
		age = 1;
		System.out.println("person run " + name);
	}

	// 如果有的孩子一出生就有名字。
	Person(String n)
	{
		System.out.println("person run " + name);
		name = n;

	}

	Person(String n, int a)
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
		Person p1 = new Person("旺财");
		p1.setName("旺旺");

		p1.speak();

		Person p2 = new Person("小强", 10);
		p2.speak();
	}
}
