package day41;

public interface TestInter
{
	static void test1()
	{
		System.out.println("static !");
	}

	default void test2()
	{
		System.out.println("default !");
	}

}
