package itcastday10;

/*
1 definition
	将一个类定义在另一个类的里面，对里面那个 类就称为内部类（内置类，嵌套类）。

2 内部类访问特点：
	1，内部类可以直接访问外部类中的成员。 		--即使private 也可以访问
	2，外部类要访问内部类，必须建立内部类的对象。 --即使private 也可以访问
	
	eg: Outer out = new Outer();
		out.method();

3 一般用于类的设计：
	分析事物时，发现该事物描述中还有事物，而且这个事物还在访问被描述事物的内容。
	这时就是还有的事物定义成内部类来描述。
	eg: I have heart. The heart is inner class, it use lots of my body resource.

4  three call ways
	1  直接访问外部类中的内部类中的成员。
	// Outer.Inner in = new Outer().new Inner();
	// in.show();
	
	2  如果内部类是静态的。 相当于一个外部类
	// Outer.Inner in = new Outer.Inner();
	// in.show();
	
	3  如果内部类是静态的，成员是静态的。 
	// Outer.Inner.function();
	
	tips:if Inner method is static,  the inner class must be static.

5 为什么内部类能直接访问外部类中成员呢？
	那是因为内部类持有了外部类的引用。  "外部类名.this"
	eg: System.out.println(Outer2.this.num);
	
6 内部类可以存放在局部位置上。 
	内部类在局部位置上只能访问局部中被final修饰的局部变量。
	
*/

class Outer {
	private static int num = 31;

	class  Inner// 内部类。
	{
		void show() {
			System.out.println("show run..." + num);
		}
		/*
		 * static void function()//如果内部类中定义了静态成员，该内部类也必须是静态的。 {
		 * System.out.println("function run ...."+num); }
		 */
	}

	static public void method() {
//		Inner in = new Inner();
//		in.show();
	}
}

class InnerClassDemo {
	public static void main(String[] args) {
		 Outer out = new Outer();
		 out.method();
		// 直接访问外部类中的内部类中的成员。
		// Outer.Inner in = new Outer().new Inner();
		// in.show();

		// 如果内部类是静态的。 相当于一个外部类
		// Outer.Inner in = new Outer.Inner();
		// in.show();

		// 如果内部类是静态的，成员是静态的。
		// Outer.Inner.function();

	}
}
