package day0910;

class Fu0
{
	int num = 5;
}

class Zi0 extends Fu0
{

	void show()
	{
		System.out.println("this:" + super.num);
	}
}

class ExtendsDemo
{
	public static void main(String[] args)
	{
		Zi0 z = new Zi0();
		System.out.println("z=" + z);
		z.show();
	}
}
