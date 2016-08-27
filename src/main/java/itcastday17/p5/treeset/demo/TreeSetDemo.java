package itcastday17.p5.treeset.demo;

import java.util.Iterator;
import java.util.TreeSet;

import itcastday17.p.bean.Person;

public class TreeSetDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		TreeSet<Person> ts = new TreeSet<Person>();
		// TreeSet ts = new TreeSet(new ComparatorByName());
		// TreeSet ts = new TreeSet(new myComparableByname());

		/*
		 * 以Person对象年龄进行从小到大的排序。
		 *
		 */

		ts.add(new Person("zhangsan", 28));
		ts.add(new Person("lisi", 21));
		ts.add(new Person("zhouqi", 29));
		ts.add(new Person("zhaoliu", 25));
		ts.add(new Person("wangu", 24));

		for (Iterator<Person> it = ts.iterator(); it.hasNext();)
		{
			Person p = it.next();
			System.out.println(p.getName() + ":" + p.getAge());
		}

	}

	/**
	 *
	 */
	public static void demo1()
	{
		TreeSet ts = new TreeSet();

		ts.add("abc");
		ts.add("zaa");
		ts.add("aa");
		ts.add("nba");
		ts.add("cba");

		Iterator it = ts.iterator();

		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
