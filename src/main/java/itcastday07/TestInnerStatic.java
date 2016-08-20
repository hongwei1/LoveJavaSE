package itcastday07;
//http://liqita.iteye.com/blog/1216082 可以继续读读，看看权限的控制，我写的不多，不好理解，目前。

import itcastday07.TestInnerStatic.InnerClass;

class TestInnerStatic {
	public static class InnerClass {
		public static void doSomething() {
			System.out.println("private Class doSomething");
		}
	}

	public static void main(String[] args) {
		InnerClass.doSomething();
	}
}

class Test {
	public static void main(String[] args) {
		InnerClass.doSomething();
	}
}