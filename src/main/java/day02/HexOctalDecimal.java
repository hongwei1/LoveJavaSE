package day02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class HexOctalDecimal
{
	public static void main(String[] args)
	{
		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toHexString(-1));
		System.out.println(Integer.toOctalString(1));
	}

	/**
	 * Transfor "110"-->5
	 *
	 * @param string
	 */
	public static int BinaryToDecimal(String inputValue)
	{
		// 1 change to int array [1,1,0]
		Comparator<String> comp = Collections.reverseOrder();
		String[] stringArray = inputValue.split("");
		Arrays.sort(stringArray, comp);

		// 2 cacurate the result
		int DeceimalNumber = 0;

		for (int i = 0; i < stringArray.length; i++)
		{
			// Accumulation the value:sum = 1*2^0 + 1*2^1 + 1*2^2...
			DeceimalNumber = DeceimalNumber
					+ Integer.valueOf(stringArray[i]) * (int) Math.pow(2, i);
		}
		return DeceimalNumber;
	}

	/**
	 * Transfor 5-->"101"
	 */
	public static Object[] DecimalToBinary(String bineryNumb)
	{
		// 1 change to int array
		int decimalNumber = Integer.valueOf(bineryNumb);

		// 2 cacurate the result
		Object[] binaryArray = new Object[100];
		Arrays.fill(binaryArray, 0);

		for (int i = 0; decimalNumber != 0; i++)
		{
			binaryArray[i] = decimalNumber % 2;
			decimalNumber = decimalNumber / 2;
		}

		Arrays.sort(binaryArray, Collections.reverseOrder());
		return binaryArray;
	}

}
