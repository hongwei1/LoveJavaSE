package itcastday03;

class ForTest
{
	public static void main(String[] args)
	{
		/*
		 * 用for完成累加。
		 */
		int sum = 0;
		for (int i = 0; i < 10; i++)
		{
			sum += i;
		}

		System.out.println("sum=" + sum);

		// for get the 6 times from 1--100
		int sixCounter = 0;

		for (int i = 1; i < 100; i++)
		{
			if (i % 6 == 0)
			{
				sixCounter++;
			}
		}
		System.out.println("six times is " + sixCounter);

		/**
		 * <pre>
		 * for和while的特点：
			1,for和while可以互换。
			2,格式上的不同，在使用上有点小区别。 如果需要通过变量来对循环进行控制，该变量只作为循环增量存在时，区别就体现出来了。
			3,they are mostly the same ,just make a difference for the people to read.
		 * </pre>
		 */

		// 打印1~10十个数字
		int x = 1;
		while (x < 10)
		{
			System.out.println("x=" + x);
			x++;
		}
		System.out.println("x====" + x);

		int y = 1;
		for (; y < 10;)
		{
			System.out.println("y=" + y);
			y++;
		}
		System.out.println("y====" + y);
		// 无限循环最简单的形式。
		// while(true){}

		// for(;;){}

	}
}
