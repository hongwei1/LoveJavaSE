package itcastday09;

abstract class È®
{
	abstract void ºð½Ð();
}

interface µ¼Ã¤
{
	abstract void µ¼Ã¤ing();
}

interface ËÑ±¬
{
	abstract void ËÑ±¬ing();
}

class µ¼Ã¤È® extends È® implements µ¼Ã¤
{
	@Override
	public void ºð½Ð()
	{
	}

	@Override
	public void µ¼Ã¤ing()
	{
	}
}

class ËÑ±¬È® extends È® implements ËÑ±¬
{
	@Override
	public void ºð½Ð()
	{
	}

	@Override
	public void ËÑ±¬ing()
	{
	}
}

class InterfaceDemo2
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}
