package day1234;

//饿汉式
class Single2
{
	private static final Single2 s = new Single2();

	private Single2()
	{
	}

	public static Single2 getInstance()
	{
		return Single2.s;
	}
}

// 懒汉式

// 加入同步为了解决多线程安全问题。
//
// 加入双重判断是为了解决效率问题。

class Single1
{
	private static Single1 s = null;

	private Single1()
	{
	}

	public static Single1 getInstance()
	{
		if (Single1.s == null) // 效率问题
		{
			synchronized (Single1.class) // 同步安全问题, 静态函数只能用字节码
			{
				if (Single1.s == null)
				{
					// -->0 -->1
					Single1.s = new Single1();
				}
			}
		}
		return Single1.s;
	}
}

class SingleDemo
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}
