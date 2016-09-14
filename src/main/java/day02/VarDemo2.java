package day02;

/**
 * --day02 02-Java基础语法1 P15-P19
 *
 * Test to cast all the variables, invisibility and force type
 *
 */
class VarDemo2
{
	public static void main(String[] args)
	{
		// default convert
		int x = 3;
		byte b = 5;
		x = x + b;

		// force convert
		byte b1 = 3;
		b1 = (byte) (b1 + 200);// 强制类型转换。

		// test the java edit code
		System.out.println((char) ('a' + 1));
		System.out.println('你' + 0);// unicode国际标准码表。

		// integer to byte
		b = 4;
		b = 3 + 7;// if 700, it is error!
		b1 = 3;
		byte b2 = 7;
		b = (byte) (b1 + b2);

		// exceed the range of integer
		int x1 = Integer.MAX_VALUE;
		int x2 = 2;
		x = x1 + x2;
		System.out.println(Integer.MIN_VALUE);
		System.out.println(x);
	}
}
