package itcastday10;

abstract class Animal
{
	abstract void eat();
}

class Dog extends Animal
{
	@Override
	void eat()
	{
		System.out.println("啃骨头");
	}

	void lookHome()
	{
		System.out.println("看家");
	}
}

class Cat extends Animal
{
	@Override
	void eat()
	{
		System.out.println("吃鱼");
	}

	void catchMouse()
	{
		System.out.println("抓老鼠");
	}
}

class Pig extends Animal
{
	@Override
	void eat()
	{
		System.out.println("饲料");
	}

	void gongDi()
	{
		System.out.println("拱地");
	}
}

class DuoTaiDemo
{
	public static void main(String[] args)
	{

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

		DuoTaiDemo.method(new Dog());
	}

	public static void method(Animal a)// Animal a = new Dog();
	{
		a.eat();

		// a.catchMouse(); //BK --day10 Class 8Polymorphism 3instanceof
		if (a instanceof Cat) // instanceof：用于判断对象的具体类型。只能用于引用数据类型判断
		// 通常在向下转型前用于健壮性的判断。

		{
			Cat c = (Cat) a;
			c.catchMouse();
		}
		else if (a instanceof Dog)
		{
			Dog d = (Dog) a;
			d.lookHome();
		}
		else
		{

		}

	}
}
