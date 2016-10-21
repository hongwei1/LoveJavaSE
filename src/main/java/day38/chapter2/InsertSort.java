package day38.chapter2;

// play card,
public class InsertSort
{
	public int[] insertSort(int[] array)
	{
		int[] newArray = array.clone();

		for (int i = 1; i < newArray.length; i++)
		{
			int key = newArray[i];
			int j = i - 1;
			while (j >= 0 && newArray[j] < key)
			{
				newArray[j + 1] = newArray[j];
				j--;
			}
			newArray[j + 1] = key;
		}
		return newArray;
	}

	/**
	 * P23 2.1-4 Consider the problem of adding two n-bit binary integers, stored in two n-element
	 * arrays A and B. The sum of the two integers should be stored in binary form in an .n C
	 * 1/-element array C. State the problem formally and write pseudocode for adding the two
	 * integers.
	 *
	 * @param A
	 * @param B
	 * @return
	 */
	public static int[] binarySum(int[] A, int[] B)
	{
		int[] C = new int[A.length + 1];// { 1, 0, 1 };//

		int carry = 0;
		for (int i = 0; i < A.length; i++)
		{
			C[i] = (A[i] + B[i] + carry) % 2;
			carry = (A[i] + B[i]) / 2;
		}
		C[A.length] = carry;
		return C;
	}

	public static int[] slectSort(int[] a)
	{
		int[] newA = a.clone();

		for (int i = 0; i < newA.length - 1; i++)
		{
			int key = newA[i];
			int index = i;
			for (int j = i; j < newA.length; j++)
			{
				if (newA[j] < key)
				{
					index = j;
					key = newA[j];
				}
			}
			int temp = newA[i];
			newA[i] = key;
			newA[index] = temp;
		}

		return newA;
	}

}
