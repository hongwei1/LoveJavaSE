package itcastday15.p2.stringbuffer.demo;

import algorithms.Person;

public class StringBufferDemo
{
	public static void main(String[] args)
	{

		StringBufferDemo.bufferMethodDemo();
		StringBufferDemo.bufferMethodDemo2();
	}

	private static void bufferMethodDemo()
	{
		// 1, 创建缓冲区对象。
		StringBuffer sb = new StringBuffer();
		boolean b = true;
		Object obj = null;
		// 2，可以存储不同类型数据。
		sb.append(4).append(false).append(obj).append("haha").append('s');

		Person p1 = new Person("hongwei", 28);
		sb.append(p1); // toString storge it.

		// 3，insert 用法
		sb.insert(1, "haha");
		sb.append(true);
		sb.append("true");
		sb.append(b);
		// 3，最终要转成字符串进行使用。
		System.out.println(sb);

		// 4，可以对字符串进行修改。
		sb.append("xixi");
		sb.insert(2, "qq");

		System.out.println(sb.toString());

	}

	/**
	 * CURD
	 */
	private static void bufferMethodDemo2()
	{
		StringBuffer sb = new StringBuffer("abce");
		// 1 增加
		sb.append("a");
		sb.setCharAt(1, 'a'); // java.lang.StringIndexOutOfBoundsException:
		sb.charAt(4);
		sb.insert(1, 'b'); // java.lang.ArrayIndexOutOfBoundsException

		// 2，删除
		System.out.println("----" + sb.length());
		sb.delete(1, 3);// ae
		sb.deleteCharAt(1);
		System.out.println("----" + sb.length());

		// 2.2 清空缓冲区。
		sb.delete(0, sb.length());// way1
		sb.setLength(0);// way2
		sb = new StringBuffer();// way3

		// 2.3查找替换
		sb.setLength(10);
		System.out.println("sb:" + sb);
		sb.charAt(2);
		sb.indexOf("a");
		sb.lastIndexOf("a");
		// 4，修改：
		sb.replace(1, 3, "nba");
		sb.setCharAt(2, 'q');

		System.out.println("len:" + sb.length());
		System.out.println(sb.reverse());

	}

}
