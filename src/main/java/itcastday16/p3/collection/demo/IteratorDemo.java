package itcastday16.p3.collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class IteratorDemo {
	public static void main(String[] args) {

		Collection coll = new ArrayList();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		coll.remove("abc");
		System.out.println(coll);
		System.out.println(coll.size());
		
		// 2 使用了Collection中的iterator()方法,调用集合中的迭代器方法，是为了获取集合中的迭代器对象。
		Iterator iterator = coll.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(coll.size());
		// 3 use the for loop
		for (Iterator it = coll.iterator(); it.hasNext();)
			System.out.println(it.next());

		// 1 basic use
		Iterator it = coll.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());// java.util.NoSuchElementException
		// my own practice
		coll.clear();
		myTest(coll);
	}

	private static void myTest(Collection coll) {
		System.out.println("---------My Place---------");
		coll.add(1);
//		coll.add(2);
//		coll.add(3);
//		coll.add(4);
//		coll.add(5);
//		coll.add(6);
//		coll.add(7);
//		coll.add(8);
		Iterator iterator = coll.iterator();
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		iterator.remove();
//		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());

//		iterator.remove();
		
		System.out.println(coll);
//		iterator.remove();
		
	}

}
