package itcastday03;

class WhileTest2
{
	public static void main(String[] args)
	{

		/**
		 * <pre>
		练习：
		1~100之间 6的倍数出现的次数。
		要求：自己独立完成思想的书写。和步骤的文字描述。
		 * </pre>
		 */
		int x = 1;
		int count = 0;
		while (x <= 100)
		{
			if (x % 6 == 0)
			{
				count++;
			}
			x++;
		}
		System.out.println("count=" + count);
	}
}
