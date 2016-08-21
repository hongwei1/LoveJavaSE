package itcastday16.p3.collection.demo;

import java.security.acl.Permission;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import commontools.*;;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
		show(coll);
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		show(c1, c2);
		
//		myPracticeSpace();

	}

	/**
	 * @param c1
	 */
	private static void myPracticeSpace() {
		System.out.println("--------My free test space-------");
		//my practice to know more about the array and objects
		int [] arr= new int[3];
		Person [] person = new Person [2];
		for (int i = 0; i < person.length; i++) {
			person[i]= new Person(String.valueOf(i),i);
		}
		System.out.println(person[1].getAge()+person[1].getName());
		//my practice to know more about the collections and objects
		Collection c1= new ArrayList();	
		c1.add(new Person [2]);
		c1.add(null);
		c1.add(5.5);
		c1.add(true);
		c1.add('a');
		c1.add("I love you");
		c1.add(arr);
		System.out.println("----"+c1.size());
		for (Iterator iterator = c1.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(""+object);
		}
		
		
		//end my practice
	}

	public static void show(Collection c1, Collection c2) {

		// 给c1添加元素。
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");

		// 给c2添加元素。
		c2.add("abc1");
		c2.add("abc2");
		c2.add("abc3");
		c2.add("abc4");
		c2.add("abc5");

		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);

		// 1 演示addAll
		c1.addAll(c2);//将c2中的元素添加到c1中。

		// 2 演示removeAll
		 boolean b = c1.removeAll(c2);//将两个集合中的相同元素从调用removeAll的集合中删除。
		 System.out.println("removeAll:"+b);

		// 3 演示retainAll -- 和removeAll功能相反 。
//		boolean b = c1.retainAll(c2);// 取交集，保留和指定的集合相同的元素，而删除不同的元素。
		System.out.println("retainAll:" + b);
		
		// 4 演示containsAll
//		boolean b = c1.containsAll(c2);
		System.out.println("containsAll:"+b);
		
		System.out.println("c1:" + c1);
	}

	public static void show(Collection coll) {

		// 1,添加元素。add.

		coll.add("Love you ");
		coll.add("haha");
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.addAll(coll);
		System.out.println(coll);

		// 2，删除元素。remove
		System.out.println(coll.size());
		System.out.println(coll.remove("abc2"));//会改变集合的长度
		System.out.println(coll.size());
		System.out.println(coll.remove("xxx"));//会改变集合的长度
		System.out.println(coll.size());
		
		// 3 清空集合.
		coll.clear();//会改变集合的长度
		System.out.println(coll.size());
		coll.removeAll(coll);
		System.out.println(coll.size());
		System.out.println(coll.contains("abc3"));

		System.out.println(coll);

	}

}
