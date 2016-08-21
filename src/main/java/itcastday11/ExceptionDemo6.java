package itcastday11;

interface Inter
{
	void function();
}

class D implements Inter
{
	@Override
	public void function()// throws Exception
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
// |--B
// |--C

class Fu
{
	void show() throws A
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
		catch (A a)
		{
		}
	}

	public void show(Zi zi)
	{
	}
}

class Zi extends Fu
{
	@Override
	void show()
	{

	}
}

public class ExceptionDemo6
{
	public static void main(String[] args)
	{
		Test t = new Test();
		t.show(new Zi());
	}
}
