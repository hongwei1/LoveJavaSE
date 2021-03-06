package day11;

import java.io.PrintStream;

/*
毕老师用电脑上课。
	涉及两个对象。
		毕老师，电脑。
	分析其中的异常。
		比如电脑蓝屏啦。冒烟啦。
*/

class LanPingException extends Exception
{
	LanPingException(String msg)
	{
		super(msg);
	}
}

class MaoYanException extends Exception
{
	MaoYanException(String msg)
	{
		super(msg);
	}
}

class NoPlanException extends Exception
{
	NoPlanException(String msg)
	{
		super(msg);
	}

	public NoPlanException(String string, MaoYanException e)
	{
	}
}

class Computer
{
	private int state = 2;

	public void run() throws LanPingException, MaoYanException
	{
		if (this.state == 1)
		{
			throw new LanPingException("电脑蓝屏啦！！");
		}
		if (this.state == 2)
		{
			throw new MaoYanException("电脑冒烟啦！！");
		}

		System.out.println("电脑运行");
	}

	public void reset()
	{
		this.state = 0;
		System.out.println("电脑重启");
	}
}

class Teacher
{
	private String name;
	private Computer comp;

	Teacher(String name)
	{
		this.name = name;
		this.comp = new Computer();
	}

	public void prelect() throws NoPlanException
	{
		try
		{
			this.comp.run();
			System.out.println(this.name + "讲课");

		}
		catch (LanPingException e)
		{
			System.out.println(e.toString());
			this.comp.reset();
			this.prelect();
		}
		catch (MaoYanException e)
		{
			System.out.println(e.toString());
			this.test();
			// 可以对电脑进行维修。
			// throw e;
			throw new NoPlanException("课时进度无法完成，原因：" + e.getMessage(), e);
		}

	}

	public void test()
	{
		System.out.println("大家练习");
	}
}

class ExceptionTest
{
	public static void main(String[] args)
	{
		Teacher t = new Teacher("毕老师");
		try
		{
			t.prelect();

		}
		catch (NoPlanException e)
		{
			System.out.println(e.toString() + "......");
			System.out.println("换人");
			e.printStackTrace();
			PrintStream s = null;
			e.printStackTrace(s);
			System.out.println(s);

		}
	}
}

/*
 *
 * class NoAddException extends Exception {}
 *
 * void addData(Data d)throws NoAddException {
 *
 * 连接数据库 try { 添加数据。出现异常 SQLException(); } catch(SQLException e) { //处理代码。
 *
 * throw new NoAddException(); } fianlly { 关闭数据库。 } }
 *
 *
 */