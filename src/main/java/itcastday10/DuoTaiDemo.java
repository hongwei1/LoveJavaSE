package itcastday10;
/*
1 definition  对象的多态性:父类型引用指向了子类对象。
	class 动物{}
	class 猫 extends 动物{}
	class 狗 extends 动物 {}
	猫 x = new 猫();
	动物 x = new 猫();//一个对象，两种形态。

	猫这类事物即具备者猫的形态，又具备着动物的形态。
	这就是对象的多态性。 
	简单说：就是一个对象对应着不同类型. 

	多态在代码中的体现：
		父类或者接口的引用指向其子类的对象。

2 多态的好处：
	提高了代码的扩展性，前期定义的代码可以使用后期的内容。
	eg:void method(Animal a)//Animal a = new Dog();  only design a method.

3 多态的弊端：
	前期定义的内容不能使用(调用)后期子类的特有内容。
	eg:a.catchMouse(); // a is animal ,but catMouse is belong to cat. it can not use there.

4 多态的前提：
	1，必须有关系，继承，实现。
	2，要有覆盖。 

5 转型
	1 向上转型
		Animal a = new Cat(); 
		//自动类型提升，猫对象提升了动物类型。但是特有功能无法s访问。
		//作用就是限制对特有功能的访问。
		//专业讲：向上转型。将子类型隐藏。就不用使用子类的特有方法。
	2 向下转型 
		//如果还想用具体动物猫的特有功能,你可以将该对象进行向下转型。
		Cat c = (Cat)a;//向下转型的目的是为了使用子类中的特有方法。
		c.eat();
		c.catchMouse();
	3 注意：对于转型，自始自终都是子类对象在做着类型的变化。
		Animal a1 = new Dog();
		Cat c1 = (Cat)a1;//ClassCastException
	4 eg:DuoTaiDemo2.java -- 毕老师和毕姥爷的故事。
		毕姥爷 x= 毕老师();  dress up as father.No his own functions.
		
		毕老师 y= (毕老师)x;  turn into himself, has many own features.
		
6 if(a instanceof Cat)
		instanceof：用于判断对象的具体类型,只能用于引用数据类型判断
		通常在向下转型前用于健壮性的判断。

7 成员的特点： eg:DuoTaiDemo3.java
	1，成员变量。
		编译时：参考引用型变量所属的类中的是否有调用的成员变量，有，编译通过，没有，编译失败。
		运行时：参考引用型变量所属的类中的是否有调用的成员变量，并运行该所属类中的成员变量。
		简单说：编译和运行都参考等号的左边。哦了。
		eg: only care about in the Fu class
			Fu f = new Zi();
			f.show();
			
	2，成员函数(非静态)。
		编译时：参考引用型变量所属的类中的是否有调用的函数。有，编译通过，没有，编译失败。
		运行时：参考的是对象所属的类中是否有调用的函数。
		简单说：编译看左边，运行看右边。
	
		tips: why is it different from variables? 
			  因为成员函数存在覆盖特性。
		eg  : Fu f = new Zi();
			f.show();
			
	3，静态函数。
		编译时：参考引用型变量所属的类中的是否有调用的静态方法。
		运行时：参考引用型变量所属的类中的是否有调用的静态方法。
		简单说，编译和运行都看左边。

		tips: 其实对于静态方法，是不需要对象的。直接用类名调用即可。
		eg :f.staticMethod();
*/

abstract class Animal {
	abstract void eat();
}

class Dog extends Animal {
	void eat() {
		System.out.println("啃骨头");
	}

	void lookHome() {
		System.out.println("看家");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("吃鱼");
	}

	void catchMouse() {
		System.out.println("抓老鼠");
	}
}

class Pig extends Animal {
	void eat() {
		System.out.println("饲料");
	}

	void gongDi() {
		System.out.println("拱地");
	}
}

class DuoTaiDemo {
	public static void main(String[] args) {
		
		// Cat c = new Cat();
		// c.eat();
		// c.catchMouse();

		Animal a = new Cat(); // 自动类型提升，猫对象提升了动物类型。但是特有功能无法s访问。
								// 作用就是限制对特有功能的访问。
								// 专业讲：向上转型。将子类型隐藏。就不用使用子类的特有方法。
		// a.eat();

		// 如果还想用具体动物猫的特有功能。
		// 你可以将该对象进行向下转型。
		// Cat c = (Cat)a;//向下转型的目的是为了使用子类中的特有方法。
		// c.eat();
		// c.catchMouse();

		// 注意：对于转型，自始自终都是子类对象在做着类型的变化。
		// Animal a1 = new Dog();
		// Cat c1 = (Cat)a1;//ClassCastException

		/*
		 * Cat c = new Cat();
		 * 
		 * // Dog d = new Dog();
		 * 
		 * // c.eat(); method(c); // method(d); // method(new Pig());
		 */

		method(new Dog());
	}

	public static void method(Animal a)// Animal a = new Dog();
	{
		a.eat();

		// a.catchMouse();
		if (a instanceof Cat) // instanceof：用于判断对象的具体类型。只能用于引用数据类型判断
		// //通常在向下转型前用于健壮性的判断。

		{
			Cat c = (Cat) a;
			c.catchMouse();
		} else if (a instanceof Dog) {
			Dog d = (Dog) a;
			d.lookHome();
		} else {

		}

	}
	/*
	 * public static void method(Cat c) { c.eat(); } public static void
	 * method(Dog d) {
	 * 
	 * }
	 */
}
