package itcastday18.p2.bean;

public class Worker extends Student {

	public Worker() {
		super();
		
	}

	public Worker(String name, int age) {
		super(name, age);
		
	}

	@Override
	public String toString() {
		
		return "Worker:"+getName()+":"+getAge();
	}
	
	
 
}
