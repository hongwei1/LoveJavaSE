package day11;

class Demo2
{
	public int method(int[] arr, int index) throws MyException
	{

		if (arr == null)
		{
			throw new MyException("数组的引用不能为空！", new NullPointerException("I got you !"));
		}

		if (index >= arr.length)
		{
			throw new ArrayIndexOutOfBoundsException("数组的角标越界啦，哥们，你是不是疯了？：" + index);
			// if in C ,there will be some special case to describe the problem.
			// Such 1 means BoundsException
			// 2 means NullPoints
			// ...
			// but in java,we use exception class.
		}
		if (index < 0)
		{
			throw new ArrayIndexOutOfBoundsException("数组的角标不能为负数，哥们，你是真疯了！：" + index);
		}
		return arr[index];
	}
}

class ExceptionDemo2
{
	public static void main(String[] args) throws MyException
	{
		// 1 prepare data
		int[] arr = new int[3];
		Demo2 d = new Demo2();

		// 2 run app
		int num = d.method(null, -30);

		// 3 check result
		System.out.println("num=" + num);
		System.out.println("over");
	}

}
