package day17.p5.treeset.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

/**
 * 对字符串进行长度排序。
 *
 * "20 18 -1 89 2 67"
 */

public class TreeSetTest
{
	public static void main(String[] args)
	{
		// TreeSet<String> ts = new TreeSet<String>(new ComparatorByLength());
		TreeSet<String> ts = new TreeSet<String>(new MyL(null));

		ts.add("aaaaa");
		ts.add("zz");
		ts.add("nbaq");
		ts.add("cba");
		ts.add("abc");
		ts.add("aa");

		for (String string : ts)
		{
			System.out.println(string);
		}

		HashSet<MyL> set = new HashSet<MyL>();
		set.add(new MyL("a"));
		set.add(new MyL("b"));
		set.add(new MyL("c"));
		for (MyL myL : set)
		{
			System.out.println(myL);
		}

		HashMap<MyL, String> hashMap = new HashMap<MyL, String>();
		hashMap.put(new MyL("a"), "a");
		hashMap.put(new MyL("b"), "b");
		Set<Entry<MyL, String>> entrySet = hashMap.entrySet();
		for (Entry<MyL, String> entry : entrySet)
		{
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}
	}
}

class MyL implements Comparator<String>
{

	String name;

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		return 0;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		return true;
	}

	public MyL(String string)
	{
		this.name = string;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "MyL [name=" + this.name + "]";
	}

	@Override
	public int compare(String o1, String o2)
	{
		final int temp = o1.length() - o2.length();
		return temp == 0 ? o1.compareTo(o2) : temp;
	}

}