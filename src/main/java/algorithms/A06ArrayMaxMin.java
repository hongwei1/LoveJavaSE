package algorithms;

//BK --day05 8Array 2A06Max
public class A06ArrayMaxMin
{
	public static void main(String[] args)
	{
		int[] arr = new int[] { 34, 19, 11, 109, 3, 56 };
		// lecture
		int max = getMaxValue(arr);
		System.out.println("max=" + max);
		int max_2 = getMaxIndex(arr);
		System.out.println("max=" + max_2);
	}

	public static int getMaxValue(int[] arr)
	{
		// 定义变量记录较大的值。
		int maxElement = arr[0];// 初始化为数组中的任意一个元素。
		for (int x = 1; x < arr.length; x++)
		{
			if (arr[x] > maxElement)
			{
				maxElement = arr[x];
			}
		}
		return maxElement;
	}

	public static int getMaxIndex(int[] arr)
	{
		// 定义变量记录较大的值。
		int maxIndex = 0;// 初始化为数组中任意一个角标。
		for (int x = 1; x < arr.length; x++)
		{
			if (arr[x] > arr[maxIndex])
			{
				maxIndex = x;
			}
		}
		return arr[maxIndex];
	}
}
