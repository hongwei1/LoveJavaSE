package day17.p2.linkedlist.test;

/**
 * 请使用LinkedList来模拟一个堆栈或者队列数据结构。
 *
 * 堆栈：先进后出 First In Last Out FILO
 *
 * 队列：先进先出 First In First Out FIFO
 *
 * 我们应该描述这样一个容器，给使用提供一个容器对象完成这两种结构中的一种。
 */

public class LinkedTest
{
	public static void main(String[] args)
	{
		DuiLie dl = new DuiLie();

		dl.myAdd("1");
		dl.myAdd("2");
		dl.myAdd("3");
		dl.myAdd("4");

		while (!dl.isNull())
		{
			System.out.println(dl.myGet());
		}
		System.out.println("----------------------");
		Stack s1 = new Stack();
		s1.add("1");
		s1.add("2");
		s1.add("3");
		s1.add("4");
		s1.add("5");
		// 1 2 3 4 5
		while (!s1.isNull())
		{
			System.out.println(s1.myGet());
		}
		// System.out.println(s1.getItem(1));
	}

}
