package itcastday18.p4.generic.define.demo;

import itcastday17.p.bean.PersionMy;
import itcastday18.p2.bean.Person;
import itcastday18.p2.bean.Student;

public class GenericDefineDemo3 {
	public static void main(String[] args) {

		Tool<Student> tool = new Tool<Student>();

		// tool.setObject(new Worker());
		// Student stu = tool.getObject();
		// Tool tool = new Tool();
		// tool.setObject(new Worker());
		// Student stu = (Student)tool.getObject();

		// my place
		myPlace();

	}

	/**
	 * 
	 */
	private static void myPlace() {
		MyGeneric<Person> gP = new MyGeneric<Person>();
		gP.setT(new Person());
		gP.getT();

		MyTool<PersionMy> t1 = new MyTool<PersionMy>();
		t1.setObject(new PersionMy());
		// t1.setObject(new Worker());
		PersionMy p = t1.getObject();
	}

}
