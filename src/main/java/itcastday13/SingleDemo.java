package itcastday13;

/*
//BK --day13 Multithreading Thread 多线程下的单例

*/

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
			synchronized (Single1.class) // 同步安全问题
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

// my heaven

class myFH
{
	private myFH()
	{
	};

	private static myFH myFHInstance = new myFH();

	public static myFH getInstance()
	{
		return myFH.myFHInstance;
	}
}

class mySc
{
	private mySc()
	{
	};

	private static mySc myInsatnce = null;

	public static mySc getInstance()
	{
		if (mySc.myInsatnce == null)
		{
			mySc.myInsatnce = new mySc();
		}

		return mySc.myInsatnce;
	}
}

class myThread1 implements Runnable
{

	private Object lock = new Object();
	mySc instance = null;

	@Override
	public void run()
	{
		if (mySc.getInstance() != null)
		{
			this.instance = mySc.getInstance();
		}
		else
		{
			synchronized (this.lock)
			{
				this.instance = mySc.getInstance();
				System.out.println(this.instance);
			}
		}
	}

}

class myMain1
{
	public static void main(String[] args)
	{
		myThread1 myThread = new myThread1();
		Thread thread1 = new Thread(myThread);
		Thread thread2 = new Thread(myThread);
		thread1.start();
		thread2.start();
	}
}