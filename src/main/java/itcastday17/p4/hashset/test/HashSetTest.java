package itcastday17.p4.hashset.test;

import java.util.HashSet;
import java.util.Iterator;

import itcastday17.p.bean.PersionMy;
import itcastday17.p.bean.Person;


/*
 * 往hashSet集合中存储Person对象。如果姓名和年龄相同，视为同一个人。视为相同元素。
 */
public class HashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashSet hs = new HashSet();
		/*
		 * HashSet集合数据结构是哈希表，所以存储元素的时候，
		 * 使用的元素的hashCode方法来确定位置，如果位置相同，在通过元素的equals来确定是否相同。
		 * 
		 */
		
		hs.add(new Person("lisi4",24));
		hs.add(new Person("lisi7",27));
		hs.add(new Person("lisi1",21));
		hs.add(new Person("lisi9",29));
		hs.add(new Person("lisi7",27));
		
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			Person p = (Person)it.next();
			System.out.println(p);
//			System.out.println(p.getName()+"...."+p.getAge());
		}
		//My place
		myPlace();
		
	}

	private static void myPlace() {
		System.out.println("----myPlace------");
		HashSet personLish = new HashSet();
		personLish.add(new PersionMy("Hongwei", 28));
		personLish.add(new PersionMy("Yanlu", 25));
		personLish.add(new PersionMy("Laoguan", 33));
		personLish.add(new PersionMy("Defu", 32));
		personLish.add(new PersionMy("Defu", 32));
		personLish.add(new PersionMy("Defu", 32));
		personLish.add(new PersionMy("Defu", 34));
		personLish.add(new PersionMy("Def", 32));
		
		for (Iterator iterator = personLish.iterator(); iterator.hasNext();) {
			PersionMy object = (PersionMy) iterator.next();
			System.out.println(object.getName()+object.getAge());
		}
		
	}

}
