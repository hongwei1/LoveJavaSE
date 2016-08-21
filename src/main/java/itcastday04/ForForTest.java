package itcastday04;

class ForForTest
{
	public static void main(String[] args)
	{

		/*
		*****
		****
		***
		**
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
		/*
		
		*
		**
		***
		****
		*****
		
		*/
		System.out.println("my picture 2---------:");
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		/**
		 * <pre>
		54321
		5432
		543
		54
		5
		 * </pre>
		 */
		System.out.println("my picture 3---------");
		for (int i = 0; i < 5; i++)
		{
			for (int j = 5; j > i; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		/*
		 * 1 22 333 4444 55555
		 *
		 */
		System.out.println("my picture 4---------start:");
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
