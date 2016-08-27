package itcastday17.p2.linkedlist.test;
/*
 * stack has two functions :add and remove
 * add first and remove last
 *
 * */

import java.util.LinkedList;

/**
 * 堆栈：先进后出 First In Last Out FILO
 * 
 * @author zhanghongwei
 *
 */
public class Stack
{
	private LinkedList stackList;

	public Stack()
	{
		this.stackList = new LinkedList();
	}

	public void add(Object ob)
	{
		this.stackList.add(ob);
	}

	public Object myGet()
	{
		return this.stackList.removeLast();
	}

	public Object remove()
	{
		return this.stackList.removeLast();
	}

	public Object getItem(int i)
	{
		return this.stackList.get(i);
	}

	public boolean isNull()
	{
		return this.stackList.isEmpty();
	}
}
