package day19.p3.toolclass.arrays.demo;

import java.util.Arrays;
import java.util.List;

/**
 * 数组转成集合。Arrays：集合框架的工具类。里面的方法都是静态的。
 *
 * @author zhanghongwei
 *
 */
public class ArraysDemo
{
	public static void main(String[] args)
	{
		int[] arr = { 3, 1, 5, 6, 3, 6 };
		// 把数组内容输出,默认是class格式
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);

		/**
		 * 重点：List asList(数组)将数组转成集合。
		 *
		 * 好处：其实可以使用集合的方法操作数组中的元素。
		 *
		 * 注意：数组的长度是固定的，所以对于集合的增删方法是不可以使用的 否则会发生UnsupportedOperationException
		 *
		 */

		String[] arrString = { "abc", "haha", "xixi" };
		// 数组提供的方法很少,要自己写如下包含方法,可以转为List去判断
		boolean b = ArraysDemo.myContains(arrString, "xixi");
		System.out.println("contains:" + b);

		List<String> list = Arrays.asList(arrString);
		boolean b1 = list.contains("xixi");
		System.out.println("list contaisn:=" + b1);
		list.set(1, "hiahia");// 可以修改,但是不能改变长度
		// list.add(1, "hiahia");// UnsupportedOperationException

		/**
		 * 如果数组中的元素是对象，那么转成集合时，直接将数组中的元素作为集合中的元素进行集合存储。
		 *
		 * 如果数组中的元素是基本类型数值，那么会将该数组作为集合中的元素进行存储。
		 *
		 */

		int[] arrInt = { 31, 11, 51, 61 };
		List<int[]> listInt = Arrays.asList(arrInt);
		System.out.println(listInt);// [[I@7852e922]

		String[] arrString1 = { "abc", "haha", "xixi" };
		List<String> listString = Arrays.asList(arrString1);
		System.out.println(listString); // [abc, haha, xixi]

	}

	public static boolean myContains(String[] arr, String key)
	{
		for (String element : arr)
		{
			if (element.equals(key))
			{
				return true;
			}
		}
		return false;
	}
}
