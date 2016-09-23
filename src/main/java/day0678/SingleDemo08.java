package day0678;

//饿汉式
class Single// 类一加载，对象就已经存在了。
{
	private static Single s = new Single();

	private Single()
	{
	}

	public static Single getInstance()
	{
		return Single.s;
	}
}

// 懒汉式
class Single2 // 类加载进来，没有对象，只有调用了getInstance方法时，才会创建对象。
				// 延迟加载形式。
{
	private static Single2 s = null;

	private Single2()
	{
	}

	public static Single2 getInstance()
	{
		if (Single2.s == null)
		{
			Single2.s = new Single2();
		}
		return Single2.s;
	}
}

public class SingleDemo08
{
	public static void main(String[] args)
	{
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();

		System.out.println(s1 == s2);

		Test1 t1 = Test1.getInstance();
		Test1 t2 = Test1.getInstance();
		t1.setNum(10);
		t2.setNum(20);
		System.out.println(t1.getNum());
		System.out.println(t2.getNum());
	}
}

class Test1
{
	private int num;

	private static Test1 t = new Test1();

	private Test1()
	{
	}

	public static Test1 getInstance()
	{
		return Test1.t;
	}

	public void setNum(int num)
	{
		this.num = num;
	}

	public int getNum()
	{
		return this.num;
	}

}
