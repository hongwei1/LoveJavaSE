package itcastday17.p2.linkedlist.test;

import java.util.LinkedList;

/**
 * 队列：先进先出 First In First Out FIFO
 * 
 * @author zhanghongwei
 *
 */
public class DuiLie
{
	private LinkedList link;

	public DuiLie()
	{
		this.link = new LinkedList();
	}

	/**
	 * 队列的添加元素的功能。
	 */
	public void myAdd(Object obj)
	{
		this.link.addLast(obj);
	}

	public Object myGet()
	{
		return this.link.removeFirst();
	}

	public boolean isNull()
	{
		return this.link.isEmpty();
	}
}
