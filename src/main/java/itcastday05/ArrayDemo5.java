package itcastday05;

/*
	面试题： answer is BinarySearchInterview. only care about the arrMin.
	给定一个有序的数组，如果往该数组中存储一个元素，并保证这个数组还是有序的，
	那么个元素的存储的角标为如何获取。
	{13,15,19,28,33,45,78,106};
*/
class ArrayDemo5
{
	/*
	 * 二分查找法。
	 *
	 */
	public int halfSearch(int[] arr, int key)
	{
		int max, min, mid;
		min = 0;
		max = arr.length - 1;
		mid = (max + min) / 2;

		while (arr[mid] != key)
		{
			if (key > arr[mid])
			{
				min = mid + 1;
			}
			else if (key < arr[mid])
			{
				max = mid - 1;
			}

			if (max < min)
			{
				return -1;
			}

			mid = (max + min) / 2;
		}
		return mid;

	}

	public int halfSearch_2(int[] arr, int key)
	{
		int max, min, mid;
		min = 0;
		max = arr.length - 1;

		while (min <= max)
		{
			mid = (max + min) / 2;

			if (key > arr[mid])
			{
				min = mid + 1;
			}
			else if (key < arr[mid])
			{
				max = mid - 1;
			}
			else
			{
				return mid;
			}
		}
		return -min - 1;
	}

	/*
	 * 数组常见功能：查找。
	 */
	public int getIndex(int[] arr, int key)
	{
		for (int x = 0; x < arr.length; x++)
		{
			if (arr[x] == key)
			{
				return x;
			}
		}
		return -1;
	}
}
