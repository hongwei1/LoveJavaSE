package itcastday17.p3.arraylist.test;

import java.util.ArrayList;
import java.util.Iterator;

import itcastday17.p.bean.Person;

/*
 * 定义功能去除ArrayList中的重复元素。
 */

public class ArrayListTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
//		demo();
		
//		singleDemo();
		
		
		ArrayList al = new ArrayList();
		al.add(new Person("lisi1",21));
		al.add(new Person("lisi2",22));
		al.add(new Person("lisi3",23));
		al.add(new Person("lisi4",24));
		al.add(new Person("lisi2",22));
		al.add(new Person("lisi3",23));
		System.out.println(al);
		
//		al = getSingleElement(al);
		al = getSingleElementMy(al);
		
		
//		System.out.println(al.remove(new Person("lisi2",22)));
		System.out.println(al);
		
		
		
		
	}

	private static ArrayList getSingleElementMy(ArrayList al) {
		// 产生一个新容器，把相同的存入进去。
		ArrayList temp = new ArrayList();

		for (Iterator iterator = al.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();

			if (!temp.contains(object))
				temp.add(object);
		}
		return temp;
	}

	/**
	 * 
	 */
	public static void singleDemo() {
		ArrayList al = new ArrayList();
		al.add("abc1");
		al.add("abc2");
		al.add("abc2");
		al.add("abc1");
		al.add("abc");
		System.out.println(al);
		
		al = getSingleElement(al);
		
		System.out.println(al);
		
		
	}

	public static ArrayList getSingleElement(ArrayList al) {
		
		//1,定义一个临时容器。
		ArrayList temp = new ArrayList();
		
		//2,迭代al集合。
		Iterator it = al.iterator();
		
		while(it.hasNext()){
			Object obj = it.next();
		//3,判断被迭代到的元素是否在临时容器存在。
			if(!temp.contains(obj)){
				temp.add(obj);
			}
		}
		
		return temp;
	}

	/**
	 * 
	 */
	public static void demo() {
		
//		al.add(5);//al.add(new Integer(5));
	}
	

}
