package itcastday18.p4.generic.define.demo;

import itcastday17.p.bean.Person;

public class GenericDefineDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Tool<String> tool = new Tool<String>();
		
		tool.show(new Integer(4));
		tool.show("abc");
		tool.print("hahah");
//		tool.print(new Integer(8));
		Tool.method("haha");
		Tool.method(new Integer(9));
		
		//myPlace
		myPlace();
	}

	private static void myPlace() {
		System.out.println("------");
		MyTool<String> g1= new MyTool<String>();
		g1.show("hh");
		g1.show(3);
		g1.show(new Person("hongwei",12));
		
	}
	

}
