package itcastday07;

import itcastday07.TestInnerStatic.InnerClass;

public class TestInnerStatic
{
	public static class InnerClass // BK --day10 Class 9Inner class 1三种访问方式 1Static
	{
		public static void staticMethod()
		{
			System.out.println("private Class doSomething");
		}

		public void noStaticMethod()
		{
			System.out.println("private Class doSomething");
		}

	}

	public static void main(String[] args)
	{
		InnerClass.staticMethod();
		new InnerClass().noStaticMethod();
	}
}

class Test
{
	public static void main(String[] args)
	{
		TestInnerStatic.InnerClass.staticMethod();
		InnerClass.staticMethod();
	}
}