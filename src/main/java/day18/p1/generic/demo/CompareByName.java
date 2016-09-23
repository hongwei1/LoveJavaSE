package day18.p1.generic.demo;

import java.util.Comparator;

public class CompareByName implements Comparator<MyPerson> {

	@Override
	public int compare(MyPerson o1, MyPerson o2) {
		int temp =o1.getName().compareTo(o2.getName());
		return  temp==0?o1.getAge()-o2.getAge():temp;
	}

}
