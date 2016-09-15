package day10;

interface a
{

}

abstract class Animal implements a
{
	String name = "Yanlu";

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
	String carName = "Diandian";

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
	Cat c212 = new Cat();
	Dog c222 = new Dog();

	public static void main(String[] args)
	{

		Cat c = new Cat();
		System.out.println(c.carName);
		c.eat();
		c.catchMouse();

		Animal a = new Cat(); // 自动类型提升，猫对象提升了动物类型。但是特有功能无法访问-catchMouse。
		a.eat(); // 作用就是限制对特有功能的访问。
					// 专业讲：向上转型。将子类型隐藏。就不用使用子类的特有方法。
		System.out.println(a.name);

		// 如果还想用具体动物猫的特有功能。
		// 你可以将该对象进行向下转型。
		if (a instanceof Cat)
		{
			Cat c1 = (Cat) a;// 向下转型的目的是为了使用子类中的特有方法。
			c1.eat();
			c1.catchMouse();
		}

		// 注意：对于转型，自始自终都是子类对象在做着类型的变化。
		Animal a1 = new Dog();
		// ! Cat c1 = (Cat) a1; ClassCastException

		method(new Dog());
	}

	public static void method(Animal a)// Animal a = new Dog();
	{

		// BK --day10 Class 8Polymorphism 3instanceof
		// instanceof：用于判断对象的具体类型。只能用于引用数据类型判断
		// 通常在向下转型前用于健壮性的判断。
		if (a instanceof Cat)
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
			a.eat();
		}

	}
}
