package algorithms;

public class Person implements Comparable<Person>
{

	private String name;
	private int age;
	private Person person;

	public Person()
	{
		super();

	}

	public Person(String name, int age, Person person)
	{
		super();
		this.name = name;
		this.age = age;
		this.person = person;
	}

	public Person(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person p)
	{

		// Person p = (Person)obj;
		int temp = this.age - p.age;
		return temp == 0 ? this.name.compareTo(p.name) : temp;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + this.age;
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (this.getClass() != obj.getClass())
		{
			return false;
		}
		Person other = (Person) obj;
		if (this.age != other.age)
		{
			return false;
		}
		if (this.name == null)
		{
			if (other.name != null)
			{
				return false;
			}
		}
		else if (!this.name.equals(other.name))
		{
			return false;
		}
		return true;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return this.age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{

		return "Person:" + this.getName() + ":" + this.getAge();
	}

}
