package algorithms;

public class Algorithm05DrawPictures
{
	public static void main(String[] args)
	{
		/*
		 * picture 1
		 *****
		 ****
		 ***
		 **
		 *
		 * 
		 * 
		 */
		System.out.println("my picture 1---------:");
		for (int i = 0; i < 5; i++)
		{
			for (int j = i; j < 5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("my picture 1-----:");

		/*
		 * picture 2
		 *
		 **
		 ***
		 ****
		 *****
		 * 
		 * 
		 */
		System.out.println("my picture 2---------:");
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();

		}

		/*
		 * picture 3 * * * * -* * * * --* * * ---* * ----*
		 * 
		 */
		System.out.println("my picture 3 ---------:");
		for (int i = 0; i < 5; i++)
		{

			for (int j = 0; j < i; j++)
			{
				System.out.print("-");
			}
			for (int j = i; j < 5; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		/*
		 * picture 4
		 * 
		 * 1 * 5 1234 1-5 2 * * 46 1235 1-6 3 * * * 357 1246 1-7 4 * * * * 2468 1357 1-8 5 * * * * *
		 * 13579 2468 1-9 123456789
		 * 
		 */
		System.out.println("my picture 4 ---------:");
		for (int i = 0; i < 5; i++)
		{
			for (int j = i; j < 4; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();

		}

		/*
		 * picture 5 ¾Å¾Å³Ë·¨±í 1*1=1 1*2=2 2*2=4 1*3=3 2*3=6 3*3=9 1*4=4 2*4=8 3*4=12 4*4=16 1*5=5
		 * 2*5=10 3*5=15 4*5=20 5*5=25
		 */

		System.out.println("my picture 5 : ---------:");
		for (int i = 1; i <= 9; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}
}
