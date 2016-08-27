package itcastday17.p2.linkedlist.demo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		LinkedList<String> link = new LinkedList<String>();

		// 1，增加
		link.addFirst("abc1");
		link.add(1, "abc5");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
		link.offerFirst("abc5");
		link.offerLast("abc6");
		// 2，删除
		link.removeFirst();// 获取并移除，如果链表为空，抛出NoSuchElementException.
		link.removeLast();
		link.pollFirst();// 获取并移除，如果链表为空，返回null.
		link.pollLast();

		link.remove("abc4");
		link.remove(2);

		// 3,改
		link.set(2, "abc7");

		// 4，查
		link.get(2);
		link.getFirst();// 获取但不移除，如果链表为空，抛出NoSuchElementException.
		link.getLast();
		link.peekFirst();// 获取但不移除，如果链表为空，返回null.
		link.peekLast();
		System.out.println(link.getFirst()); // 获取第一个但不删除。
		System.out.println(link.getFirst());

		System.out.println(link.removeFirst());// 获取元素但是会删除。
		System.out.println(link.removeFirst());

		System.out.println(link);
		Iterator<String> it = link.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}

		while (!link.isEmpty())
		{
			System.out.println(link.removeLast());
		}

	}

}
