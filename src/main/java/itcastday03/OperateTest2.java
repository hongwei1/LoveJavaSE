package itcastday03;

class OperateTest2
{
	public static void main(String[] args)
	{
		/**
		 * <pre>
		 * change the position of low 4 bits and the high 4 bits, in terms of a integer last 8 bits mind: 1100,0011
		 * 对一个整数的最后一个字节，高四位和低四位进行换位。
		 * eg1:
		 * int num = 0101-1100 ->92 ==> -> 1100-0101 =197
		 *
		 * eg2:
		 * 61 = 0011-1101 ==> 1101-0011 = 211
		 *
		 * </pre>
		 */

		int num = 61;

		int n1 = num & 15; // 低四位
		int n2 = num & (15 << 4);// 高四位

		int n = n1 << 4 | n2 >>> 4;

		System.out.println("n=" + n);
		SwapHighLow(num);
	}

	private static void SwapHighLow(int num)
	{
		/*
		 * change the high 4 bits and low 4 bits. 1 get the high and low bits 2 change them
		 *
		 */
		// 1 get the low 4 bits
		int low = num & Integer.parseInt("1111", 2);

		// 2 get high 4 Bits
		int high = (num >>> 4) & Integer.parseInt("1111", 2);

		// 3 mergy them
		System.out.println((low << 4) | high);
	}
}
