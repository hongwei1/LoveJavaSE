package day18.p2.bean;

public class Father extends GrandFa implements Comparable<GrandFa>
{

	public Father()
	{
		super();

	}

	public Father(String name, int age)
	{
		super(name, age);

	}

	@Override
	public String toString()
	{

		return "Student:" + this.getName() + ":" + this.getAge();
	}

}
