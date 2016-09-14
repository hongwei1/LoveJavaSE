package algorithms;

import static algorithms.MyTools.*;

public class Algorithm10ArrayReverse
{
	public static void main(String[] args)
	{
		int[] arr = { 4, 1, 8, 7, 3, 8, 2 };
		myPrint(arr);
		reverseArray(arr);
		myPrint(arr);
	}

	private static void reverseArray(int[] arr)
	{
		for (int i = 0; i < arr.length / 2; i++)
		{
			swap(arr, i, arr.length - 1 - i);
		}
	}

}
