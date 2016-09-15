package day10;

/*
毕老师和毕姥爷的故事。
*/

class 毕姥爷
{
	protected void 讲课()
	{
		System.out.println("管理");
	}

	protected void 钓鱼()
	{
		System.out.println("钓鱼");
	}
}

final class 毕老师 extends 毕姥爷
{
	@Override
	protected void 讲课()
	{
		System.out.println("Java");
	}

	protected void 看电影()
	{
		System.out.println("看电影");
	}
}

public class DuoTaiDemo2
{
	DuoTaiDemo2()
	{
	}

	public static void main(String[] args)
	{
		毕老师 x = new 毕老师();
		x.讲课();
		x.看电影();

		毕姥爷 x1 = new 毕老师();
		x1.讲课();
		x1.钓鱼();

		毕老师 y = (毕老师) x1;// ClassCastException
		y.看电影();

	}
}
