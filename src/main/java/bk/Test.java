package bk;

import commontools.Person;

class A
{
	protected static void helo()
	{
		System.out.println("helo");
	}
}

public class Test
{
	static char name;

	public static void main(String[] args)
	{
		Person[] a = new Person[5];
		A.helo();
		System.out.println(Test.name);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}
}
