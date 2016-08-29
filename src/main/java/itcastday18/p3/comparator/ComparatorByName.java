package itcastday18.p3.comparator;

import java.util.Comparator;

import itcastday18.p2.bean.GrandFa;

public class ComparatorByName<T> implements Comparator<T>
{

	@Override
	public int compare(T o1, T o2)
	{
		if (o1 instanceof GrandFa && o2 instanceof GrandFa)
		{
			GrandFa o11 = (GrandFa) o1;
			GrandFa o12 = (GrandFa) o2;
			int temp = o11.getName().compareTo(o12.getName());
			return temp == 0 ? o11.getAge() - o12.getAge() : temp;
		}
		else
		{
			throw new RuntimeException("It only support " + GrandFa.class.getName() + ",do not support this type :" + o1.getClass().getName() + "at the moment");
		}

	}

}
