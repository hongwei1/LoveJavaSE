/**
 *
 */
package itcastday05;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author zhanghongwei
 *
 */
public class ArrayTestTest
{

	ArrayTest arrayTest = new ArrayTest();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

	/**
	 * Test method for {@link itcastday05.ArrayTest#reverseArray(int[])}.
	 */
	@Test
	public final void testReverseArray()
	{
		int[] arr = { 4, 1, 8, 7, 3, 8, 2 };
		printArray(arr);
		arrayTest.reverseArray(arr);
		printArray(arr);
	}

	/**
	 * Test method for {@link itcastday05.ArrayTest#reverseArray1(int[])}.
	 */
	@Test
	public final void testReverseArray1()
	{
		int[] arr = { 4, 1, 8, 7, 3, 8, 2 };
		printArray(arr);
		arrayTest.reverseArray1(arr);
		printArray(arr);

	}

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
