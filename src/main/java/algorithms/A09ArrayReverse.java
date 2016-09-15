package algorithms;

public class A09ArrayReverse
{
	public static void main(String[] args)
	{
		int[] arr = { 4, 1, 8, 7, 3, 8, 2 };
		MyTools.myPrint(arr);
		reverseArray(arr);
		MyTools.myPrint(arr);
	}

	private static void reverseArray(int[] arr)
	{
		for (int i = 0; i < arr.length / 2; i++)
		{
			MyTools.swap(arr, i, arr.length - 1 - i);
		}
	}

}
