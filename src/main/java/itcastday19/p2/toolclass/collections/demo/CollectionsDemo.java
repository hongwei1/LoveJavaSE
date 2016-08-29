package itcastday19.p2.toolclass.collections.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

import itcastday19.p2.comparator.ComparatorByLength;

/**
 * Collections：是集合框架的工具类,里面的方法都是静态的。
 *
 */
public class CollectionsDemo
{

	public static void main(String[] args)
	{

		CollectionsDemo.demo_1();
		CollectionsDemo.demo_2();
		CollectionsDemo.demo_3();
		CollectionsDemo.demo_4();
		CollectionsDemo.demo_5();
	}

	/**
	 * 同步
	 */
	public static void demo_5()
	{
		List<Object> list = new ArrayList<Object>();// 非同步的。
		list = MyCollections.synList(list); // 返回一个同步的list.
		List<Object> synchronizedList = Collections.synchronizedList(list);
		System.out.println(synchronizedList);
	}

	/**
	 * replaceAll,shuffle,fill
	 */
	public static void demo_4()
	{ // shuffle
		List<String> list = new ArrayList<String>();

		list.add("abcde");
		list.add("cba");
		list.add("zhangsan");
		list.add("zhaoliu");
		list.add("xiaoqiang");

		System.out.println(list);
		Collections.replaceAll(list, "cba", "nba"); // set(indexOf("cba"),"nba");
		Collections.shuffle(list);
		Collections.fill(list, "cc");
		System.out.println(list);
	}

	/**
	 * reverseOrder
	 */
	public static void demo_3()
	{

		TreeSet<String> ts1 = new TreeSet<String>(new Comparator<String>()
		{
			@Override
			public int compare(String o1, String o2)
			{

				int temp = o2.compareTo(o1);
				return temp;
			}
		});

		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new ComparatorByLength()));

		ts.add("abc");
		ts.add("hahaha");
		ts.add("zzz");
		ts.add("aa");
		ts.add("cba");

		System.out.println(ts);

	}

	/**
	 * 获取最大值。
	 */
	public static void demo_2()
	{
		List<String> list = new ArrayList<String>();

		list.add("abcde");
		list.add("cba");
		list.add("aa");
		list.add("zzz");
		list.add("cba");
		list.add("nbaa");
		System.out.println(list);

		int index = Collections.binarySearch(list, "cba");
		System.out.println("index=" + index);

		// 获取最大值。
		String max = Collections.max(list, new ComparatorByLength());
		System.out.println("max=" + max);
	}

	/**
	 * 对list集合进行指定顺序的排序。
	 */
	public static void demo_1()
	{

		List<String> list = new ArrayList<String>();

		list.add("abcde");
		list.add("cba");
		list.add("aa");
		list.add("zzz");
		list.add("cba");
		list.add("nbaa");
		System.out.println(list);

		// 对list集合进行指定顺序的排序。
		Collections.sort(list);
		CollectionsDemo.mySort(list);

		Collections.sort(list, new ComparatorByLength());
		CollectionsDemo.mySort(list, new ComparatorByLength());

		System.out.println(list);

	}

	/**
	 * 传入比较器.
	 *
	 * @param list
	 * @param comp
	 */
	public static <T> void mySort(List<T> list, Comparator<? super T> comp)
	{

		for (int i = 0; i < list.size() - 1; i++)
		{

			for (int j = i + 1; j < list.size(); j++)
			{

				if (comp.compare(list.get(i), list.get(j)) > 0)
				{
					Collections.swap(list, i, j);
				}
			}
		}
	}

	/**
	 * 集合中的对象自身具有比较性.
	 *
	 * @param list
	 */
	public static <T extends Comparable<? super T>> void mySort(List<T> list)
	{

		// 排序1 bubble or select ?
		for (int outIndex = 0; outIndex < list.size() - 1; outIndex++)
		{
			T outerLoop = list.get(outIndex);
			for (int innerIndex = outIndex; innerIndex < list.size(); innerIndex++)
			{
				T innerLoop = list.get(innerIndex);
				if (innerLoop.compareTo(outerLoop) < 0)
				{
					Collections.swap(list, outIndex, innerIndex);
				}

			}

		}

		// for (int i = 0; i < list.size() - 1; i++)
		// {
		//
		// for (int j = i + 1; j < list.size(); j++)
		// {
		//
		// if (list.get(i).compareTo(list.get(j)) > 0)
		// {
		//
		// // T temp = list.get(i);
		// // list.set(i, list.get(j));
		// // list.set(j, temp);
		// Collections.swap(list, i, j);
		//
		// }
		// }
		// }
	}

}

/**
 * 链表加同步锁
 */
class MyCollections
{
	public static List<Object> synList(List list)
	{

		return new MyList(list);
	}

	private static class MyList implements List
	{
		private List list;

		private static final Object lock = new Object();

		MyList(List list)
		{
			this.list = list;
		}

		@Override
		public boolean add(Object obj)
		{
			synchronized (MyList.lock)
			{
				return this.list.add(obj);
			}
		}

		@Override
		public int size()
		{
			return 0;
		}

		@Override
		public boolean isEmpty()
		{
			return false;
		}

		@Override
		public boolean contains(Object o)
		{
			return false;
		}

		@Override
		public Iterator iterator()
		{
			return null;
		}

		@Override
		public Object[] toArray()
		{
			return null;
		}

		@Override
		public Object[] toArray(Object[] a)
		{
			return null;
		}

		@Override
		public boolean containsAll(Collection c)
		{
			return false;
		}

		@Override
		public boolean addAll(Collection c)
		{
			return false;
		}

		@Override
		public boolean addAll(int index, Collection c)
		{
			return false;
		}

		@Override
		public boolean removeAll(Collection c)
		{
			return false;
		}

		@Override
		public boolean retainAll(Collection c)
		{
			return false;
		}

		@Override
		public void clear()
		{
		}

		@Override
		public Object get(int index)
		{
			return null;
		}

		@Override
		public Object set(int index, Object element)
		{
			return null;
		}

		@Override
		public void add(int index, Object element)
		{
		}

		@Override
		public Object remove(int index)
		{
			return null;
		}

		@Override
		public int indexOf(Object o)
		{
			return 0;
		}

		@Override
		public int lastIndexOf(Object o)
		{
			return 0;
		}

		@Override
		public ListIterator listIterator()
		{
			return null;
		}

		@Override
		public ListIterator listIterator(int index)
		{
			return null;
		}

		@Override
		public List subList(int fromIndex, int toIndex)
		{
			return null;
		}

		@Override
		public boolean remove(Object o)
		{
			return false;
		}

	}
}
