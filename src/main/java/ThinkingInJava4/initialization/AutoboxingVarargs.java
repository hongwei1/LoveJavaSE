package ThinkingInJava4.initialization;

//: initialization/AutoboxingVarargs.java

public class AutoboxingVarargs
{
	public static void f(Integer... args)
	{
		for (Integer i : args)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		AutoboxingVarargs.f(new Integer(1), new Integer(2));
		AutoboxingVarargs.f(4, 5, 6, 7, 8, 9);
		AutoboxingVarargs.f(10, new Integer(11), 12);
	}
} /*
	 * Output: 1 2 4 5 6 7 8 9 10 11 12
	 */// :~
