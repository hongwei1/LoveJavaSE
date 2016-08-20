package itcastday17.p4.hashset.demo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add("hehe");
		hs.add("heihei");
		hs.add("hahah");
		hs.add("xixii");
		hs.add("hehe");

		Iterator it = hs.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// MyPlace
		myPlace();
	}

	private static void myPlace() {
		System.out.println("--------");
		HashSet hashSet = new HashSet();
		hashSet.add("a4");
		hashSet.add("a2");
		hashSet.add("a3");
		hashSet.add("a3");
		hashSet.add("a3");
		hashSet.add("a3");
		hashSet.add("a3");
		for (Iterator iterator = hashSet.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}
}
