package itcastday17.p4.hashset.demo;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * ÓÐÐò
 * 
 * @author zhanghongwei
 *
 */
public class LinkedHashSetDemo
{
	public static void main(String[] args)
	{

		LinkedHashSet<String> hs = new LinkedHashSet<String>();

		hs.add("hahah");
		hs.add("hehe");
		hs.add("heihei");
		hs.add("xixii");
		hs.add("hehe");

		Iterator<String> it = hs.iterator();

		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
