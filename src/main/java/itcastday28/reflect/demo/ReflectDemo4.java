package itcastday28.reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import itcastday28.bean.Person;

public class ReflectDemo4
{

	public static void main(String[] args) throws Exception
	{
		ReflectDemo4.getMethodDemo1();
		ReflectDemo4.getMethodDemo2();
		ReflectDemo4.getMethodDemo3();
	}

	/**
	 * 获取指定Class中的所有共有，私有方法
	 */
	public static void getMethodDemo1() throws Exception
	{

		Class<?> clazz = Class.forName(Person.PERSON_PATH);

		Method[] methods = clazz.getMethods();// 获取的都是公有的方法。
		methods = clazz.getDeclaredMethods();// 只获取本类中所有方法，包含私有。
		for (Method method : methods)
		{
			System.out.println(method);
		}

	}

	/**
	 * // 获取空参数一般方法。
	 *
	 * @throws Exception
	 */
	public static void getMethodDemo2() throws Exception
	{

		Class<?> clazz = Class.forName(Person.PERSON_PATH);

		Method method = clazz.getMethod("show");// 获取空参数一般方法。

		Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
		Object obj = constructor.newInstance("小明", 37);

		method.invoke(obj);

	}

	/**
	 * 获取带参数的方法
	 *
	 * @throws Exception
	 */
	public static void getMethodDemo3() throws Exception
	{

		Class<?> clazz = Class.forName(Person.PERSON_PATH);

		Method method = clazz.getMethod("paramMethod", String.class, int.class);

		Object obj = clazz.newInstance();

		method.invoke(obj, "小强", 89);

	}

}
