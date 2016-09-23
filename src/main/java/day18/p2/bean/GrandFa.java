package day18.p2.bean;

public class GrandFa implements Comparable<GrandFa>
{

	private String name;
	private int age;

	public GrandFa()
	{
		super();

	}

	public GrandFa(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(GrandFa p)
	{
		int temp = this.name.compareTo(p.name);
		return temp == 0 ? this.age - p.age : temp;
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
		GrandFa other = (GrandFa) obj;
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
