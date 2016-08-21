package itcastday07;

import itcastday07.TestInnerStatic.InnerClass;

class TestInnerStatic
{
	public static class InnerClass
	{
		public static void doSomething()
		{
			System.out.println("private Class doSomething");
		}
	}

	public static void main(String[] args)
	{
		InnerClass.doSomething();
	}
}

class Test
{
	public static void main(String[] args)
	{
		TestInnerStatic.InnerClass.doSomething();
		InnerClass.doSomething();

	}
}