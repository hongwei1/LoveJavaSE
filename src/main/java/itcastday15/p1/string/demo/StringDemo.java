package itcastday15.p1.string.demo;

public class StringDemo
{
	public static void main(String[] args)
	{
		// 1 String类的特点：字符串对象一旦被初始化就不会被改变。
		StringDemo.stringDemo1();
		StringDemo.stringDemo2();
	}

	/**
	 * 字符串定义的第一种方式: String s = "abc"; 并明确字符串常量池的特点. 池中没有就建立，池中有，直接用。
	 */
	private static void stringDemo1()
	{
		String s = "abc";// "abc"存储在字符串常量池中。
		// s = "nba"; //仅仅改变引用，不能改变字符串的值。
		String s1 = "abc";
		System.out.println(s == s1);// true --都在常量池中，应用地址一样的

		String a2[] = { "abc" };
		String a3[] = { "abc" };
		System.out.println(a2 == a3); // false --字符串，比较地址
		System.out.println(a2[0] == a3[0]); // true --都在常量池中，应用地址一样的

		String[] a4 = { "abc", "abc" };
		String a5 = "abc";
		System.out.println(a4[0] == a5);// true --都在常量池中，应用地址一样的
		System.out.println(a4[1] == a2[0]);// true --都在常量池中，应用地址一样的
	}

	/**
	 * 字符串定义的第二种方式:new String("a");
	 */
	private static void stringDemo2()
	{
		String s = "abc"; // 创建一个字符串对象在常量池中。
		String s1 = new String("abc"); // new一个字符串对象在堆内存中。

		System.out.println(s == s1); // false，地址不同，一个在堆，一个在常量池。
		System.out.println(s.equals(s1)); // string类中的equals复写Object中的equals建立了string类自己的判断字符串对象是否相同的依据。
	}

}
