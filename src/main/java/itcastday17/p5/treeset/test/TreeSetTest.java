package itcastday17.p5.treeset.test;

import java.util.Iterator;
import java.util.TreeSet;

import itcastday17.p5.comparator.ComparatorByLength;

/*
 * 对字符串进行长度排序。
 *
 * "20 18 -1 89 2 67"
 */

public class TreeSetTest
{
	public static void main(String[] args)
	{

		TreeSet<String> ts = new TreeSet<String>(new ComparatorByLength());

		ts.add("aaaaa");
		ts.add("zz");
		ts.add("nbaq");
		ts.add("cba");
		ts.add("abc");

		for (Iterator<String> it = ts.iterator(); it.hasNext();)
		{
			System.out.println(it.next());
		}
	}

}
