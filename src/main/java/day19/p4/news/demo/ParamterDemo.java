package day19.p4.news.demo;

public class ParamterDemo
{
	public static void main(String[] args)
	{
		// 1 Previous we need many different ways
		int sum0 = ParamterDemo.add(4, 5);
		System.out.println("sum=" + sum0);

		int sum1 = ParamterDemo.add(4, 5, 6);
		System.out.println("sum1=" + sum1);

		int[] arr = { 5, 1, 4, 7, 3 };
		int sum2 = ParamterDemo.add(arr);
		System.out.println("sum=" + sum2);

		// 2 Now, we need just one method, many same values.
		int sum3 = ParamterDemo.newAdd(5, 1, 4, 7, 3);
		System.out.println("sum=" + sum3);

	}

	/*
	 * 函数的可变参数。 其实就是一个数组，接收的是数组的元素。
	 *
	 * 自动将这些元素封装成数组。简化了调用者的书写。
	 *
	 * 注意：可变参数类型，必须定义在参数列表的结尾。
	 *
	 */
	public static int newAdd(int a, int... arr)
	{

		int sum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		System.out.println(arr);
		return sum;

		// return 0;
	}

	public static int add(int[] arr)
	{

		int sum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		return sum;

	}

	public static int add(int a, int b)
	{
		return a + b;
	}

	public static int add(int a, int b, int c)
	{
		return a + b + c;
	}

}
