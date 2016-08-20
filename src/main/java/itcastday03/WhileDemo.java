package itcastday03;

class WhileDemo
{
	public static void main(String[] args)
	{
		/*
		 * while(条件表达式) { 执行语句； }
		 *
		 */
		// get the sum =0+1+2+3+4+5

		int sum = 0;
		int i = 0;
		while (i < 6)
		{
			sum += i;
			i++;
		}
		System.out.println("sum1 is " + sum);

		int x = 1;
		// while (x < 3) ;// Serious problem, no semicolon in the end.
		while (x < 3)
		{
			System.out.println("x=" + x);
			x++;
		}
	}

}
