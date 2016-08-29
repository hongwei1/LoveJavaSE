package itcastday18.p5.generic.advance.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import itcastday18.p2.bean.GrandFa;

public class GenericAdvanceDemo4
{

	public static void main(String[] args)
	{

		ArrayList<GrandFa> al1 = new ArrayList<GrandFa>();

		al1.add(new GrandFa("abc", 30));
		al1.add(new GrandFa("abc4", 34));
		ArrayList<GrandFa> al2 = new ArrayList<GrandFa>();

		al2.add(new GrandFa("abc22222", 30));
		al2.add(new GrandFa("abc42222222", 34));

		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("abcdeef");
		al4.add("abc");

		al1.containsAll(al4);

		// "abc".equals(new Person("ahahah",20));

	}

	public static void printCollection(Collection<?> al)
	{
		Iterator<?> it = al.iterator();

		while (it.hasNext())
		{

			System.out.println(it.next().toString());
		}
	}
}

class MyCollection2<E>
{
	public boolean containsAll(Collection<?> coll)
	{

		return true;
	}
}
