package itcastday17.p2.linkedlist.test;

import java.util.ArrayList;


/*
 * 请使用LinkedList来模拟一个堆栈或者队列数据结构。
 * 
 * 堆栈：先进后出 First In Last Out  FILO
 * 
 * 队列：先进先出 First In First Out FIFO
 * 
 * 我们应该描述这样一个容器，给使用提供一个容器对象完成这两种结构中的一种。
 */


public class LinkedTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DuiLie dl = new DuiLie();
		
		dl.myAdd("abc1");
		dl.myAdd("abc2");
		dl.myAdd("abc3");
		dl.myAdd("abc4");
		
		while(!dl.isNull()){
			System.out.println(dl.myGet());
		}
		Stack s1= new Stack();
		s1.add("1");
		s1.add("2");
		s1.add("3");
		s1.add("4");
		s1.add("5");
		// 1 2 3 4 5 
		System.out.println(s1.getItem(1));
	}

}
