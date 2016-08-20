package itcastday05;

/*
给定一个数组，对其进行反转。

{3,1,6,5,8,2} -->
{2,8,5,6,1,3};

其实就是头尾元素的位置置换。

*/

class ArrayTest
{

	public void reverseArray1(int[] arr)
	{
		for (int i = 0; i < arr.length / 2; i++)
		{
			swap(arr, i, arr.length - 1 - i);
		}
	}

	public void reverseArray(int[] arr)
	{
		for (int start = 0, end = arr.length - 1; start < end; start++, end--)
		{
			swap(arr, start, end);
		}
	}

	public void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
