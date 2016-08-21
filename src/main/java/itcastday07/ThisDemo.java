package itcastday07;

class PersonThis
{
	private String name = this.name;
	private int age = 0;

	PersonThis()
	{
		name = "baby";
		age = 1;
		System.out.println("PersonThis run");
	}

	PersonThis(String name)
	{
		this();
		this.name = name;
	}

	PersonThis(String name, int age)
	{
		this();
		this.name = name;
		this.age = age;
	}

	public void speak()
	{
		System.out.println(this.name + ":" + this.age);
	}

	/*
	 * 判断是否是同龄人。
	 */
	public boolean compare(PersonThis p)
	{
		return this.age == p.age;
	}

}

class ThisDemo
{
	public static void main(String[] args)
	{

		PersonThis p1 = new PersonThis("aa", 30);//
		PersonThis p2 = new PersonThis("zz", 12);

		System.out.println(p2.compare(p1));
		new PersonThis();
		PersonThis p3 = new PersonThis("旺财", 30);
		p3.speak();
		PersonThis p4 = new PersonThis("小强");
		p4.speak();
	}
}
