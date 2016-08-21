package itcastday11;

interface InterTest {
	void show();
}

class Outer {
	// 补足代码 (建议用匿名内部类)
	static InterTest method() {
		return new InterTest() {
			public void show() {
				System.out.println("InnerClass function !!!");
			}
		};
	}
}

/*
 * class haha implements InterTest { public void show(){} }
 */
class InnerClassTest {
	public static void main(String[] args) {
		Outer.method().show();
	}
}
