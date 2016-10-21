package goodtests;

class Solution1
{

	public static void main(String[] args)
	{
		// int[] A = { 2, 3, -1, 1, 3 };
		int[] A = { 1, 1, -1, 1 };
		Solution1 solution = new Solution1();
		System.out.println(solution.solution(A));
	}

	public int solution(int[] A)
	{
		int largestJunpCount = factorial(A.length);
		int jumpCount = 1;
		int cur = 0;
		int next = A[0];

		while (cur <= A.length - 1 && cur >= 0)
		{
			if (cur == A.length - 1)
			{
				return jumpCount;
			}
			next = A[cur];
			cur = cur + next;
			jumpCount++;

			if (jumpCount > largestJunpCount)
			{
				return -1;
			}
		}
		return -1;
	}

	/**
	 * To get the largest jump count, use the factorial to get it . n*(n-1)*(n-2) ...*2*1
	 *
	 * @param x
	 * @return
	 */
	public static int factorial(int x)
	{
		if (x < 0)
		{
			throw new IllegalArgumentException("x must be>=0");
		}
		int fact = 1;
		for (int i = 2; i <= x; i++)
		{
			fact *= i;
		}
		return fact;
	}
}
