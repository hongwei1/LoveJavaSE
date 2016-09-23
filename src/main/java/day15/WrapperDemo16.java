package day15;

public class WrapperDemo16
{

	public static void main(String[] args)
	{
		// 1 基本应用
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(-6));
		System.out.println(Integer.toHexString(15));

		// 1.1 Two constructors
		int num = 4;
		Integer i = new Integer(5); // primitive number to Integer
		Integer.parseInt("12");
		i = new Integer("45"); // String to Integer
		System.out.println(i + 1);

		// 2 该包装对象主要用基本类型和字符串之间的转换。
		int x = Integer.parseInt("123");
		System.out.println(Integer.parseInt("123") + 1);
		int x1 = new Integer("123");
		System.out.println(x == x1);
		int x11 = Integer.valueOf("123");

		Integer i3 = new Integer("123");
		System.out.println(i3.intValue());
		// 3 基本数值和字符串相互转化
		// 3.1基本类型--->字符串 --2
		String s1 = String.valueOf(34);
		s1 = "" + 34;
		// 3.2字符串--->基本类型 --2
		Integer.parseInt("12");

		Integer iString = new Integer("3333"); // 1 String --> Integer
		Integer valueOf = Integer.valueOf("3333");// 2 String --> Integer

		int iS = iString.intValue();
		// 3.3 字符串--->Integer --2
		Integer iString1 = new Integer("3333"); // 1 String --> Integer
		Integer valueOf1 = Integer.valueOf("3333");// 2 String --> Integer

		// 3.4 Integer--->字符串 --3
		String sWei1 = String.valueOf(valueOf1);
		String sWei2 = "" + valueOf1;
		String sWei3 = valueOf1.toString();

		// 4 十进制-->其他进制。

		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));
		System.out.println(Integer.toString(60, 16));
		// 4.1 其他进制-->十进制。
		System.out.println(Integer.parseInt("3c", 16));

		// 5 包装类的计算和比较
		Integer a = new Integer("89");
		Integer b = new Integer(90);

		// 详情见：注释-- /LoveJavaSE/src/goodtests/T08WrapInterString.java
		System.out.println((a + 1) == b);
		System.out.println(Integer.valueOf(a + 1).equals(b));

		System.out.println(3 > 3);
		System.out.println(b.compareTo(a));

	}

}
