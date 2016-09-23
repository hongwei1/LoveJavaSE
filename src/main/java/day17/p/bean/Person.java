package day17.p.bean;

public class Person<T> implements Comparable<T>
{

	private String name;
	private int age;

	/**
	 * @return the name
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge()
	{
		return this.age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}

	/**
	 *
	 */
	public Person()
	{
		super();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Person [name=" + this.name + ", age=" + this.age + "]";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + this.age;
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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
		if (!(obj instanceof Person))
		{
			return false;
		}
		Person<?> other = (Person<?>) obj;
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

	@Override
	public int compareTo(T o)
	{
		if (o instanceof Person)
		{
			Person<?> p = (Person<?>) o;

			int temp = this.age - p.age;
			return temp == 0 ? this.name.compareTo(p.name) : temp;
		}
		else
		{
			throw new RuntimeException("");
		}

	}

}
