package day11;

class ExceptionDemo
{
	public static void main(String[] args)
	{
		int[] arr = new int[1024 * 1024];// java.lang.OutOfMemoryError: Java heap space
		// arr = null;
		// System.out.println(arr[3]);
		//
		//
		// sleep(-5);
	}

	public static void sleep2(int time)
	{
		if (time < 0)
		{
			// 处理办法。
			// 处理办法。
			// 处理办法。
			// 处理办法。
			// 处理办法。
		}
		if (time > 100000)
		{
			// 处理办法。
			// 处理办法。
			// 处理办法。
			// 处理办法。
			// 处理办法。
			// 处理办法。
		}
		System.out.println("我睡。。。" + time);

		// sleep(-5);
	}

	public static void sleep(int time)
	{
		if (time < 0)
		{
			// 抛出 new FuTime();//就代码着时间为负的情况，这个对象中会包含着问题的名称，信息，位置等信息。
		}
		if (time > 100000)
		{
			// 抛出 new BigTime();
		}
		System.out.println("我睡。。。" + time);
	}
}
/*
 * class FuTime { } class BigTime { }
 */