package Thinking4.initialization;

import Thinking4.net.mindview.util.Print;

public class InitialValues
{
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	InitialValues reference;

	void printInitialValues()
	{
		Print.print("Data type      Initial value");
		Print.print("boolean        " + t);
		Print.print("char           [" + c + "]");
		Print.print("byte           " + b);
		Print.print("short          " + s);
		Print.print("int            " + i);
		Print.print("long           " + l);
		Print.print("float          " + f);
		Print.print("double         " + d);
		Print.print("reference      " + reference);
	}

	public static void main(String[] args)
	{
		InitialValues iv = new InitialValues();
		iv.printInitialValues();
		/*
		 * You could also say: new InitialValues().printInitialValues();
		 */
	}
} /*
	 * Output: Data type Initial value boolean false char [ ] byte 0 short 0 int 0 long 0 float 0.0 double 0.0 reference null
	 */// :~
