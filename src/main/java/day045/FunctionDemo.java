package day045;

class FunctionDemo
{

	// 加法运算。两个小数的和。
	public static void add(Double... arr)
	{
		double sum = 0;
		for (Double double1 : arr)
		{
			sum += double1;
		}
		System.out.println(sum);
	}

	// 加法运算。两个整数的和。
	public static int add(int a, int b) // BK --day04 7Functions 1Overload
	{
		return a + b;
	}

	// 加法运算，三个整数的和。
	public static int add(int a, int b, int c)
	{
		return add(a, b) + c;
	}

	public static void main(String[] args)
	{
		// add(4, 6, 9);
		// add(4, 6, 9, 10, 11);
		// add(4.12, 6.12);
		System.out.println(recursionMethod(5));
		System.out.println(fibonacciMethod(400));
		System.out.println(fibonacciForMethod(400));
	}

	private static void add(Integer... arr)
	{
		int sum = 0;
		for (Integer element : arr)
		{
			sum += element;
		}
		System.out.println(sum);
	}

	// BK --day04 7Functions 2递归1
	// n!=n*n-1*n-2*...*1
	private static long recursionMethod(long b)
	{
		if (b == 1)
		{
			return 1;
		}
		else
		{
			return recursionMethod(b - 1) * b;
		}
	}

	// BK --day04 7Functions 2递归2
	// fn=f(n-1)+f(n-2) f1=f2=1
	static long fibonacciMethod(long b)
	{

		if (b <= 0)
		{
			return -1;
		}

		if (b == 1 || b == 2)
		{
			return 1;
		}
		else
		{
			return fibonacciMethod(b - 1) + fibonacciMethod(b - 2);
		}
	}

	static long fibonacciForMethod(long b)
	{
		if (b <= 0)
		{
			return -1;
		}
		if (b == 1 || b == 2)
		{
			return 1;
		}
		int f = 0;
		int f1 = 1;
		int f2 = 1;

		for (long i = 2; i < b; i++)
		{
			f = f1 + f2;
			f1 = f2;
			f2 = f;
		}
		return f;
	}

	// BK --day04 7Functions 2递归3
	// PrintN
	static void printN(int N)
	{
		for (int i = 0; i < N; i++)
		{
			System.out.println(i);
		}
	}

	static void recusivePrintN(int N)
	{
		if (N == 0)
		{
			System.out.println(0);
		}
		else
		{
			recusivePrintN(N - 1);
			System.out.println(N);
		}
	}
}
