package itcastday04;

class FunctionDemo
{
	public static void main(String[] args)
	{
		int a = 3;
		int b = 4;
		int c;
		c = a + b;

		c = 5 + 7;
		c = 9 + 8;

		c = add(3, 5);
		System.out.println("c=" + c);

		System.out.println("hello world");
		myPrint();
	}

	private static void myPrint()
	{
		System.out.println("hello world !!!");
	}

	private static int add(int i, int j)
	{

		return i + j;
	}

}
