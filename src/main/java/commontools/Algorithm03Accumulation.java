package commontools;

public class Algorithm03Accumulation
{ // BK --day38 Algorithm-1求和Accumulation
	public static void main(String[] args)
	{
		/**
		 * <pre>
		 * 练习： 获取1到10 10个数字的和。
		 *
		 * 0 + 1
		 *     1 + 2
		 *         3 + 3
		 *             6 + 4
		 *                 10 + 5
		 * 思路：
		 * 1，每次参与加法的数值不确定。
		 * 2，每次的出现的和数据也不确定。
		 * 3，发现参与加法运算的数值有递增规律。
		 * 4，每一次都是加法运算在重复，并且都是和再加上下一个数值。
		 *
		 * 步骤：
		 * 1，定义一个变量，记录住参与加法运算的数据。
		 * 2，定义一个变量，记录中每一次的出现的和。
		 * 3，对于记录参与加法运算的数据进行自增。
		 * 4，因为加法运算需要重复，就要想到循环结构。
		 * </pre>
		 */

		// 累加思想-normal 。
		int sum = 0;
		for (int i = 1; i < 101; i++)
		{
			sum = sum + i;
		}
		System.out.println("sum=" + sum);

		// 累加思想-2,高斯想的
		int n = 100;
		int sum1 = 0;
		sum1 = n * (n + 1) / 2;
		System.out.println("sum1 = " + sum1);
	}

}
