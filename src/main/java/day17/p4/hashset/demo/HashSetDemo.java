package day17.p4.hashset.demo;

import java.util.HashSet;
import java.util.Iterator;

import day17.p.bean.Person;

/**
 * <pre>
 * 往hashSet集合中存储Person对象:如果姓名和年龄相同，视为同一个人。视为相同元素。
 *
 * Summary: HashSet集合数据结构是哈希表，所以存储元素的时候，
 *
 * 1 使用的元素的hashCode方法来确定位置.
 *
 * 2 如果位置相同，在通过元素的equals来确定是否相同。
 *
 * </pre>
 *
 * @author zhanghongwei
 *
 */
public class HashSetDemo
{
	public static void main(String[] args)
	{
		// 1 Store String
		HashSet<String> hs = new HashSet<String>();

		hs.add("hehe");
		hs.add("heihei");
		hs.add("hahah");
		hs.add("xixii");
		hs.add("hehe");

		Iterator<String> it = hs.iterator();

		while (it.hasNext())
		{
			System.out.println(it.next());
		}

		// 2 Store Classes
		HashSet<Person<Object>> hsPerson = new HashSet<Person<Object>>();

		// 往hashSet集合中存储Person对象:如果姓名和年龄相同，视为同一个人。视为相同元素。

		// Summary:
		// HashSet集合数据结构是哈希表，所以存储元素的时候，
		// 1 使用的元素的hashCode方法来确定位置.
		// 2 如果位置相同，在通过元素的equals来确定是否相同。
		hsPerson.add(new Person<Object>("lisi4", 24));
		hsPerson.add(new Person<Object>("lisi7", 27));
		hsPerson.add(new Person<Object>("lisi1", 21));
		hsPerson.add(new Person<Object>("lisi9", 29));
		hsPerson.add(new Person<Object>("lisi7", 27));
		hsPerson.add(new Person<Object>("lisi7", 27));
		hsPerson.add(new Person<Object>("lisi7", 27));
		hsPerson.add(new Person<Object>("lisi7", 27));

		for (Person<Object> person : hsPerson)
		{
			System.out.println(person);
		}

	}
}
