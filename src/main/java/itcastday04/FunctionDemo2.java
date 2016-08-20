package itcastday04;

class FunctionDemo2
{
	public static void main(String[] args)
	{

		myPrint();
		int x = add(3, 5);// ½ÊÈâ»ú
		System.out.println("x=" + x);
		System.out.println(add(3, 5));
	}
	/*
	 * wrong function, it should be haven the return value public static void add(int a,int b) { System.out.println(a+b); return; }
	 */

	public static int add(int a, int b)
	{
		return a + b;
	}

	public static void myPrint()
	{
		System.out.println("Hello World!");
	}
}
