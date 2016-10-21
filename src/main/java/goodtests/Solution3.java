package goodtests;

//https://github.com/rbutti/HackerEarth/blob/master/src/main/java/com/rave/marcura/breakAChain/Solution.java
/**
 * <pre>
A zero indexed Array consisting of N integers is given. The elements of Array A together represent a chain,
and each element represents the strength of each link in chain. We want to divide this chain into three smaller chains.
All we can do is to break this chain in exactly to non- adjacent postitions. More presisely we should brea links P, Q(01),
resulting in three chains: [0, P-1],[P+1,Q-1],[Q+1,N-1]. The total cost of this operation is A[P]+a[Q].

For example consider the array A such that:

A[0] = 5
A[1] = 2
A[2] = 4
A[3] = 6
A[4] = 3
A[5] = 7
We can choose to break the following Links:

(1,3) : total cost is 6+2 = 8
(1,4) : total cost is 2+3 = 5
(2,4) : total cost is 4+3 = 7

Write a method:

int solution(int[] A. int N);
that, given a zero indexed array A of N integers, returns the minimum cost of dividing the chain into three parts. For above example it should return 5
 * </pre>
 */
class Solution3
{
	public static int solution(int[] A)
	{
		int length = A.length;
		int sum = A[1] + A[3];
		for (int i = 1; i < length - 3; i++)
		{
			for (int j = i + 2; j < length - 1; j++)
			{
				int tempSum = A[i] + A[j];
				sum = (tempSum < sum) ? tempSum : sum;
			}
		}
		return sum;
	}

	public static void main(String[] args)
	{
		int[] a = new int[] { 5, 2, 4, 6, 3, 7 };
		System.out.println(solution(a));
		System.out.println(solution2(a));
	}

	// http://stackoverflow.com/questions/21635397/min-average-two-slice-codility
	public static int solution2(int[] A)
	{
		int len = A.length, result = len - 1, sum = 0;
		int[] prefixSums = new int[len + 1];

		for (int i = 1; i <= len; ++i)
		{
			prefixSums[i] = prefixSums[i - 1] + A[i - 1];
		}

		double min = Double.MAX_VALUE, average = 0d;

		for (int P = 0, Q = 1; Q + 1 < prefixSums.length; ++P, ++Q)
		{
			sum = prefixSums[Q + 1] - prefixSums[P];
			average = (sum) / (double) 2;

			if (average < min)
			{
				min = average;
				result = P;
			}

			if (Q + 2 < prefixSums.length)
			{
				sum = prefixSums[Q + 2] - prefixSums[P];
				average = (sum) / (double) 3;

				if (average < min)
				{
					min = average;
					result = P;
				}
			}

		}

		return result;
	}

}
