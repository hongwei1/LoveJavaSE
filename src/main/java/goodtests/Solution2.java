package goodtests;

//http://wdxtub.com/interview/14520850399861.html
//Given four integers, make F(S) = abs(S[0]-S[1])+abs(S[1]-S[2])+abs(S[2]-S[3]) to be largest
/**
 * <pre>
 * I am came across this question recently but didn't get any idea about solving this. Can you some one help with pseudo code.

Given an array with four integers A, B, C, D, shuffle them in some order. If the integers are unique then there are 24 shuffles. My task is get the best shuffle such that

F(S) = abs(s[0]-s[1]) + abs(s[1]-s[2])+ abs(s[2]-s[3])
is maximum
For example consider this example

A=5, B= 3, C=-1, D =5
s[0]=5, s[1]=-1, s[2]= 5, s[3] =3
will give me maximum sum which is

F[s] =14
The time and space complexity are O(1).
</pre>
*
*/

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

class Solution
{

	public static void main(String[] args)
	{

		Solution solution = new Solution();
		System.out.println(solution.solution(5, 3, -1, 5));
	}

	public int solution(int A, int B, int C, int D)
	{

		int[] resultArray = new int[4];
		resultArray[0] = A;
		resultArray[1] = B;
		resultArray[2] = C;
		resultArray[3] = D;
		Arrays.sort(resultArray);
		mySwap(resultArray, 0, 1);
		mySwap(resultArray, 2, 3);
		mySwap(resultArray, 0, 3);
		return Math.abs(resultArray[0] - resultArray[1]) + Math.abs(resultArray[1] - resultArray[2])
				+ Math.abs(resultArray[2] - resultArray[3]);
	}

	private void mySwap(int[] sourceArray, int i, int j)
	{
		sourceArray[i] ^= sourceArray[j];
		sourceArray[j] ^= sourceArray[i];
		sourceArray[i] ^= sourceArray[j];
	}

}

class Test_ZhongHe
{

	public static void random_sort(Integer[] arr)
	{
		// store the results
		int len = arr.length;
		final int arrayCount = factorial(len);
		Integer[][] resultList = new Integer[arrayCount][len];
		for (int k = 0; k < 24; k++)
		{
			// 将数组中的数放到一个容器中，根据容器的长度随机产生一个数，取出该数，
			// 存到另一个容器中，且删除原来容器的这个数，此时原来容器的长度会减1，
			// 则产生随机数的范围也会减一，如下：
			// int tmp = new Random().nextInt(len - i);

			// 将此随机数对应的list中的数，存到结果的对应位置
			// resultList[i] = lt.get(tmp);
			LinkedList<Integer> lt = new LinkedList<Integer>(Arrays.asList(arr));

			for (int i = 0; i < len; i++)
			{
				int tmp = new Random(k).nextInt(len - i);
				// save the item to array
				resultList[k][i] = lt.get(tmp);
				// delet the item
				lt.remove(tmp);
			}
		}

		System.out.print("sort after：");

		// show result:
		System.out.print(Arrays.deepToString(resultList));
	}

	public static void main(String[] args)
	{
		Integer[] arr = { 5, 3, -1, 5 };
		random_sort(arr);
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