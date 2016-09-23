package day18.p5.generic.advance.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericAdvanceDemo
{
	public static void main(String[] args)
	{

		ArrayList<String> al = new ArrayList<String>();

		al.add("abc");
		al.add("hehe");

		ArrayList<Integer> al2 = new ArrayList<Integer>();

		al2.add(5);
		al2.add(67);

		GenericAdvanceDemo.printCollection(al);
		GenericAdvanceDemo.printCollection(al2);
	}

	/**
	 * 迭代并打印集合中元素。
	 *
	 * @param al
	 */
	public static void printCollection(Collection<?> al)
	{

		for (Object object : al)
		{
			System.out.println(object);
		}

		Iterator<?> it = al.iterator();

		while (it.hasNext())
		{
			// 缺点不能引用具体的类型了，只能object，因为类型不确定。
			// T str = it.next();
			// System.out.println(str);
			Object next = it.next();
			System.out.println(next);
		}
	}
}
