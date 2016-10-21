package bk;

class solution5
{
	public static void main(String[] args)
	{
		solution5 solution2 = new solution5();
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
		final char[] SAsCharArr = S.toCharArray();
		final char[] TAsCharArr = T.toCharArray();

		for (int TCharIndex = 0; TCharIndex < TAsCharArr.length; TCharIndex++)
		{
			if (TCharIndex == TAsCharArr.length - 1)
			{ // deal with corner case, at last char in T
				final String SWithCharInserted = S + TAsCharArr[TCharIndex];
				if (SWithCharInserted.equals(T))
				{
					return String.valueOf(TAsCharArr[TCharIndex]);
				}
				else
				{
					return null;
				}
			}
			if (SAsCharArr[TCharIndex] != TAsCharArr[TCharIndex])
			{
				final String SWithCharInserted = S.substring(0, TCharIndex) + TAsCharArr[TCharIndex]
						+ S.substring(TCharIndex, SAsCharArr.length);
				if (SWithCharInserted.equals(T))
				{
					return String.valueOf(TAsCharArr[TCharIndex]);
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
		final char[] SAsCharArr = S.toCharArray();
		final char[] TAsCharArr = T.toCharArray();

		for (int SCharIndex = 0; SCharIndex < SAsCharArr.length; SCharIndex++)
		{
			if (SCharIndex == SAsCharArr.length - 1)
			{ // deal with corner case, at last char in S
				final String SWithCharDeleted = S.substring(0, SAsCharArr.length - 1);
				if (SWithCharDeleted.equals(T))
				{
					return String.valueOf(SAsCharArr[SCharIndex]);
				}
				else
				{
					return null;
				}
			}
			if (SAsCharArr[SCharIndex] != TAsCharArr[SCharIndex])
			{
				final String SWithCharDeleted = S.substring(0, SCharIndex)
						+ S.substring(SCharIndex + 1, SAsCharArr.length);
				if (SWithCharDeleted.equals(T))
				{
					return String.valueOf(SAsCharArr[SCharIndex]);
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
		final String[] SArray = S.split("");
		for (int SIndex = 0; SIndex < SArray.length - 1; SIndex++)
		{
			swap(SArray, SIndex, SIndex + 1);
			if (T.equals(SArray.toString()))
			{
				return SArray[SIndex + 1] + " " + SArray[SIndex];
			}
			swap(SArray, SIndex, SIndex + 1); // reverse back to normal
		}
		return null;
	}

	private void swap(String[] arr, int i, int j)
	{
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
