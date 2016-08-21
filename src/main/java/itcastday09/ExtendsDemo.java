package itcastday09;

class Fu0 {

}

class Zi0 extends Fu0 {
	public Zi0() {
	super();
	}
	 void show()
	{
//		System.out.println("this:"+super); Wrong word ,it can not use here.
	}
}

class ExtendsDemo {
	public static void main(String[] args) {
		Zi0 z = new Zi0();
		System.out.println("z=" + z);
		z.show();
	}
}
