package ThinkingInJava4.operators;

import thinkinginjava4.net.mindview.util.Print;

public class ShortCircuit
{
	static boolean test1(int val)
	{
		Print.print("test1(" + val + ")");
		Print.print("result: " + (val < 1));
		return val < 1;
	}

	static boolean test2(int val)
	{
		Print.print("test2(" + val + ")");
		Print.print("result: " + (val < 2));
		return val < 2;
	}

	static boolean test3(int val)
	{
		Print.print("test3(" + val + ")");
		Print.print("result: " + (val < 3));
		return val < 3;
	}

	public static void main(String[] args)
	{
		boolean b = ShortCircuit.test1(0) && ShortCircuit.test2(2) && ShortCircuit.test3(2);
		Print.print("expression is " + b);
	}
} /*
	 * Output: test1(0) result: true test2(2) result: false expression is false
	 */// :~
