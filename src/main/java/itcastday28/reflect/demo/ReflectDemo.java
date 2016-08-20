package itcastday28.reflect.demo;

import javax.swing.JButton;

import itcastday17.p.bean.PersionMy;
import itcastday28.bean.Person;

/*
 * JAVA反射机制是在运行状态中，对于任意一个类 (class文件)，都能够知道这个类的所有属性和方法；
 * 对于任意一个对象，都能够调用它的任意一个方法和属性；
 * 这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。 
 * 
 * 
 * 动态获取类中信息，就是java反射 。
 * 可以理解为对类的解剖。
 * 
 * 
 * 要想要对字节码文件进行解剖，必须要有字节码文件对象.
 * 如何获取字节码文件对象呢？
 * 
 */

public class ReflectDemo {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException {

		// getClassObject_3();
		getClassObject_1();

	}
	/*
	 * 方式三： 只要通过给定的类的 字符串名称就可以获取该类，更为扩展。 可是用Class类中的方法完成。 该方法就是forName.
	 * 这种方式只要有名称即可，更为方便，扩展性更强。
	 */

	public static void getClassObject_3() throws ClassNotFoundException {

		String className = "itcastday28.bean.Person";

		Class clazz = Class.forName(className);

		System.out.println(clazz);
	}

	/*
	 * 方式二： 2，任何数据类型都具备一个静态的属性.class来获取其对应的Class对象。 相对简单，但是还是要明确用到类中的静态成员。
	 * 还是不够扩展。
	 * 
	 */
	public static void getClassObject_2() {

		Class clazz = Person.class;
		Class clazz1 = Person.class;
		System.out.println(clazz == clazz1);
	}

	/*
	 * 获取字节码对象的方式： 1，Object类中的getClass()方法的。 想要用这种方式，必须要明确具体的类，并创建对象。 麻烦 .
	 * 
	 */
	public static void getClassObject_1() {

		Person p = new Person();
		Class clazz = p.getClass();

		Person p1 = new Person();
		Class clazz1 = p1.getClass();

		itcastday28.bean.Person person = new itcastday28.bean.Person();
		System.out.println(person.getClass().getName());

		System.out.println(clazz == clazz1);

		JButton b1 = new JButton("button1");

		System.out.println(b1.getClass());
		System.out.println(b1.getClass().getName());
		System.out.println(JButton.class);
		int a = 5;
		System.out.println(JButton.class);
		System.out.println(String.class);
		System.out.println(int.class);
		System.out.println(AAA.class);
		Class<?> clazz2 = boolean.class;
		clazz2.getName();
	}
}

interface AAA{
	
}
