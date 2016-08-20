package itcastday18.p1.generic.demo;

import java.util.Iterator;
import java.util.TreeSet;

import itcastday18.p2.bean.Person;
import itcastday18.p3.comparator.ComparatorByName;

public class GenericDemo2 {
	public static void main(String[] args) {

		TreeSet<Person> ts = new TreeSet<Person>(new ComparatorByName());
		ts.add(new Person("lisi8", 21));
		ts.add(new Person("lisi3", 23));
		ts.add(new Person("lisi", 21));
		ts.add(new Person("lis0", 20));

		Iterator<Person> it = ts.iterator();
		while (it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName() + ":" + p.getAge());
		}

		// my Place
//		myPlace();
	}

	/**
	 * my own place try to use it
	 */
	private static void myPlace() {
		System.out.println("--------");
		TreeSet<MyPerson> personTreeList = new TreeSet<MyPerson>();
//		TreeSet<MyPerson> personTreeList = new TreeSet<MyPerson>(new CompareByAge());
		personTreeList.add(new MyPerson("d", 1));
		personTreeList.add(new MyPerson("c", 2));
		personTreeList.add(new MyPerson("b", 3));
		personTreeList.add(new MyPerson("a", 4));
		
		for (Iterator iterator = personTreeList.iterator(); iterator.hasNext();) {
			MyPerson myPerson = (MyPerson) iterator.next();
			System.out.println(myPerson.getAge()+myPerson.getName());
		}

	}

}
