package itcastday18.p2.bean;

public class Student extends Person implements Comparable<Person>
{

	public Student()
	{
		super();

	}

	public Student(String name, int age)
	{
		super(name, age);

	}

	@Override
	public String toString()
	{

		return "Student:" + this.getName() + ":" + this.getAge();
	}

}
