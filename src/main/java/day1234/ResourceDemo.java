package day1234;

/*
	线程间通讯：多个线程在处理同一资源，但是任务却不同。
*/

//资源
class Resource1
{
	String name;
	String sex;
}

// 输入
class Input implements Runnable
{
	Resource1 resource;

	Input(Resource1 r)
	{
		this.resource = r;
	}

	@Override
	public void run()
	{
		boolean writeDifferentValueFlag = true;
		while (true)
		{
			synchronized (this.resource)
			{
				if (writeDifferentValueFlag)
				{
					this.resource.name = "mike";
					this.resource.sex = "nan";
				}
				else
				{
					this.resource.name = "丽丽";
					this.resource.sex = "女女女女女女";
				}
				writeDifferentValueFlag = !writeDifferentValueFlag;
			}
		}
	}
}

// 输出
class Output implements Runnable
{

	Resource1 resource;

	Output(Resource1 r)
	{
		this.resource = r;
	}

	@Override
	public void run()
	{
		while (true)
		{
			synchronized (this.resource)
			{
				System.out.println(this.resource.name + "....." + this.resource.sex);
			}
		}
	}
}

/**
 * 一个线程写资源，另一个线程读资源。同步代码块可以保证，两个线程不会同时处理一个资源。但是不能保证访问的顺序。要写完才开始读，写一个读一个这样的顺序要通过wait 和 notify函数实现。
 *
 * @author zhanghongwei
 *
 */
class ResourceDemo
{
	public static void main(String[] args)
	{
		// 1创建资源。
		Resource1 r = new Resource1();

		// 2创建任务。
		Input in = new Input(r);
		Output out = new Output(r);

		// 3创建线程，执行路径。
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);

		// 4开启线程
		t1.start();
		t2.start();
	}
}
