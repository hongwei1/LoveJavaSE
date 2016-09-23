package day18.p6.map.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import day18.p6.map.demo.MyMap.MyEntry;

public class MapDemo
{

	public static void main(String[] args)
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		// 添加元素。
		System.out.println(map.put(8, "wangcai"));// null
		System.out.println(map.put(8, "xiaoqiang"));// wangcai 存相同键，值会覆盖。
		map.put(2, "zhangsan");
		map.put(7, "zhaoliu");

		// 删除。
		System.out.println("remove:" + map.remove(2));

		// 判断。
		System.out.println("containskey:" + map.containsKey(7));

		// 获取。
		System.out.println("get:" + map.get(6));

		// three ways to iterator the items
		MapDemo.threeIteratorMethods(map);
	}

	public static void threeIteratorMethods(Map<Integer, String> map)
	{
		// 1 values得到
		map.put(8, "zhaoliu");
		map.put(2, "zhaoliu");
		map.put(7, "xiaoqiang");
		map.put(6, "wangcai");
		map.put(null, "wangcai");
		map.put(null, "wangcai");

		Collection<String> values = map.values();
		for (String string : values)
		{
			System.out.println(string);
		}

		// 2取出map中的所有元素。
		// 原理，通过keySet方法获取map中所有的键所在的Set集合，在通过Set的迭代器获取到每一个键，
		// 在对每一个键通过map集合的get方法获取其对应的值即可。
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it3 = keySet.iterator();

		while (it3.hasNext())
		{
			Integer key = it3.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);

		}

		// 3 通过Map转成set就可以迭代。 找到了另一个方法。entrySet。
		// 该方法将键和值的映射关系作为对象存储到了Set集合中，
		// 而这个映射关系的类型就是Map.Entry类型(结婚证)

		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
		while (it.hasNext())
		{
			Map.Entry<Integer, String> me = it.next();
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println(key + "::::" + value);

		}

		// 4理解内部类
		// 自定义内部类的方式：
		Set<MyMap.MyEntry<Integer, String>> set = new HashSet<MyMap.MyEntry<Integer, String>>();

		for (MyEntry<Integer, String> myEntry : set)
		{
			System.out.println(myEntry);
		}

	}

}

interface MyMap // BK --day10 Class 9Inner class 5例子 1内部接口
{
	public interface MyEntry<K, V> // MyEntry必须现有MyMap才有它，所有用内部类。只有先结婚，才有结婚证。
	{
		void get();
	}
}

class MyDemo implements MyMap.MyEntry<Integer, String>
{

	@Override
	public void get()
	{
		System.out.println("hhh");
	}

	public static void main(String[] args)
	{
		new MyMap.MyEntry<Integer, String>()
		{
			@Override
			public void get()
			{
				System.out.println("hhh");
			}
		}.get();
	}
}
