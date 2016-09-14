package goodtests;

/**
 * 参考：http://www.jianshu.com/p/c7f47de2ee80
 *
 * eg1 line 16 -- 20:/LoveJavaSE/src/itcastday16/p2/wrapper/demo/WrapperDemo2.java
 * answer:jdk1.5以后，自动装箱，如果装箱的是一个字节，那么该数据会被共享不会重新开辟空间。
 *
 */
public class T08WrapInterString
{
	public static void main(String[] args)
	{
		// 二.8种基本类型的包装类和常量池
		Integer i1 = 40;
		Integer i2 = 40;
		Integer i3 = 0;
		Integer i4 = new Integer(40);
		Integer i5 = new Integer(40);
		Integer i6 = new Integer(0);

		System.out.println("i1=i2   " + (i1 == i2)); // true
		System.out.println("i1=i2+i3   " + (i1 == i2 + i3));// true
		System.out.println("i1=i4   " + (i1 == i4));// false
		System.out.println("i4=i5   " + (i4 == i5));// false
		System.out.println("i4=i5+i6   " + (i4 == i5 + i6)); // false
		System.out.println("40=i5+i6   " + (40 == i5 + i6));// true

		// 三.String类和常量池
		/*
		 * 连接表达式 + （1）只有使用引号包含文本的方式创建的String对象之间使用“+”连接产生的新对象才会被加入字符串池中。
		 * （2）对于所有包含new方式新建对象（包括null）的“+”连接表达式，它所产生的新对象都不会被加入字符串池中。
		 */
		String str1 = "str";
		String str2 = "ing";

		String str3 = "str" + "ing";
		String str4 = "str" + str2; // str1 +str2;
		System.out.println("str3 == str4 " + (str3 == str4));// false

		String str5 = "string";
		System.out.println("str3 == str5 " + (str3 == str5));// true

		// 特例1
		final String A = "ab"; // 常量A
		final String B = "cd"; // 常量B
		String s = A + B; // 将两个常量用+连接对s进行初始化
		String t = "abcd";
		if (s == t)
		{
			System.out.println("s等于t，它们是同一个对象");
		}
		else
		{
			System.out.println("s不等于t，它们不是同一个对象");
		}
		// s等于t，它们是同一个对象,
		// A和B都是常量，值是固定的，因此s的值也是固定的，它在类被编译时就已经确定了。
		// 也就是说：String s=A+B; 等同于：String s="ab"+"cd";

		// 特例2
		String s1 = new String("计算机");
		String s2 = s1.intern();
		String s3 = "计算机";
		System.out.println("s1 == s2? " + (s1 == s2)); // false
		System.out.println("s3 == s2? " + (s3 == s2)); // true

	}
}
/*
 * 解释：语句i4 == i5 + i6，因为+这个操作符不适用于Integer对象， 首先i5和i6进行自动拆箱操作，进行数值相加，即i4 == 40。
 * 然后Integer对象无法与数值进行直接比较，所以i4自动拆箱转为int值40， 最终这条语句转为40 == 40进行数值比较。
 *
 */
