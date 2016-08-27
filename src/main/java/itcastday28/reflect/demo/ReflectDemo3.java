package itcastday28.reflect.demo;

import java.lang.reflect.Field;

import itcastday28.bean.Person;

public class ReflectDemo3
{
	/**
	 * 获取字节码文件中的字段,same function as following:
	 *
	 * <pre>
	 * itcastday28.bean.Person p = new itcastday28.bean.Person();
	 * p.setAge(89);
	 * System.out.println(p.getAge());
	 * </pre>
	 */
	public static void main(String[] args) throws Exception
	{
		Class<?> personClass = Class.forName(Person.PERSON_PATH);

		// field = clazz.getField("age");// 只能获取公有的，
		Field personAgeField = personClass.getDeclaredField("age");// 只获取本类，但包含私有。

		// 对私有字段的访问取消权限检查。暴力访问。
		personAgeField.setAccessible(true);

		// 获取person
		Object personObject = personClass.newInstance();

		// 调用set方法把对象和要输入的值产生关系。
		personAgeField.set(personObject, 89);

		Object afterConstructPerson = personAgeField.get(personObject);

		System.out.println(afterConstructPerson);

	}

}
