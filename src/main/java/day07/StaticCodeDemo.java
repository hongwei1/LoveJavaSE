package day07;

/*
静态代码块。随着类的加载而执行。而且只执行一次。
作用：
	用于给类进行初始化。
*/
class StaticCode
{
	static int num;
	static
	{
		StaticCode.num = 10;
		// num *=3;
		System.out.println("hahahah");
	}

	{
		StaticCode.num = 10;
		// num *=3;
		System.out.println("heh");
	}

	StaticCode()
	{
	}

	static void show()
	{
		System.out.println(StaticCode.num);
	}
}

class PersonDemo
{
	private String name;
	{// 构造代码块。可以给所有对象进行初始化的。

		System.out.println("constructor code ");
		// cry();
	}

	static
	{
		System.out.println("static code");
	}

	PersonDemo()/// 构造代码块。可以给所有对象进行初始化的,是给对应的对象进行针对性的初始化。
	{
		name = "baby";
		System.out.println(name);
		// cry();
	}

	PersonDemo(String name)
	{
		this.name = name;
		// cry();
	}

	public void cry()
	{
		System.out.println("哇哇");

	}

	public void speak()
	{
		System.out.println("name:" + name);
	}

	static void show()
	{
		System.out.println("show run");
	}
}

class StaticCodeDemo
{
	static
	{
		System.out.println("a");
	}

	public static void main(String[] args)
	{

		PersonDemo p = null;
		PersonDemo.show();
		PersonDemo p1 = new PersonDemo();
		p1.speak();
		PersonDemo p2 = new PersonDemo("旺财");
		p2.speak();
		new PersonDemo();
		new StaticCode().show();
		new StaticCode().show();
		StaticCode.show();
		System.out.println("b");
	}
}
