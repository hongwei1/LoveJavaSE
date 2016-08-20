package itcastday17.p2.linkedlist.test;
//堆栈：先进后出 First In Last Out  FILO
/*
 * stack has two functions :add and remove
 * add first and remove last
 * 
 * 
 * */

import java.util.LinkedList;

public class Stack {
	private LinkedList stackList;
	
	public Stack() {
		stackList=new LinkedList();
	}
	
	public void add(Object ob){
		stackList.add(ob);
	}
	public Object remove(){
		return stackList.removeLast();
	}
	public Object getItem( int i) {
		return stackList.get(i);
	}
}
//a b c d
