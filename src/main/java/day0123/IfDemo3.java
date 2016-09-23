package day0123;

class IfDemo3
{
	public static void main(String[] args)
	{
		/*
		 * if语句第三种格式： if(条件表达式) { 执行语句； } else if (条件表达式) { 执行语句； } else if (条件表达式) …… else { 执行语句；
		 * }
		 *
		 */
		// 1 basic function --only one sentence
		int x = 3;
		if (x > 3)
		{
			System.out.println("a");
		}
		else if (x > 2)
		{
			System.out.println("b");
		}
		else if (x > 1)
		{
			System.out.println("c");
		}
		else
		{
			System.out.println("d");
		}

		// 2 different kind -- have three sentences
		int y = 3;
		if (y > 1)
		{
			System.out.println("a1");
		}
		if (y > 2)
		{
			System.out.println("b1");
		}
		if (y > 3)
		{
			System.out.println("c1");
		}
		else
		{
			System.out.println("d1");
		}

		// 3 nesting use if ,different types
		if (x == 1)
		{
			if (y == 1)
			{
				System.out.println("a");
			}
			else
			{
				System.out.println("b");
			}
		}
		else
		{
			if (y == 1)
			{
				System.out.println("c");
				System.out.println("d");
			}
		}

		// 4 notice: there is no ";" in the end.
		if (false)
		{
			;
		}

		{// 5 local code ,life cycle
			int m = 89;
			System.out.println("Hello World!..." + m);
		}
		// ! System.out.println("over....." + m);

	}
}
