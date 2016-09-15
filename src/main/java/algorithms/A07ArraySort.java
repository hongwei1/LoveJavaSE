package algorithms;

//BK --day05 8Array 2A07Sort
public class A07ArraySort
{
	public static void main(String[] args)
	{
		int[] arr = new int[] { 34, 19, 11, 109, 3, 56 };

		A07ArraySort.selectSort(arr);

		arr = new int[] { 34, 19, 11, 109, 3, 56 };
		A07ArraySort.selectSortHighEffience(arr);

		arr = new int[] { 34, 19, 11, 109, 3, 56 };
		A07ArraySort.bubbleSort2(arr);
	}

	private static void bubbleSort1(int[] arr)
	{
		// from end to start
		for (int i = arr.length - 1; i >= 0; i--)
		{
			for (int j = arr.length - 1; j >= 1; j--)
			{
				if (arr[j] < arr[j - 1])
				{
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

	private static void bubbleSort2(int[] arr)
	{
		// from start to end
		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int j = 0; j < arr.length - 1 - i; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	private static void selectSortHighEffience(int[] arr)
	{
		for (int i = 0; i < arr.length - 1; i++)
		{
			// get the outside circle value
			int temp = arr[i];
			int index = i;
			// change the inside circle valune
			for (int j = 1 + i; j < arr.length; j++)
			{
				if (temp < arr[j])
				{
					temp = arr[j];
					index = j;
				}
			}
			// change the outside value
			if (index != i)
			{
				int temp1 = arr[i];
				arr[i] = arr[index];
				arr[index] = temp1;
			}

		}
	}

	private static void selectSort(int[] arr)
	{
		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int j = 1 + i; j < arr.length; j++)
			{
				if (arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
