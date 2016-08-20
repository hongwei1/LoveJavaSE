package itcastday05;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayDemo4Test
{
	public static int[] arr;
	ArrayDemo4 arrayDemo4 = new ArrayDemo4();
	// 1 prepare data
	final int expected = 109;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
	}

	@Before
	public void setUp() throws Exception
	{
		arr = new int[] { 34, 19, 11, 109, 3, 56 };
	}

	@After
	public void tearDown() throws Exception
	{

	}

	@Test
	public final void testBubbleSort()
	{
		// arrayDemo4.printArray(arr);
		// arrayDemo4.bubbleSort(arr);
		// arrayDemo4.printArray(arr);
		arrayDemo4.printArray(arr);
		// for (int i = 0; i < arr.length; i++)
		// {
		// for (int j = 0; j < arr.length - 1 - i; j++)
		// {
		// if (arr[j] < arr[j + 1])
		// {
		// int temp = arr[j];
		// arr[j] = arr[j + 1];
		// arr[j + 1] = temp;
		//
		// }
		// }
		// }

		for (int i = 0; i < arr.length; i++)
		{
			int temp = i;
			for (int j = i; j < arr.length; j++)
			{
				if (arr[temp] > arr[j])
				{
					temp = j;
				}
			}
			if (temp != i)
			{
				int temp1 = arr[temp];
				arr[temp] = arr[i];
				arr[i] = temp1;
			}
		}
		arrayDemo4.printArray(arr);
	}

	@Test
	public final void testSelectSort()
	{
		// run app
		arrayDemo4.printArray(arr);
		arrayDemo4.selectSort(arr);
		arrayDemo4.printArray(arr);
		// check result
	}

	/**
	 *
	 */
	@Test
	public final void testGetMax()
	{
		// run app
		final int actual = arrayDemo4.getMax(arr);

		// 3 check result
		assertEquals(expected, actual);
	}

	/**
	 *
	 */
	@Test
	public void testGetMax2()
	{
		// run app
		final int actual = arrayDemo4.getMax2(arr);

		// check result
		assertEquals(expected, actual);
	}

	// 遍历数组的功能。
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for (int x = 0; x < arr.length; x++)
		{
			if (x != arr.length - 1)
			{
				System.out.print(arr[x] + ", ");
			}
			else
			{
				System.out.println(arr[x] + "]");
			}
		}
	}

}
