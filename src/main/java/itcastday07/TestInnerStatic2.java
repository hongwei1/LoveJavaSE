package itcastday07;
//http://liqita.iteye.com/blog/1216082 可以继续读读，看看权限的控制，我写的不多，不好理解，目前。

 class TestInnerStatic2 {

	protected  class InnerClass {

		public  void doSomething() {

			System.out.println("private Class doSomething");
		}

	}

	public static void main(String[] args) {

		new TestInnerStatic2().new InnerClass().doSomething();;

	}
}
 
 class Test2{
	 public static void main(String[] args) {
		 new TestInnerStatic2().new InnerClass().doSomething();
	}
 }