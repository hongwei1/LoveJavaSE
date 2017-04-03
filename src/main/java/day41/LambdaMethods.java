package day41;

import java.io.PrintStream;
import java.util.Comparator;

class LambdaMethods
{
	public Runnable toDoLater()
	{
		return () -> {
			System.out.println("later");
		};
	}

	public static void main(String[] args)
	{
		Comparator<String> c;
		c = (String s1, String s2) -> s1.compareToIgnoreCase(s2);

		
		// The functionalDefaultMethods is a object, Lambda implement the interface and it has been a concreate 
		// class, it can be changed into object.
		// Latter, it can call  the method, we defined in Lamdba expression.
		Java8.FunctionalDefaultMethods functionalDefaultMethods = (a) -> {System.out.print("I am implement method!"+a);};
		functionalDefaultMethods.defaultMethod();
		functionalDefaultMethods.method(5);
		

		// BK --day41 JAVA8 2Lambda1基本语法
		// 基本语法:
		// ([参数名称列表]) ->{
		//   执行语句,方法体
		// }
		//1 first old way
		TestClassMethodRef refOld = new TestClassMethodRef(){

			@Override
			public void test(String str) {
				LambdaMethods.output(str);
			}
		};
		refOld.test("Hongwei come on : ref");
		
		//New way:
		// In functional interface there is void test(String str), is abstract.
		// It is the functionalInterface, it can use the Lambda expression.() -> {}
		// Just contain the method body, need not care about the abstract method in interface.
		// in the left, you use TestClassMethodRef, it has constained the number and input value
		// Here it is the method 'void test(String str)', so we just need one parameter in the right side .
		// () -> {}, means there is one parameter in the (), and than just create your method to call the parameter .
		// and the new method can be call when later use the ref variable. 
		// Actually, it is an object now. 
		
		TestClassMethodRef ref = s -> LambdaMethods.output(s);
		// although, it is called the test method, but it is just interface, concrete method will be called in implement class. 
		// So, it will call the Lambda expression (s -> LambdaMethods.output(s);)
		// and run the methods in Lambda body. 
		ref.test("Hongwei come on : ref");

		// BK --day41 JAVA8 2Lambda2引用类方法
		// 引用类方法: <类名>::<类方法> , 会自动把参数全部传递给类方法.
		//Normal Lambda expression: 
//		TestClassMethodRef ref = s -> LambdaMethods.output(s);
		//Class method references:
		// You need not provide the parameters, it will pass them to method directly.
		TestClassMethodRef ref1 = LambdaMethods::output;
		ref1.test("Hongwei come on : ref1");

		// case2: different input paramers : now it is three, all happened autometicly
		TestClassMethodRef2 ref2 = LambdaMethods::output2;
		ref2.test2("Hongwei", " come", " on : ref2");

		// BK --day41 JAVA8 2Lambda3引用实例方法
		// 实例方法引用,必须通过实例来引用:<实例>::<实例方法>
		TestClassMethodRef3 instance = new North();
		// instance is a instance of North class, North class have implement the methods:void test1(String str);
		// So just give it to Lembda expression
		TestClassMethodRef ref3 = instance::test1;
		ref3.test("Hongwei come on : ref3");

		// BK --day41 JAVA8 2Lambda4类引用实例方法
		// 通过类引用实例方法 <类名>::<实例方法>,
		// 把函数式接口的第一个参数,作为类的一个实例 (接口方法的参数中,第一个参数必须是::前面的类名的一个实例).
		TestClassMethodRef ref4 = System.out::println;
		ref4.test("Hongwei come on : ref4");

//		PrintStream s ="123";

		// User getUser(TestClassMethodRef4 ref); the first paramer must be an instance of ::前面的类名的一个实例
		// This way will change the input parameters
		TestClassMethodRef41 ref41 = TestClassMethodRef4::getUser;
		TestClassMethodRef4 instance1 = new North();
		User user3 = ref41.getUser(instance1);

		// BK --day41 JAVA8 2Lambda5引用构造器
		// <Class>::new;
		// 只能用于无参数构造器
		// TestClassMethodRef4 ref51 = new TestClassMethodRef4()
		// {
		// @Override
		// public User getUser()
		// {
		// return new User();
		// }
		// };
		// before: inner Class--> functionInterface!
		
		TestClassMethodRef4 ref5 = () -> {return new User();};
		User user = ref5.getUser();
		System.out.println(user);
		// use constructor
		TestClassMethodRef4 ref6 = User::new;
		User user2 = ref6.getUser();
		System.out.println(user2);
	}

	// class methods : static, it can be called by class name 
	public static void output(String str)
	{
		System.out.println("class methods: " + str);
	}

	// class methods
	public static void output2(String str, String str1, String str2)
	{
		System.out.println("class methods: " + str + str1 + str2);
	}
}

@FunctionalInterface
interface TestClassMethodRef
{
	void test(String str);
}

@FunctionalInterface
interface TestClassMethodRef2
{
	void test2(String paramter1, String str1, String str2);
}

@FunctionalInterface
interface TestClassMethodRef3
{
	void test1(String str);
}

class North implements TestClassMethodRef3, TestClassMethodRef4
{

	public North()
	{
		System.out.println("Constuct running!");
	}

	@Override
	public void test1(String str)
	{
		System.out.println("class3 " + str);
	}

	@Override
	public User getUser()
	{
		return new User();
	}
}
@FunctionalInterface
interface TestClassMethodRef4
{
	User getUser();
}
@FunctionalInterface
interface TestClassMethodRef41
{
	User getUser(TestClassMethodRef4 ref);
}
@FunctionalInterface
interface TestClassMethodRef42
{
	User getUser(String name);
}

class User
{
	public User()
	{
		System.out.println("Constuct running!");
	}
}