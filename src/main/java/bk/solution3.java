package bk;

//http://stackoverflow.com/questions/23113268/monotonic-pair-codility
class solution3
{
	// 2 returns the minimum distance between two distinct elements of a . A[0]=8 A[1]=24
	public static void main(String[] args)
	{
		int[] a = { 5, 4, -3, 2, 0, 1, -1, 0, 2, -3, 4, -5 };
		// int[] a = { 1, 2, 3, 3, 1, 3, 1 };
		// System.out.println(solution(a));// 0-M
		System.out.println(solution(a));// 0-M
	}

	public static int solution(int[] A)
	{
		int longestLength = 0;
		int curLength = 0;
		int lastPosOrNeg = 0;
		int countZeros = 0;

		for (int i = 1; i < A.length; i++)
		{
			if (A[i - 1] != 0)
			{
				countZeros = 0;
			}
			if (A[i] == 0)
			{
				countZeros++;
			}
			if (lastPosOrNeg >= 0 && A[i] <= 0)
			{
				lastPosOrNeg = -1;
			}
			else if (lastPosOrNeg <= 0 && A[i] >= 0)
			{
				lastPosOrNeg = 1;
			}
			else
			{
				if (curLength > longestLength)
				{
					longestLength = curLength;
				}
				curLength = A[i - 1] == 0 ? countZeros : 0;
				countZeros = 0;
				lastPosOrNeg = A[i];
			}
			curLength++;
		}

		return longestLength > curLength ? longestLength : curLength;
	}

	static int binarySearch(int[] array, int value)
	{
		int minIndex = 0;
		int largeIndex = array.length - 1;

		if (array[largeIndex] >= value)
		{
			return largeIndex;
		}

		while (true)
		{
			int midIndex = (minIndex + largeIndex) / 2;
			if (midIndex == array.length - 1)
			{
				return array.length - 1;
			}
			if (array[midIndex] >= value && array[midIndex + 1] < value)
			{
				return midIndex;
			}

			if (array[midIndex] < value)
			{
				largeIndex = midIndex;
			}
			else
			{
				minIndex = midIndex;
			}
		}
	}

	public static int solution2(int[] A)
	{
		// Ranking the array
		int[] rankedArray = new int[A.length];
		int maxValue = -Integer.MAX_VALUE;
		for (int index = A.length - 1; index >= 0; index--)
		{
			if (A[index] > maxValue)
			{
				maxValue = A[index];
			}
			rankedArray[index] = maxValue;
		}

		// get the result
		int result = 0;
		for (int index = 0; index < A.length; index++)
		{
			int tempValue = binarySearch(rankedArray, A[index]) - index
					+ A[binarySearch(rankedArray, A[index])] + A[index];
			if (tempValue > result)
			{
				result = tempValue;
			}
		}
		return result;
	}
}
