package goodtests;

public class T00MyTestKnow {
	// 静态方法不能被覆盖（重写）为静态方法。
	// public static void main(String[] args) {
	//// B.getName();
	// }
}

class Base {
	static void a() {
		System.out.println("A");
	}

	void b() {
		System.out.println("B");
	}
}

class Inherit extends Base {
	static void a() {
		System.out.println("C");
	}

	void b() {
		System.out.println("D");
	}

	public static void main(String args[]) {
		Base b = new Base();
		
		Base c = new Inherit();
		
		b.a();
		b.b();
		c.a();
		c.b();
	}
}