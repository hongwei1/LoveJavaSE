package Thinking4.control;

import thinkinginjava4.net.mindview.util.Print;

public class IfElse2
{
	static int test(int testval, int target)
	{
		if (testval > target)
		{
			return +1;
		}
		else if (testval < target)
		{
			return -1;
		}
		else
		{
			return 0; // Match
		}
	}

	public static void main(String[] args)
	{
		Print.print(IfElse2.test(10, 5));
		Print.print(IfElse2.test(5, 10));
		Print.print(IfElse2.test(5, 5));
	}
} /*
	 * Output: 1 -1 0
	 */// :~
