package day10;

class FuT
{
	FuT()
	{
		this.show();
	}

	void show()
	{
		System.out.println("hehe");
	}
}

class ZiT extends FuT
{
	int num = 9;

	ZiT()
	{
		super();
		// 父类结束初始化，子类才显示初始化成员变量
		System.out.println("Zi constructor..." + this.num);
	}

	@Override
	void show()
	{
		System.out.println("show ... " + this.num);
	}
}

public class FinalConstructions
{
	public static void main(String[] args)
	{
		new ZiT();
	}

}
