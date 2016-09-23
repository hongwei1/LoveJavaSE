package Thinking4.initialization;

//: initialization/OptionalTrailingArguments.java

public class OptionalTrailingArguments
{
	static void f(int required, String... trailing)
	{
		System.out.print("required: " + required + " ");
		for (String s : trailing)
		{
			System.out.print(s + " ");
		}
		System.out.println();
	}

	static void f(String... trailing)
	{
		System.out.print("required: ");
		for (String s : trailing)
		{
			System.out.print(s + " ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		OptionalTrailingArguments.f(1, "one");
		OptionalTrailingArguments.f(2, "two", "three");
		OptionalTrailingArguments.f(0);
		OptionalTrailingArguments.f("a");
	}
} /*
	 * Output: required: 1 one required: 2 two three required: 0
	 */// :~
