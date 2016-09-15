package day09;

class Fu5
{
	int num = 1;

	Fu5()
	{
		// super();
		this.fuMethodOnly();
		this.overideMethod();
		return;
	}

	void fuMethodOnly()
	{
		System.out.println("fu show " + this.num);
	}

	void overideMethod()
	{
		System.out.println("fu show" + this.num);
	}
}

class Zi5 extends Fu5
{
	int num = 2;

	Zi5()
	{
		super();
		// 通过super初始化父类内容时，子类的成员变量并未显示初始化。
		// 等super()父类初始化完毕后，才进行子类的成员变量显示初始化。
		System.out.println("fu cons run...." + super.num);
		System.out.println("zi cons run...." + this.num);
		return;
	}

	@Override
	void overideMethod()
	{
		System.out.println("zi show..." + this.num);
	}
}

class ExtendsDemo5
{
	public static void main(String[] args)
	{
		Zi5 z = new Zi5();
		z.overideMethod();
	}

}
