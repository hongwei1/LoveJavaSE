package day11;

class FuShuIndexException4 extends Exception
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	FuShuIndexException4()
	{
	}

	FuShuIndexException4(String msg)
	{
		super(msg);
	}
}

class Demo4
{
	public int method(int[] arr, int index) throws FuShuIndexException4
	{
		if (arr == null)
		{
			throw new NullPointerException("没有任何数组实体");
		}
		if (index < 0)
		{
			throw new FuShuIndexException4();
		}

		return arr[index];
	}
}

class ExceptionDemo4
{
	public static void main(String[] args)
	{
		int[] arr = new int[3];
		Demo4 d = new Demo4();
		try
		{
			int num = d.method(arr, -1);
			System.out.println("num=" + num);
		}
		catch (NullPointerException e)
		{
			System.out.println(e.toString());
		}
		catch (FuShuIndexException4 e)
		{
			System.out.println("message:" + e.getMessage());
			System.out.println("string:" + e.toString());
			System.out.println("string:" + e.getCause());
			e.printStackTrace();// JVM默认的异常处理机制就是调用异常对象的这个方法。

			System.out.println("负数角标异常!!!!");
		}
		/*
		 * catch(Exception e)//多catch父类的catch放在最下面。 {
		 *
		 * }
		 */
		System.out.println("over");
	}

}
