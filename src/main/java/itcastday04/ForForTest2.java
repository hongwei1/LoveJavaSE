package itcastday04;

class ForForTest2
{
	public static void main(String[] args)
	{

		/**
		 * <pre>
		* * * * *
		-* * * *
		--* * *
		---* *
		----*
		 * </pre>
		 */
		System.out.println("my picture 1 : right algorithm---------start:");
		for (int i = 0; i < 5; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < 5 - i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("my picture 1:wrong algorithm---------");

		/**
		 * <pre>
		1 ----*     5     1234  1-5
		2 ---* *    46    1235  1-6
		3 --* * *   357   1246  1-7
		4 -* * * *  2468  1357  1-8
		5 * * * * * 13579 2468  1-9
		  123456789
		 * </pre>
		 */

		System.out.println("my picture 2---------:");
		for (int j = 0; j < 5; j++)
		{
			for (int j2 = 0; j2 < 4 - j; j2++)
			{
				System.out.print(" ");
			}
			for (int j2 = 0; j2 <= j; j2++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
