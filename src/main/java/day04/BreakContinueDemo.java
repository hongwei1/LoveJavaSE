package day04;

class BreakContinueDemo
{
	public static void main(String[] args)
	{
		/***
		 * <pre>
		break:跳出。
		break作用的范围：要么是switch语句，要么是循环语句。
		记住：当break语句单独存在时，下面不要定义其他语句，因为执行不到。
			break跳出所在的当前循环。
			如果出现了循环嵌套，break想要跳出指定的循环，可以通过标号来完成。
		 * </pre>
		 */

		System.out.println("1-------------1");

		for (int x = 0; x < 3; x++)
		{
			if (x == 1)
			{
				break;
			}
			System.out.println("x=" + x);
		} // 0

		System.out.println("2-------------2");

		LabelOuter: for (int x = 0; x < 3; x++) // BK --day04 6语句 3For 1break标号
		{
			LabelInner: for (int y = 0; y < 4; y++)
			{
				System.out.println("x=" + x);
				break LabelOuter;
			}
		} // 0

		System.out.println("3-------------3");
		/**
		 * <pre>
		continue:继续。
		作用的范围：循环结构。
		continue：结束本次循环，继续下次循环。
		如果continue单独存在时，下面不要有任何语句，因为执行不到。
		 * </pre>
		 */

		for (int x = 0; x < 11; x++)
		{
			if (x % 2 == 0)
			{
				continue;
			}
			System.out.println("x=" + x);
		} // 1 3 5 7 9

		System.out.println("4-------------4");
		LabelOuter: for (int x = 0; x < 2; x++) // BK --day04 6语句 3For 2continue标号
		{
			LabelInner: for (int y = 0; y < 3; y++)
			{
				System.out.println("x=" + x);
				continue LabelOuter;
			}
		} // 0 1 2
	}
}
