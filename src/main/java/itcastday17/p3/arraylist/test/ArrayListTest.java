/**
 * 请定义ArryaList集合，并存储Person对象。如new Person("lisi",20);
	并取出。将姓名和年龄打印出来。
	@author zhanghongwei
 * */
package itcastday17.p3.arraylist.test;

import java.util.ArrayList;
import java.util.Iterator;

import itcastday17.p.bean.Person;

public class ArrayListTest
{
	public static void main(String[] args)
	{
		Person p1 = new Person("lisi1", 21);
		Object ma = 6;
		System.out.println(ma);
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(p1);
		al.add(new Person("lisi2", 22));
		al.add(new Person("lisi3", 23));
		al.add(new Person("lisi4", 24));

		Iterator<Person> it = al.iterator();
		while (it.hasNext())
		{
			Person p = it.next();
			System.out.println(p);
		}
	}
}
