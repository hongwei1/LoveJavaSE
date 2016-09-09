package ThinkingInJava4.initialization;

//: initialization/OverloadingVarargs3.java

public class OverloadingVarargs3
{
	static void f(float i, Character... args)
	{
		System.out.println("first");
	}

	static void f(char c, Character... args)
	{
		System.out.println("second");
	}

	public static void main(String[] args)
	{
		OverloadingVarargs3.f(1, 'a');
		OverloadingVarargs3.f('a', 'b');
	}
} /*
	 * Output: first second
	 */// :~
