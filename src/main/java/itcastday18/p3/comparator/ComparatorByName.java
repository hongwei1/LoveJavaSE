package itcastday18.p3.comparator;

import java.util.Comparator;

import itcastday17.p.bean.Person;

public class ComparatorByName<T> implements Comparator<T>
{

	@Override
	public int compare(T o1, T o2)
	{
		if (o1 instanceof Person<?> && o2 instanceof Person<?>)
		{
			Person<?> o11 = (Person<?>) o1;
			Person<?> o12 = (Person<?>) o2;
			int temp = o11.getName().compareTo(o12.getName());
			return temp == 0 ? o11.getAge() - o12.getAge() : temp;
		}
		else
		{
			throw new RuntimeException();
		}

	}

}
