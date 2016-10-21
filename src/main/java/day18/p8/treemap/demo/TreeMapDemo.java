package day18.p8.treemap.demo;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import day18.p2.bean.Father;

/**
 * ���ֱȽ������ж�Ψһ�Խ����ͱȽ����йأ���hashCode��equals�޹�
 *
 * @author zhanghongwei
 *
 */
public class TreeMapDemo
{

	public static void main(String[] args)
	{
		// ����Tree���뵽�Ƚ����� 1 �̳бȽ��� 2 ����һ���Ƚ�����Ϊ���캯��
		TreeMap<Father, String> treeMap = new TreeMap<Father, String>();
		// TreeMap<Student, String> treeMap = new TreeMap<Student, String>(new ComparatorByName());

		treeMap.put(new Father("lisi", 38), "����");
		treeMap.put(new Father("zhaoliu", 24), "�Ϻ�");
		treeMap.put(new Father("zhaoliu1", 24), "�Ϻ�");
		treeMap.put(new Father("zhaoliu2", 24), "�Ϻ�");
		treeMap.put(new Father("zhaoliu3", 24), "�Ϻ�");
		treeMap.put(new Father("viaoqiang", 31), "����");
		treeMap.put(new Father("aangcai", 28), "����");
		treeMap.put(new Father("zhaoliu", 24), "����");

		Iterator<Map.Entry<Father, String>> it = treeMap.entrySet().iterator();

		while (it.hasNext())
		{
			Map.Entry<Father, String> me = it.next();
			Father key = me.getKey();
			String value = me.getValue();

			System.out.println(key.getName() + ":" + key.getAge() + "---" + value);
		}

	}

}