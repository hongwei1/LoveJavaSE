package day03;

class OperateDemo5
{
	public static void main(String[] args)
	{

		int x = 0, y;
		y = (x > 1) ? 100 : 200;
		System.out.println("y=" + y);

		// 获取两个整数中的较大的整数。

		int a = 1, b = 3;
		int max = a > b ? a : b;

		// 获取三个整数中的较大的整数。

		int o = 0, p = 0, q = 0;

		int temp = o > p ? o : p;
		int max2 = temp > q ? temp : q;

	}
}
