package itcastday17.p5;

import java.util.Comparator;

import itcastday17.p.bean.Person;

public class myComparableByname implements Comparator<Object>
{
	@Override
	public int compare(Object o1, Object o2)
	{
		Person p1 = (Person) o1;
		Person p2 = (Person) o2;
		return p1.getName().compareTo(p2.getName());
	}

}
