package day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo
{

	public static void main(String[] args)
	{
		Collection<String> c1 = new ArrayList<String>();
		Collection<String> c2 = new ArrayList<String>();

		// 1 添加元素。
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");

		c2.add("abc3");
		c2.add("abc1");
		c2.add("abc2");
		// c2.add("abc4");
		// c2.add("abc5");
		c1.containsAll(c2);

		// 演示addAll
		c1.addAll(c2);// 将c2中的元素添加到c1中。

		// 2，删除元素。remove
		c1.remove("abc2");// 会改变集合的长度
		// 演示removeAll
		boolean b = c2.removeAll(c1);// 将两个集合中的相同元素从调用removeAll的集合中删除。
		System.out.println("removeAll:" + b);
		// 清空集合.
		c2.clear();

		// 3，判断
		System.out.println(c1.contains("abc3"));
		// 演示containsAll

		System.out.println("containsAll:" + b);

		// 4, 获取：
		c1.size();

		// 4.1 使用了Collection中的iterator()方法,调用集合中的迭代器方法，是为了获取集合中的迭代器对象。
		Iterator<String> iteratorWhile = c1.iterator();
		while (iteratorWhile.hasNext())
		{
			final String next = iteratorWhile.next();
			System.out.println(next); // java.util.NoSuchElementException
		}

		System.out.println(c1.size());

		// 4.2 use the for loop
		for (Iterator<String> iteratorFor = c1.iterator(); iteratorFor.hasNext();)
		{
			System.out.println(iteratorFor.next());
		}

		// 5 其他
		// 演示retainAll,和removeAll功能相反 。
		b = c1.retainAll(c2);// 取交集，保留和指定的集合相同的元素，而删除不同的元素。
		System.out.println("retainAll:" + b);
		System.out.println("c1:" + c1);

	}

}
