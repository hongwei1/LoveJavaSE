package algorithms;

//BK --day02 5Operators 3位运算
public class A02BitsSwap
{
	/*
	 * 对一个整数的最后一个字节，高四位和低四位进行换位。 int num = 0101-1100 & 255; 1100-0101
	 *
	 * 61 = 0011-1101 1101-0011 = 211
	 *
	 */
	public static void main(String[] args)
	{

		// 最有效率的方式算出2乘以8等于几？
		System.out.println(2 << 3);

		int num = 61;

		int n1 = num & 15; // 低四位
		int n2 = num & (15 << 4);// 高四位

		int n = n1 << 4 | n2 >>> 4;

		System.out.println("n=" + n);
	}
}
