package itcastday09;

/*
abstract class AbsDemo
{
	abstract void show1();
	abstract void show2();
}
知识点： key points
1 definition: 当一个抽象类中的方法都是抽象的时候，这时可以将该抽象类用另一种形式定义和表示，就是 接口 interface。
  定义接口使用的关键字不是class，是interface.

2 characteristic: 对于接口当中常见的成员：而且这些成员都有固定的修饰符。
	1，全局常量: public static final --if don't write the compiler do it 
	2，抽象方法: public abstract 
	由此得出结论，接口中的成员都是公共的权限
3 implement:类与类之间是继承关系，类与接口直接是实现关系。 
	接口不可以实例化,只能由实现了接口的子类并覆盖了接口中所有的抽象方法后，该子类才可以实例化。
	否则，这个子类就是一个抽象类。
	
4 many implements:
	在java中不直接支持多继承，因为会出现调用的不确定性。
	所以java将多继承机制进行改良，在java中变成了多实现。
	一个类可以实现多个接口。 
	
	bug: Search "public int show();",It can not work like this.

5 一个类在继承另一个类的同时，还可以实现多个接口。eg:class Q and Class Test
	接口的出现避免了单继承的局限性。eg: class Test2
	接口与接口之间是继承关系，而且接口可以多继承。 eg:CC QQ MM ,因为没有方法体，不会影响功能。

6 4.8.1 接口的特点      -- Ref:P9 传智播客_Java培训_毕向东_Java基础[04-继承下]
7 4.8.2 接口与抽象类区别 -- （Ref:P9 传智播客_Java培训_毕向东_Java基础[04-继承下]）

8 抽象类和接口的异同点： eg: InterfaceDemo2.java
	相同点：
		都是不断向上抽取而来的。
	
	
	不同点：
		1，抽象类需要被继承，而且只能单继承。
		   接口需要被实现，而且可以多实现。 
		2，抽象类中可以定义抽象方法和非抽象方法，子类继承后，可以直接使用非抽象方法。
		   接口中只能定义抽象方法，必须由子类去实现。 
		3，抽象类的继承，是is a关系，在定义该体系的基本共性内容。
		   接口的实现是 like a 关系，在定义体系额外功能。
	
	犬按功能分：有导盲犬，搜爆犬。
	
*/

interface DemoInterface
{
	public static final int NUM = 4;

	public abstract void show1();
	public abstract void show2();
}


class DemoImpleeement implements DemoInterface{

	int a;
	@Override
	public void show1() {
	}

	@Override
	public void show2() {
	}
	
}


class DemoImpl implements DemoInterface
{
	public void show1()
	{}

	public void show2()
	{
	
	}
}


interface A
{
	public void show();
}

interface Z
{
	public int add(int a,int b);
//	public int show();
}

class Test implements A,Z//多实现
{
	
	public int add(int a,int b)
	{
		return a+b+3;	
	}
	/**/
	public void show(){}
	
}

class Q
{
	public void method()
	{}
}

abstract class Test2 extends Q implements A,Z
{

}

interface CC
{
	void show();
}
interface MM
{
	void method();
}

interface QQ extends  CC,MM//
{
	void function();
}

class WW implements QQ
{
//覆盖3个方法。
	public void show(){}
	public void method(){}
	public void function(){}
}










