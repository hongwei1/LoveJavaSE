package itcastday18.p7.hashmap.demo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import itcastday18.p2.bean.Student;

/**
 * 将学生对象和学生的归属地通过键与值存储到map集合中。
 *
 * @author zhanghongwei
 *
 */
public class HashMapDemo
{
	public static void main(String[] args)
	{
		/*
		 * 将学生对象和学生的归属地通过键与值存储到map集合中。
		 *
		 */

		HashMap<Student, String> hm = new HashMap<Student, String>();

		hm.put(new Student("lisi", 38), "北京");
		hm.put(new Student("zhaoliu", 24), "上海");
		hm.put(new Student("xiaoqiang", 31), "沈阳");
		hm.put(new Student("wangcai", 28), "大连");
		hm.put(new Student("zhaoliu", 24), "铁岭");

		// 1 测试存入的唯一性
		// 先比较Hashcode，再比较equals,去修改Sudent的方法

		// 2 测试取出的方法
		Set<Entry<Student, String>> entrySet = hm.entrySet();
		for (Entry<Student, String> entry : entrySet)
		{

			System.out.println(entry.getValue() + ":" + entry.getKey());
		}
	}

}
