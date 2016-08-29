package itcastday16.p4.list.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2
{
	public static void main(String[] args)
	{

		List<String> list = new ArrayList<String>();

		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");

		Iterator<String> it = list.iterator();
		while (it.hasNext())
		{
			System.out.println("next:" + it.next());
		}
		// list特有的取出元素的方式之一，和数组一样操作角标。
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println("get" + list.get(i));
		}

		ListDemo2.commonAbtain(list);
		ListDemo2.listSepcialAbtain(list);

	}

	/**
	 * common way to get the content of list not use the item in the iterator and list at the same time.
	 *
	 * @exception java.util.ConcurrentModificationException
	 * @param list
	 * @throws java.util.ConcurrentModificationException
	 *
	 */
	private static void commonAbtain(List<String> list)
	{
		Iterator<String> it1 = list.iterator();
		while (it1.hasNext())
		{
			Object obj = it1.next();
			// 在迭代器过程中，不要使用集合操作元素，容易出现异常。
			// 可以使用Iterator接口的子接口ListIterator来完成在迭代中对元素进行更多的操作。
			if (obj.equals("abc9"))
			{
				// list.add("abc2"); // java.util.ConcurrentModificationException
			}
			else
			{
				System.out.println("next:" + obj);
			}
		}
		System.out.println(list);
	}

	/**
	 * @param list
	 */
	private static void listSepcialAbtain(List<String> list)
	{
		ListIterator<String> it = list.listIterator();// 获取列表迭代器对象

		// 注意：只有list集合具备该迭代功能.

		while (it.hasNext())
		{
			Object obj = it.next();
			if (obj.equals("abc2"))
			{
				it.add("abc9"); // 它可以实现在迭代过程中完成对元素的增删改查。
			}
		}

		System.out.println("hasNext:" + it.hasNext());
		System.out.println("hasPrevious:" + it.hasPrevious());

		while (it.hasPrevious())
		{
			System.out.println("previous:" + it.previous());
		}
		System.out.println("list:" + list);
	}

}
