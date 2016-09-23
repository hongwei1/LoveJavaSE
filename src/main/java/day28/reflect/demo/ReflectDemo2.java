package day28.reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import day28.bean.Person;

public class ReflectDemo2
{

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, Exception
	{
		ReflectDemo2.createNewObject1();
		ReflectDemo2.createNewObject2();
	}

	/**
	 * 获取无参数的构造函数
	 *
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static void createNewObject1() throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{

		// 早期：new时候，先根据被new的类的名称找寻该类的字节码文件，并加载进内存，
		// 并创建该字节码文件对象，并接着创建该字节文件的对应的Person对象.
		day28.bean.Person p = new day28.bean.Person();

		// 现在：
		// 找寻该名称类文件，并加载进内存，并产生Class对象。
		Class<?> clazz = Class.forName(Person.PERSON_PATH);
		// 如何产生该类的对象呢？
		Object obj = clazz.newInstance();

	}

	/**
	 * 获取有特别参数的构造函数： clazz.getConstructor(String.class, int.class);
	 *
	 * <pre>
	 * Same function as :
	 * itcastday28.bean.Person p = new itcastday28.bean.Person("小强", 39);
	 *
	 * 当获取指定名称对应类中的所体现的对象时，而该对象初始化不使用空参数构造该怎么办呢？
	 * 既然是通过指定的构造函数进行对象的初始化，所以应该先获取到该构造函数。 通过字节码文件对象即可完成。
	 * 该方法是：getConstructor(paramterTypes)。
	 * </pre>
	 *
	 * @throws ClassNotFoundException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static void createNewObject2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{

		// 找寻该名称类文件，并加载进内存，并产生Class对象。
		Class<?> clazz = Class.forName(Person.PERSON_PATH);

		// 获取到了指定的构造函数对象。
		Constructor<?> constructor = clazz.getConstructor(String.class, int.class);

		// 通过该构造器对象的newInstance方法进行对象的初始化。
		Object obj = constructor.newInstance("小明", 38);

	}
}
