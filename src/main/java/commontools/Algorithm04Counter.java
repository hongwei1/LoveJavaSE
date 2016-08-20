package commontools;

public class Algorithm04Counter {
	public static void main(String[] args) {

		/*
		 * 练习： 1~100之间 6的倍数出现的次数。 要求：自己独立完成思想的书写。和步骤的文字描述。
		 */

		// 计数器思想
		// mine:
		int i = 1;
		int sixTimeCount = 0;
		while (i < 100) {
			if (i % 6 == 0)
				sixTimeCount++;
			i++;
		}
		System.out.println("mine is " + sixTimeCount);
	}
}
