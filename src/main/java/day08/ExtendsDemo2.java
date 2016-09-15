package day08;

class Fu
{
	private int num = 4;

	public int getNum()
	{
		return num;
	}

	void show()
	{
		System.out.println(num);
	}
}

class Zi extends Fu
{
	private int num = 5;

	@Override
	void show()
	{
		System.out.println(num + "....." + super.getNum());
	}
}

class ExtendsDemo2
{
	public static void main(String[] args)
	{
		Fu z = new Zi();
		z.show();
	}
}
