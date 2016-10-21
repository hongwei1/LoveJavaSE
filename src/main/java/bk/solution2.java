package bk;

class solution2
{

	// public int[] twoSum(int[] nums, int target)
	// {
	// int[] res = new int[2];
	// for (int i = 0; i < nums.length; i++)
	// {
	// for (int j = i; j < nums.length; i++)
	// {
	// if (nums[i] + nums[j] == target)
	// {
	// res[0] = nums[i];
	// res[1] = nums[j];
	// }
	// }
	// }
	// return res;
	// }
	//
	// public static int findMinDistance(int[] A)
	// {
	// int length = A.length;
	// int smallest = Integer.MAX_VALUE - 1;
	// int smaller = Integer.MAX_VALUE;
	//
	// for (int i = 0; i < length; i++)
	// {
	// if (A[i] <= smallest)
	// {
	// smaller = smallest;
	// smallest = A[i];
	// }
	// else if (A[i] < smaller)
	// {
	// smaller = A[i];
	// }
	// }
	// return smaller - smallest;
	// }

	public static void main(String[] args)
	{
		solution2 solution2 = new solution2();
		System.out.println(solution2.solution("aa", "aaa"));
		System.out.println(solution2.solution("form", "from"));
		System.out.println(solution2.solution("o", "odd"));
		System.out.println(solution2.solution("aaa", "aa"));
		System.out.println(solution2.solution("aaa", "aaa"));
	}

	public String solution(String S, String T)
	{
		if (S.equals(T))
		{
			return "NOTHING";
		}
		String result = checkInsert(S, T);
		if (result != null)
		{
			return "INSERT " + result;
		}
		result = checkDelete(S, T);
		if (result != null)
		{
			return "DELETE " + result;
		}
		result = checkSwap(S, T);
		if (result != null)
		{
			return "SWAP " + result;
		}
		return "IMPOSSIBLE";
	}

	private String checkInsert(final String S, final String T)
	{
		if (S.length() + 1 != T.length())
		{
			return null;
		}
		final char[] SArray = S.toCharArray();
		final char[] TArray = T.toCharArray();

		for (int TIndex = 0; TIndex < TArray.length; TIndex++)
		{
			if (TIndex == TArray.length - 1)
			{
				final String SInsert = S + TArray[TIndex];
				if (SInsert.equals(T))
				{
					return String.valueOf(TArray[TIndex]);
				}
				else
				{
					return null;
				}
			}
			if (SArray[TIndex] != TArray[TIndex])
			{
				final String SInsert = S.substring(0, TIndex) + TArray[TIndex]
						+ S.substring(TIndex, SArray.length);
				if (SInsert.equals(T))
				{
					return String.valueOf(TArray[TIndex]);
				}
				else
				{
					return null;
				}
			}
			else
			{
				continue;
			}
		}

		return null;
	}

	private String checkDelete(final String S, final String T)
	{
		if (S.length() - 1 != T.length())
		{
			return null;
		}
		final char[] SArray = S.toCharArray();
		final char[] TArray = T.toCharArray();

		for (int SIndex = 0; SIndex < SArray.length; SIndex++)
		{
			if (SIndex == SArray.length - 1)
			{
				final String SDelete = S.substring(0, SArray.length - 1);
				if (SDelete.equals(T))
				{
					return String.valueOf(SArray[SIndex]);
				}
				else
				{
					return null;
				}
			}
			if (SArray[SIndex] != TArray[SIndex])
			{
				final String SDelete = S.substring(0, SIndex)
						+ S.substring(SIndex + 1, SArray.length);
				if (SDelete.equals(T))
				{
					return String.valueOf(SArray[SIndex]);
				}
				else
				{
					return null;
				}
			}
			else
			{
				continue;
			}
		}
		return null;
	}

	private String checkSwap(final String S, final String T)
	{
		if (S.length() != T.length())
		{
			return null;
		}
		final char[] SArray = S.toCharArray();
		for (int SIndex = 0; SIndex < SArray.length - 1; SIndex++)
		{
			swap(SArray, SIndex, SIndex + 1);
			if (T.equals(new String(SArray)))
			{
				return SArray[SIndex + 1] + " " + SArray[SIndex];
			}
			swap(SArray, SIndex, SIndex + 1); // reverse back to normal
		}
		return null;
	}

	private void swap(char[] arr, int i, int j)
	{
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
