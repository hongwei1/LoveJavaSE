package itcastday18.p4.generic.define.demo;

import itcastday17.p.bean.Person;

public class MyTool <P>{
	P object;

	/**
	 * @return the object
	 */
	public P getObject() {
		return object;
	}

	/**
	 * @param object the object to set
	 */
	public P setObject(P object) {
		return this.object;
	}
	
//	public void show(String s){
//		System.out.println(s);
//	}
//
//	public void show(int i) {
//		System.out.println(i);
//	}
//	
//	public void show(Object i) {
//		System.out.println(i);
//	}
	public <T>void show(T i) {
		System.out.println(i);
	}
}
