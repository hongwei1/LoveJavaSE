package day15;

/**
 * 将一个int[]数组变成字符串。 eg1：用String会浪费空间，每次都会产生新的String在常量池中。 eg2：用StringBuffer可以提高效率。 如果你保存的数据要以字符串的形式来使用则用stringbuffer 和stringbuilder的形式。
 * 一旦进入他们取出的就只有字符串了数组，存入和取出的格式一样的。
 *
 * @author zhanghongwei
 * @param arr
 * @return
 *
 */

public class StringBuilderTest
{
	public static void main(String[] args)
	{

		int[] arr = { 3, 1, 5, 3, 8 };
		String s = StringBuilderTest.arrayToString2(arr);
		String s1 = StringBuilderTest.arrayToString(arr);

		System.out.println(s);
		System.out.println(s1);
	}

	public static String arrayToString2(int[] arr)
	{

		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length - 1; i++)
		{
			sb.append(arr[i] + ", ");
		}
		sb.append(arr[arr.length - 1] + "]");
		return sb.toString();
	}

	public static String arrayToString(int[] arr)
	{

		String str = "[";
		for (int i = 0; i < arr.length - 1; i++)
		{
			str += arr[i] + ", ";
		}
		str += arr[arr.length - 1] + "]";
		return str;
	}

}
