package ThinkingInJava4.Object;

// object/ITest.java
// TIJ4 Chapter Object, Exercise 7, page 90
// Turn the Incrementable code fragments into a working program.

class StaticTest
{
	static int i = 47;
}

class Incrementable
{
	static void increment()
	{
		StaticTest1.i++;
	}
}

public class ITest
{
	public static void main(String[] args)
	{
		System.out.println("StaticTest.i= " + StaticTest1.i);
		StaticTest1 st1 = new StaticTest1();
		StaticTest1 st2 = new StaticTest1();
		System.out.println("st1.i= " + StaticTest1.i);
		System.out.println("st2.i= " + StaticTest1.i);
		Incrementable1 sf = new Incrementable1();
		Incrementable1.increment();
		System.out.println("After sf.increment() called: ");
		System.out.println("st1.i = " + StaticTest1.i);
		System.out.println("st2.i = " + StaticTest1.i);
		Incrementable1.increment();
		System.out.println("After Incrementable.increment called: ");
		System.out.println("st1.i = " + StaticTest1.i);
		System.out.println("st2.i = " + StaticTest1.i);
	}
}