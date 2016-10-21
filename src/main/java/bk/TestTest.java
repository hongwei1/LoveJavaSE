package bk;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTest
{
	MyTest myTest = new MyTest();

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
	}

	@After
	public void tearDown() throws Exception
	{
	}

	/**
	 * Transfor "110"-->5
	 *
	 * @param string
	 */
	@Test
	public final void testMain()
	{
		int[] A = new int[8];
		A[0] = -1;
		A[1] = 3;
		A[2] = -4;
		A[3] = 5;
		A[4] = 1;
		A[5] = -6;
		A[6] = 2;
		A[7] = 1;

		// get the equilibrium index
		System.out.println(Arrays.toString(A));
		int sum = 0;
		for (int element : A)
		{
			sum = sum + element;
		}
		System.out.println(sum);
		int frontPart = 0;
		int backPart = 0;
		for (int i = 0; i < A.length; i++)
		{
			for (int j = 0; i < i; j++)
			{
				frontPart = frontPart + A[j];
			}
			backPart = sum - frontPart - A[i];
			if (frontPart == backPart)
			{
				System.out.println(i);
			}
		}

	}

	@Test
	public final void testMethod2()
	{

	}

}
