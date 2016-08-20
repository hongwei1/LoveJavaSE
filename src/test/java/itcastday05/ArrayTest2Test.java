package itcastday05;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayTest2Test
{
	ArrayTest2 arrayTest2 = new ArrayTest2();

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

	@Test
	public final void testToHex_2()
	{
		arrayTest2.toHex_2(100);
	}

	@Test
	public final void testToHex_1()
	{
		arrayTest2.toHex_1(100);
	}

	@Test
	public final void testToHex()
	{
		arrayTest2.toHex(100);
	}

}
