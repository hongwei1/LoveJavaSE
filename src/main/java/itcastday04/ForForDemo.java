package itcastday04;

class ForForDemo
{
	public static void main(String[] args)
	{
		// 大圈套小圈思想。
		/*
		*****
		*****
		*****
		*****
		*/
		for (int i = 0; i <= 4; i++)
		{
			for (int j = 0; j <= 5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
