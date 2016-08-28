package itcastday18.p8.treemap.demo;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import itcastday18.p2.bean.Student;

/**
 * 两种比较器，判断唯一性仅仅和比较器有关，和hashCode和equals无关
 *
 * @author zhanghongwei
 *
 */
public class TreeMapDemo
{

	public static void main(String[] args)
	{
		// 看到Tree就想到比较器： 1 继承比较器 2 输入一个比较器作为构造函数
		TreeMap<Student, String> treeMap = new TreeMap<Student, String>();
		// TreeMap<Student, String> treeMap = new TreeMap<Student, String>(new ComparatorByName());

		treeMap.put(new Student("lisi", 38), "北京");
		treeMap.put(new Student("zhaoliu", 24), "上海");
		treeMap.put(new Student("zhaoliu1", 24), "上海");
		treeMap.put(new Student("zhaoliu2", 24), "上海");
		treeMap.put(new Student("zhaoliu3", 24), "上海");
		treeMap.put(new Student("viaoqiang", 31), "沈阳");
		treeMap.put(new Student("aangcai", 28), "大连");
		treeMap.put(new Student("zhaoliu", 24), "铁岭");

		Iterator<Map.Entry<Student, String>> it = treeMap.entrySet().iterator();

		while (it.hasNext())
		{
			Map.Entry<Student, String> me = it.next();
			Student key = me.getKey();
			String value = me.getValue();

			System.out.println(key.getName() + ":" + key.getAge() + "---" + value);
		}

	}

}
