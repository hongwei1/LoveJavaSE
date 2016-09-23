package Thinking4.control;

import thinkinginjava4.net.mindview.util.Print;

public class IfElse
{
	static int result = 0;

	static void test(int testval, int target)
	{
		if (testval > target)
		{
			IfElse.result = +1;
		}
		else if (testval < target)
		{
			IfElse.result = -1;
		}
		else
		{
			IfElse.result = 0; // Match
		}
	}

	public static void main(String[] args)
	{
		IfElse.test(10, 5);
		Print.print(IfElse.result);
		IfElse.test(5, 10);
		Print.print(IfElse.result);
		IfElse.test(5, 5);
		Print.print(IfElse.result);
	}
} /*
	 * Output: 1 -1 0
	 */// :~
