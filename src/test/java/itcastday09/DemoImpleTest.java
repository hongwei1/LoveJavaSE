package itcastday09;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class DemoImpleTest
{

	DemoImple demoImple = new DemoImple();

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
	@Ignore
	public final void testShow1()
	{
		Assert.fail("Not yet implemented"); // TODO
	}

	@Test
	@Ignore
	public final void testShow2()
	{
		Assert.fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testShow()
	{
		this.demoImple.show();

	}

}
