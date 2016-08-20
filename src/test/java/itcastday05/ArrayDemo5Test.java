/**
 *
 */
package itcastday05;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author zhanghongwei
 *
 */
public class ArrayDemo5Test
{
	ArrayDemo5 arrayDemo5 = new ArrayDemo5();
	int[] arrNormal;
	int[] arr;

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

		arrNormal = new int[] { 4, 1, 8, 7, 3, 8, 2 };
		arr = new int[] { 13, 15, 19, 28, 33, 45, 78, 106 };

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

	/**
	 * Test method for {@link itcastday05.ArrayDemo5#halfSearch(int[], int)}.
	 */
	@Test
	public final void testHalfSearch()
	{

		int index = arrayDemo5.halfSearch(arr, 3113);
		System.out.println("index=" + index);

		int index1 = Arrays.binarySearch(arr, 5); // 如果存在返回的具体的角标位置，不存在返回的是
													// -插入点-1: 若返回“-插入点”，则第一个会出错。例如:输入5，会返回0。
		System.out.println("index1=" + index1);
	}

	/**
	 * Test method for {@link itcastday05.ArrayDemo5#halfSearch_2(int[], int)}.
	 */
	@Test
	public final void testHalfSearch_2()
	{
		int index_2 = arrayDemo5.halfSearch_2(arr, 33);
		System.out.println(" index_2=" + index_2);

	}

	/**
	 * Test method for {@link itcastday05.ArrayDemo5#getIndex(int[], int)}.
	 */
	@Test
	public final void testGetIndex()
	{
		System.out.println(arrayDemo5.getIndex(arrNormal, 8));
	}

}
