package itcastday14;

//资源
class Resource2
{
	String name;
	String sex;
	/**
	 * the state of resource, if there is data ,no need to write . If there is no data, can not be read .
	 */
	boolean resouceExsitingState = false;
}

// 输入
class Input2 implements Runnable
{
	Resource2 resource2;

	Input2(Resource2 resource2)
	{
		this.resource2 = resource2;
	}

	@Override
	public void run()
	{
		boolean writeDifferentValueFlag = true;
		while (true)
		{
			synchronized (this.resource2)
			{
				// if there is existing data,wait for read
				if (this.resource2.resouceExsitingState)
				{
					try
					{
						this.resource2.wait();
					}
					catch (InterruptedException e)
					{
					}
				}
				else // if there is no data, write data directly
				{
					if (writeDifferentValueFlag)
					{
						this.resource2.name = "mike";
						this.resource2.sex = "nan";
					}
					else
					{
						this.resource2.name = "丽丽";
						this.resource2.sex = "女女女女女女";
					}
					this.resource2.resouceExsitingState = true;
					this.resource2.notify();
					writeDifferentValueFlag = !writeDifferentValueFlag;
					try
					{
						this.resource2.wait();
					}
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}

		}
	}
}

// 输出
class Output2 implements Runnable
{

	Resource2 resource2;

	Output2(Resource2 resource2)
	{
		this.resource2 = resource2;
	}

	@Override
	public void run()
	{
		while (true)
		{
			synchronized (this.resource2)
			{
				// if there is resource ,so read .
				if (this.resource2.resouceExsitingState)
				{
					System.out.println(this.resource2.name + "....." + this.resource2.sex);
					this.resource2.resouceExsitingState = false;
					this.resource2.notify();
					try
					{
						this.resource2.wait();
					}
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				// if there is no resource ,so wait .
				else
				{
					try
					{
						this.resource2.wait();
					}
					catch (InterruptedException e)
					{
					}
				}

			}
		}
	}
}

/**
 *
 * 在方法处使用了wait 和notify ，在多个线程间通信。 可以一个写完，另一个才读数据。
 * 
 * @author zhanghongwei
 *
 */
class ResourceDemo2
{
	public static void main(String[] args)
	{
		// 创建资源。
		Resource2 r = new Resource2();

		// 创建任务。
		Input2 in = new Input2(r);
		Output2 out = new Output2(r);

		// 创建线程，执行路径。
		new Thread(in).start();
		new Thread(out).start();

	}
}
