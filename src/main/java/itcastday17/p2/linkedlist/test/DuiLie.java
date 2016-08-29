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

/**
 * <pre>
 * 队列：先进先出 First In First Out FIFO
 * Fifo fifo =new Filo();
 * fifo.add(1);
 * fifo.add(2);
 * fifo.add(3);
 *
 * fifo.get() ->1
 * fifo.get() ->2
 *
 * </pre>
 *
 * @author zhanghongwei
 *
 */
class MyFifo
{
	// LinkedList<String> linkedList = new LinkedList<String>();
	String[] linkedList = new String[100];

	int pos = 0;
	int sus = 0;

	// use the linkedList to make it.
	void add(String value)
	{
		this.linkedList[this.pos++] = value;
	}

	String get()
	{
		return this.linkedList[this.sus++];
	}

	public static void main(String[] args)
	{
		MyFifo myFifo = new MyFifo();
		myFifo.add("1");
		myFifo.add("2");
		myFifo.add("3");

		System.out.println(myFifo.get());
		System.out.println(myFifo.get());
	}

}