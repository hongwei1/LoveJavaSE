package day28.bean;

public class Person
{
	/**
	 * Sting value : the person qualified name path
	 */
	public static String PERSON_PATH = "itcastday28.bean.Person";

	private int age;
	private String name;

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
	 * @return the name
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	public Person(String name, int age)
	{
		super();
		this.age = age;
		this.name = name;

		System.out.println("Person param run..." + this.name + ":" + this.age);

	}

	public Person()
	{
		super();

		System.out.println("person run");

	}

	public void show()
	{
		System.out.println(this.name + "...show run..." + this.age);
	}

	private void privateMethod()
	{
		System.out.println(" method run ");
	}

	public void paramMethod(String str, int num)
	{
		System.out.println("paramMethod run....." + str + ":" + num);

	}

	public static void staticMethod()
	{
		System.out.println(" static method run......");
	}
}
