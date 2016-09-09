//: interfaces/interfaceprocessor/Apply.java
package ThinkingInJava4.interfaces.interfaceprocessor;

import static ThinkingInJava4.net.mindview.util.Print.print;

public class Apply
{
	public static void process(Processor p, Object s)
	{
		print("Using Processor " + p.name());
		print(p.process(s));
	}

	public static String s = "If she weighs the same as a duck, she's made of wood";

	public static void main(String[] args)
	{
		Apply.process(new Upcase(), s);
		Apply.process(new Downcase(), s);
		Apply.process(new Splitter(), s);
	}

} /// :~
