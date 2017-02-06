package day41;

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

		// BK --day41 JAVA8 2Lambda1基本语法
		// 基本语法:
		// ([参数名称列表]) ->{
		// //执行语句,方法体
		// }
		// TestClassMethodRef ref = (s) -> {
		// LambdaMethods.output(s);
		// };
		TestClassMethodRef ref = s -> LambdaMethods.output(s);
		ref.test("Hongwei come on : ref");

		// BK --day41 JAVA8 2Lambda2引用类方法
		// 引用类方法: <类名>::<类方法> , 会自动把参数全部传递给类方法.
		TestClassMethodRef ref1 = LambdaMethods::output;
		ref1.test("Hongwei come on : ref1");

		TestClassMethodRef2 ref2 = LambdaMethods::output2;
		ref2.test2("Hongwei", " come", " on : ref2");

		// BK --day41 JAVA8 2Lambda3引用实例方法
		// 实例方法引用,必须通过实例来引用:<实例>::<实例方法>
		TestClassMethodRef3 instance = new North();
		TestClassMethodRef ref3 = instance::test1;
		ref3.test("Hongwei come on : ref3");

		// BK --day41 JAVA8 2Lambda4类引用实例方法
		// 通过类引用实例方法 <类名>::<实例方法>,
		// 把函数式接口的第一个参数,作为类的一个实例.
		// 接口方法的参数中,第一个参数必须是::前面的类名的一个实例.
		TestClassMethodRef ref4 = System.out::println;
		ref4.test("Hongwei come on : ref4");

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
		TestClassMethodRef4 ref5 = () -> {
			return new User();
		};
		User user = ref5.getUser();
		System.out.println(user);
		// use constructor
		TestClassMethodRef4 ref6 = User::new;
		User user2 = ref6.getUser();
		System.out.println(user2);
	}

	// class methods
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

interface TestClassMethodRef
{
	void test(String str);
}

interface TestClassMethodRef2
{
	void test2(String str, String str1, String str2);
}

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

interface TestClassMethodRef4
{
	User getUser();
}

interface TestClassMethodRef41
{
	User getUser(TestClassMethodRef4 ref);
}

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