package ThinkingInJava4.initialization;

//: initialization/MethodInit2.java
public class MethodInit2
{
	int i = f();
	int j = g(i);

	int f()
	{
		return 11;
	}

	int g(int n)
	{
		return n * 10;
	}

	public static void main(String[] args)
	{
		MethodInit2 methodInit2 = new MethodInit2();
		methodInit2.g(5);
	}
} /// :~
