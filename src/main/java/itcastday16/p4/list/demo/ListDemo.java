package itcastday16.p4.list.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		// 1 添加元素
		list.add("abc1");
		list.add("abc55");
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("aa");

		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		// 2 插入元素。
		list.set(2, "abc9");

		// 3 删除元素。
		System.out.println("remove:" + list.remove(2));

		// 4 修改元素。
		System.out.println("set:" + list.set(1, "abc8"));

		// 5 获取元素。
		System.out.println("get:" + list.get(0));

		// 6 获取子列表。
		System.out.println("sublist:" + list.subList(1, 2));

		System.out.println(list);
	}

}
