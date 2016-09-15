package day08;

/*
 提取方法到父类
class Demo
{
	void show1(){}
}


class DemoA extends Demo
{
//	void show1(){}
	void show2(){}
}
class DemoB extends Demo
{
//	void show1(){}
	void show3(){}
}
s
 多继承出现的不确定性：
class A
{
	void show()
	{
		System.out.println("a");
	}
}
class B
{
	void show()
	{
		System.out.println("b");
	}
}
class C extends A,B
{
}
new C().show();
*/
class Person
{
	// 提取属性到父类
	String name;
	int age;
}

class Student extends/* 继承 */ Person
{
	// String name;
	// int age;
	void study()
	{
		System.out.println(this.name + "...student study.." + this.age);
	}
}

class Worker extends Person
{
	// String name;
	// int age;
	void work()
	{
		System.out.println("worker work");
	}
}

public class ExtendsDemo08
{
	public static void main(String[] args)
	{
		Student student = new Student();
		student.name = "zhangsan";
		student.age = 22;
		student.study();
	}
}
