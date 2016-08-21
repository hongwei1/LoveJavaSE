package itcastday18.p1.generic.demo;

import java.util.Comparator;

public class MyPerson implements Comparable<MyPerson> ,Comparator<MyPerson>{

	private String name;
	private int age;
	public MyPerson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public int compare(MyPerson o1, MyPerson o2) {
		// age compare 
		int temp = o1.getAge()-o2.getAge();
		return temp==0?o1.getName().compareTo(o2.getName()):temp;
	}


	@Override
	public int compareTo(MyPerson o) {
		int temp = this.getAge()-o.getAge();
		return temp==0?this.getName().compareTo(o.getName()):temp;
	}

}
