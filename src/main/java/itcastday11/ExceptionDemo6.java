package itcastday11;

interface Interface
{
	void function();
}

class D implements Interface
{
	@Override
	public void function() // throws Exception
	{
	}
}

class A extends Exception
{
}

class B extends A
{
}

class C extends Exception
{
}

// Exception
// |--A
// A--|--B
// |--C

class Fu
{
	void show() throws A
	{
	}
}

class Zi extends Fu
{
	@Override
	void show() throws B // only can thrwo A,B, can't C.
	{

	}
}

class Test
{
	void method(Fu f)// Fu f = new Zi();
	{
		try
		{
			f.show();

		}
		catch (A a) // BK --day11 Exception 子类抛异常受限原因
		// 要保证多态的正确，传入的父类，只能处理父类的异常。要是多了子类异常，代码将会改动。
		{
		}
	}

	public void show(Zi zi)
	{
	}
}

public class ExceptionDemo6
{
	public static void main(String[] args)
	{
		Test t = new Test();
		t.show(new Zi());
		t.method(new Zi());
	}
}
