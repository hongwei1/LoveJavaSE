package bk;

class solution
{
	// 2 returns the minimum distance between two distinct elements of a . A[0]=8 A[1]=24
	public static void main(String[] args)
	{
		// int[] a = { 1, 2, 2 };
		int[] a = { 5, 4, -3, 2, 0, 1, -1, 0, 2, -3, 4, -5 };
		// System.out.println(solution(3, a));// 0-M
		System.out.println(solution("we test coders"));// 0-M
	}

	public static String solution(String S)
	{
		// String res = "";
		// final int length = S.length();
		// String[] wordsStringArray = S.split(" "); // we test coders-->ew tset sredoc
		// int wordsTotalNumber = wordsStringArray.length;
		// String reverseString = "";
		// for (int i = 0; i < wordsTotalNumber; i++)
		// {
		// if (i > 0)
		// {
		// reverseString = reverseString + ' ';
		// }
		// reverseString = reverseString
		// + new StringBuilder(wordsStringArray[i]).reverse().toString();
		// }
		// res = reverseString;
		// return res;

		char[] wordArray = S.toCharArray();
		int wordStart = 0;
		for (int pos = 0;; pos++)
		{
			if (pos < wordArray.length && wordArray[pos] != ' ')
			{
				continue;
			}
			for (int wordEnd = pos - 1; wordEnd > wordStart; ++wordStart, --wordEnd)
			{
				char temp = wordArray[wordStart];
				wordArray[wordStart] = wordArray[wordEnd];
				wordArray[wordEnd] = temp;
			}
			if (pos >= wordArray.length)
			{
				break;
			}
			wordStart = pos + 1;
		}
		return String.valueOf(wordArray);
	}

	public static String myReverse(String orig)
	{
		char[] s = orig.toCharArray();
		int n = s.length;
		int halfLength = n / 2;
		for (int i = 0; i < halfLength; i++)
		{
			char temp = s[i];
			s[i] = s[n - 1 - i];
			s[n - 1 - i] = temp;
		}
		return new String(s);
	}
}
