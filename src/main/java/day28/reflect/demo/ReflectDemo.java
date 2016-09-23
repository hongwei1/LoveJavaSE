package day28.reflect.demo;

import javax.swing.JButton;

import day28.bean.Person;

public class ReflectDemo
{

	/**
	 * enum all can be reflected
	 *
	 * @author zhanghongwei
	 *
	 */
	enum TestEnum
	{
		A, B, C
	}

	/**
	 * interface
	 *
	 * @author zhanghongwei
	 *
	 */
	interface Interface
	{

	}

	public static void main(String[] args) throws ClassNotFoundException
	{

		ReflectDemo.getClassObject();

		// BK --day28 Reflection 1Get Class
		ReflectDemo.getClassObject_1();
		ReflectDemo.getClassObject_2();
		ReflectDemo.getClassObject_3();

	}

	/**
	 * Basic concepts on Class
	 */
	public static void getClassObject()
	{
		Person p = new Person();
		Class<? extends Person> clazz = p.getClass();

		Person p1 = new Person();
		Class<? extends Person> clazz1 = p1.getClass();

		day28.bean.Person person = new day28.bean.Person();
		System.out.println(person.getClass().getName());

		System.out.println(clazz == clazz1);
	}

	/**
	 * 方式一：Object类中的getClass()方法的。 想要用这种方式，必须要明确具体的类且创建对象。
	 *
	 */
	public static void getClassObject_1()
	{

		Person p = new Person();
		Class<? extends Person> clazz = p.getClass();

		Person p1 = new Person();
		Class<? extends Person> clazz1 = p1.getClass();

		day28.bean.Person person = new day28.bean.Person();
		System.out.println(person.getClass().getName());

		System.out.println(clazz == clazz1);

	}

	/**
	 * 方式二：任何数据类型都具备一个静态的属性.class来获取其对应的Class对象。 相对简单，但是还是要明确用到类中的静态成员。 还是不够扩展。
	 *
	 */
	public static void getClassObject_2()
	{
		// 1 原始类
		System.out.println(byte.class);
		System.out.println(short.class);
		System.out.println(int.class);
		System.out.println(long.class);
		System.out.println(double.class);
		System.out.println(float.class);

		System.out.println(char.class);

		System.out.println(boolean.class);
		System.out.println(void.class);

		// 2类，接口，数组
		System.out.println(String.class);
		System.out.println(int[].class);
		System.out.println(Person[].class);
		System.out.println(Integer.class);
		System.out.println(JButton.class);
		System.out.println(TestEnum.class);
		System.out.println(Interface.class);
		// 3 比较地址
		Class<?> clazz2 = boolean.class;
		clazz2.getName();
		Class<Person> clazz = Person.class;
		Class<Person> clazz1 = Person.class;
		System.out.println(clazz == clazz1);
	}

	/**
	 * 方式三： 只要通过给定的类的字符串名称就可以获取该类，更为扩展。 可是用Class类中的方法完成。 该方法就是forName. 这种方式只要有名称即可，更为方便，扩展性更强。
	 *
	 */
	public static void getClassObject_3() throws ClassNotFoundException
	{

		// 反射一个类

		Class<?> clazz = Class.forName(Person.PERSON_PATH);
		System.out.println(clazz);

		// 反射一个数组
		String className = "[I";
		clazz = Class.forName(className);
		System.out.println(clazz);
	}
}
