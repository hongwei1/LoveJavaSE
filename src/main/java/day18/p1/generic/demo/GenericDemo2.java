package day18.p1.generic.demo;

import java.util.Iterator;
import java.util.TreeSet;

import day18.p2.bean.GrandFa;
import day18.p3.comparator.ComparatorByName;

public class GenericDemo2
{
	public static void main(String[] args)
	{

		TreeSet<GrandFa> ts = new TreeSet<GrandFa>(new ComparatorByName<GrandFa>());
		ts.add(new GrandFa("lisi8", 21));
		ts.add(new GrandFa("lisi3", 23));
		ts.add(new GrandFa("lisi", 21));
		ts.add(new GrandFa("lis0", 20));

		Iterator<GrandFa> it = ts.iterator();
		while (it.hasNext())
		{
			GrandFa p = it.next();
			System.out.println(p.getName() + ":" + p.getAge());
		}

	}

}
