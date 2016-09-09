package ThinkingInJava4.initialization;

import ThinkingInJava4.net.mindview.util.Print;

public class Flower
{
	int petalCount = 0;
	String s = "initial value";

	Flower(int petals)
	{
		petalCount = petals;
		Print.print("Constructor w/ int arg only, petalCount= " + petalCount);
	}

	Flower(String ss)
	{
		Print.print("Constructor w/ String arg only, s = " + ss);
		s = ss;
	}

	Flower(String s, int petals)
	{
		this(petals);
		// ! this(s); // Can't call two!
		this.s = s; // Another use of "this"
		Print.print("String & int args");
	}

	Flower()
	{
		this("hi", 47);
		Print.print("default constructor (no args)");
	}

	void printPetalCount()
	{
		// ! this(11); // Not inside non-constructor!
		Print.print("petalCount = " + petalCount + " s = " + s);
	}

	public static void main(String[] args)
	{
		Flower x = new Flower();
		x.printPetalCount();
	}
} /*
	 * Output: Constructor w/ int arg only, petalCount= 47 String & int args default constructor (no args) petalCount = 47 s = hi
	 */// :~
