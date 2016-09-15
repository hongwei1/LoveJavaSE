package day03;

abstract public class Note03
{
	public static void main(String[] args)
	{
		// p23 02-Java基础语法1.ppt
		// Bitwise operators
		final int k = 3;
		int x = k;
		final int j = 2;
		System.out.println(x < j ^ x > 5);
		System.out.println(~6);
		System.out.println(Integer.toBinaryString(6));
		System.out.println(6 ^ k ^ 6);
		System.out.println(5 >> j);
		final int i = 1;
		System.out.println(-k >> i);
		System.out.println(-k / j);
		// System.out.println(3>>1);

		int s = 0;
		// three types if p29 传智播客_Java培训_毕向东_Java基础[02-Java基础语法1]
		// 1
		if (s == i)
		{

		}
		// 2
		if (s == i)
		{

		}
		else
		{

		}
		// 3
		if (s == i)
		{

		}

		else if (s == j)
		{

		}

		else if (s == k)
		{

		}
		else
		{

		}

		// switch p30 传智播客_Java培训_毕向东_Java基础[02-Java基础语法1]
		switch (s)
		{
			case 1:
				s = j;
				break;
			case 2:
				s = k;
				break;
			case 3:
				s = 4;
				break;
			default:
				break;
		}

		// three types of loop p30 传智播客_Java培训_毕向东_Java基础[02-Java基础语法1]
		// 1 while
		while (s > 0)

		{
			break;
		}
		// 2 do while
		do
		{
			break;
		}
		while (s > 0);
		// 3 for
		for (String arg : args)
		{
			break;
		}

		/*
		 * test 1: 3000米长的绳子，每天减一半，问，需要多少天，绳子会小于5米？ 3000 --1500 --750 --> /2
		 */
		int dayCount = 0;
		for (int lineLength = 3000; lineLength > 5; lineLength = lineLength / j)
		{
			dayCount++;
		}
		System.out.println("Need " + dayCount + " days ! ");

		int ropeLength = 3000;
		dayCount = 0;
		while (ropeLength > 5)
		{
			dayCount++;
			ropeLength = ropeLength / j;
		}
		System.out.println("Need " + dayCount + " days ! ");

		/*
		 * test 2: draw the following picture: ***** ***** ***** *****
		 */
		System.out.println("Test1:");
		for (int rowCount = 0; rowCount < 4; rowCount++)
		{
			for (int columnCount = 0; columnCount < 5; columnCount++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 * test 2: draw the following picture: ***** 5 **** 4 *** 3 ** *
		 */
		System.out.println("Test2:");
		for (int rowCounter = 0; rowCounter < 5; rowCounter++)
		{
			for (int columnCounter = 0; columnCounter < (5 - rowCounter); columnCounter++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 * test 3: draw the following picture: 1* ** 34 2* * * 25 3* * * 16 4* * * 25 5* ** 34 6*
		 * ****** 123456
		 */
		System.out.println("Test3:");
		for (int rowCounter = 0; rowCounter < 6; rowCounter++)
		{
			for (int columnCounter = 0; columnCounter < 6; columnCounter++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
