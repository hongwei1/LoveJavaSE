package day15;

public class WrapperDemo2
{
	public static void main(String[] args)
	{

		int num = 4;
		num = num + 5;
		// 1 自动装箱
		Integer i = 4;// i = new Integer(4);自动装箱 简化书写。
		i = i + 6; // i = new Integer(i.intValue() + 6);
					// i.intValue() 自动拆箱
		// 1.1 使用注意：
		// Integer i1 = null;
		// i1=null,会 java.lang.NullPointerException
		// i1 = i1 + 6;

		// 1.2 形式参数传递
		Integer input = 1; // BK --day06 Class 2基本参数&引用参数 1Integer
		show(input); // answer:Final -> look inside Inter-- private final int value;
		Integer input1 = input;
		input1 = 3;
		StringBuilder stringBuilder = new StringBuilder("hongwei");
		show2(stringBuilder);

		// 2 小于1Byte 会开辟共享空间

		Integer x = 127; // jdk1.5以后，自动装箱，如果装箱的是一个字节，那么该数据会被共享不会重新开辟空间。
		Integer y = 127;
		System.out.println(x == y);//
		System.out.println(x.equals(y));// true

		Integer x1 = 128;// jdk1.5以后，自动装箱，如果装箱的是一个字节，那么该数据会被共享不会重新开辟空间。
		Integer y1 = 128;
		System.out.println(x1 == y1);//
		System.out.println(x1.equals(y1));// true

	}

	private static void show2(StringBuilder stringBuilder)
	{
		stringBuilder = stringBuilder.append("yanlu");
	}

	public static void show(Integer a)
	{
		a = 666;
		System.out.println("a=" + a);
	}

}
