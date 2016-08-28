package itcastday17.p5.treeset.demo;

import java.util.TreeSet;

import itcastday17.p.bean.Person;
import itcastday17.p5.myComparableByname;
import itcastday18.p3.comparator.ComparatorByName;

/**
 * 两种方式使用TreeSet：
 *
 * <pre>
 * 1 存储的class Person implements Comparable
 * 	TreeSet<Person> ts = new TreeSet<Person>();
 * 2 TreeSet 构造时传入比较器对象 implements Comparator。
 * 	TreeSet<Person> ts1 = new TreeSet<Person>(new ComparatorByName());
 * </pre>
 *
 * @author zhanghongwei
 *
 */
public class TreeSetDemo
{
	public static void main(String[] args)
	{

		TreeSet<Person<?>> ts = new TreeSet<Person<?>>();
		TreeSet<Person<?>> ts1 = new TreeSet<Person<?>>(new ComparatorByName<Object>());
		TreeSet<Person<?>> ts2 = new TreeSet<Person<?>>(new myComparableByname());

		/*
		 * 以Person对象年龄进行从小到大的排序。
		 *
		 */

		ts.add(new Person<Person<?>>("zhangsan", 28));
		ts.add(new Person<Person<?>>("lisi", 21));
		ts.add(new Person<Person<?>>("zhouqi", 29));
		ts.add(new Person<Person<?>>("zhaoliu", 25));
		ts.add(new Person<Person<?>>("wangu", 24));

		for (Person<?> p : ts)
		{
			System.out.println(p.getName() + ":" + p.getAge());
		}

	}
}
