package itcastday18.p5.generic.advance.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import itcastday18.p2.bean.Person;
import itcastday18.p2.bean.Student;
import itcastday18.p2.bean.Worker;

public class GenericAdvanceDemo2 {
	public static void main(String[] args) {

		ArrayList<Person> al = new ArrayList<Person>();
		
		al.add(new Person("abc",30));
		al.add(new Person("abc4",34));
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		
		al2.add(new Student("stu1",11));
		al2.add(new Student("stu2",22));
		ArrayList<String> al3 = new ArrayList<String>();
		
		al3.add("stu3331");
		al3.add("stu33332");
		
		printCollection(al);
		printCollection(al2);
//		printCollection(al3); // 输入的参数有上限
							  // printCollection(Collection<? extends Person> al) 
		
		ArrayList<Worker> al4 = new ArrayList<Worker>();
		al4.add(new Worker("work1",11));
		al4.add(new Worker("work2",22));
		printCollection(al4); // 输入的参数有下限
		  // printCollection(Collection<? super Student> al) 
		
		
		
	}

	/**
	 * 迭代并打印集合中元素。
	 * 
	 * 可以对类型进行限定：
	 * ? extends E:接收E类型或者E的子类型对象。上限！
	 * 
	 * ? super E ：接收E类型或者E的父类型。下限！
	 * @param al
	 */
	public static void printCollection(Collection<? extends Person> al) {//Collection<Dog> al = new ArrayList<Dog>()
		Iterator<? extends Person> it = al.iterator();
		
		while(it.hasNext()){
//			T str = it.next();
//			System.out.println(str);
//			System.out.println(it.next().toString());
			Person p = it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
		
	}
	
	/*public static void printCollection(Collection<? super Student> al){
		Iterator<? super Student> it = al.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}*/

}
