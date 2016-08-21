package itcastday09;

abstract class AbstractDemoFather implements DemoIf
{
	@Override
	public abstract void show1();

	// @Override
	// public abstract void show2();
}

class AbstractDemoSon extends AbstractDemoFather
{
	@Override
	public void show2()
	{
	}

	@Override
	public void show1()
	{
	};

}

interface DemoIf
{
	int NUM = 4;

	public abstract void show1();

	public abstract void show2();
}

public class DemoImple implements DemoIf
{
	int a;

	@Override
	public void show1()
	{
	}

	@Override
	public void show2()
	{
	}

	public void show()
	{
		System.out.println(DemoIf.NUM);
	}

}

class DemoImpl implements DemoIf
{
	@Override
	public void show1()
	{
	}

	@Override
	public void show2()
	{

	}
}

interface A
{
	public void show();
}

interface Z
{
	public int add(int a, int b);

	// public int show(); //BK --day09 Class 7Interface 1Bug
	// the same input ,but different return values.
}

class Test implements A, Z// 多实现
{

	@Override
	public int add(int a, int b)
	{
		return a + b + 3;
	}

	/**/
	@Override
	public void show()
	{
	}

}

abstract class Q implements A, Z
{

	public void method()
	{
	}
}

abstract class Test2 extends Q
{

}

interface CC
{
	void show();
}

interface MM
{
	void method();
}

interface QQ extends CC, MM
{
	void function();
}

class WW implements QQ
{
	// 覆盖3个方法。
	@Override
	public void show()
	{
	}

	@Override
	public void method()
	{
	}

	@Override
	public void function()
	{
	}
}
