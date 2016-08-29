package itcastday18.p2.bean;

public class Son extends Father {

	public Son() {
		super();
		
	}

	public Son(String name, int age) {
		super(name, age);
		
	}

	@Override
	public String toString() {
		
		return "Worker:"+getName()+":"+getAge();
	}
	
	
 
}
