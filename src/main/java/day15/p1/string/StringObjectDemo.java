package day15.p1.string;

public class StringObjectDemo
{
	public static void main(String[] args)
	{

		// String s1 = "abc";
		// String s2 = "abc";

		// intern():对字符串池进行操作的

		String s1 = new String("abc");
		String s2 = s1.intern(); // 把字符串加入到常量池中,再赋值给s2
		String s3 = "abc";
		System.out.println(s1 == s2);// s1在堆中，s2再对象池中
		System.out.println(s3 == s2);// s1在堆中，s2再对象池中

	}

}
