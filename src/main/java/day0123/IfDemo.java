package day0123;

class IfDemo
{
	public static void main(String[] args)
	{
		// 1 sequence sentences
		System.out.println("Hello World!1");
		System.out.println("Hello World!2");

		/*
		 * if语句的第一种格式： 1， if(条件表达式) { 执行语句； }
		 */
		int x = 1;
		if (x > 1)
		{
			if (x < 2)
			{
				System.out.println("yes");
			}
		}
		System.out.println("over");
	}
}
