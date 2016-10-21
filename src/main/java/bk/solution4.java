package bk;

//https://github.com/alex859/codility/blob/master/src/org/alex859/codility/Test1.java
class solution4
{
	public int solution(int[] A)
	{
		int length = A.length;
		if (length == 0)
		{
			return -1;
		}
		// get average value from array A
		double average = 0;
		for (int i = 0; i < length; i++)
		{
			average += A[i];
		}
		average = average / length;

		double maxDeviation = 0;
		int maxValue = 0;

		// compare the each elements of A and get the result
		for (int index = 0; index < length; index++)
		{
			double deviationTemp = Math.abs(A[index] - average);
			if (deviationTemp > maxDeviation)
			{
				maxDeviation = deviationTemp;
				maxValue = index;
			}
		}

		return maxValue;
	}

	public static void main(String[] args)
	{
		solution4 t = new solution4();
		int[] A = new int[] { 9, 4, -3, -10 };
		// Random rnd = new Random();
		// int N = 1000000;
		// int[] A1 = new int[N];
		// for (int i = 0; i < N; i++)
		// {
		// A1[i] = -1 * rnd.nextInt(Integer.MAX_VALUE);
		// // System.out.print(A1[i]+" ");
		// }
		System.out.println(t.solution(A));
	}
}
