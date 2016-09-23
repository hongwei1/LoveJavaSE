package day0123;

import java.io.IOException;

/**
 * <pre>
需求：根据用户指定的具体数据，判断该数据对应的星期。
1-星期一Monday

思路：
用户输入无法获取但是那只是具体数据的一种获取手段而已。
而我们要做的功能仅仅是对用户指定的数据进行对应星期的打印而已。

所以具体的数据不确定，完成可以使用变量来表示。

我们只对变量进行操作即可。至于变量的值，可以有用户决定。

因为数据的不确定性，所以要对数据进行判断。
使用if语句。
 * </pre>
 */
class IfTest
{
	public static void main(String[] args) throws IOException
	{

		int inputData = 1;
		if (inputData == 1)
		{
			System.out.println(inputData + " Monday");
		}
		else if (inputData == 2)
		{
			System.out.println(inputData + " Tunesday");
		}
		else if (inputData == 3)
		{
			System.out.println(inputData + " Wednesday");
		}
		else if (inputData == 4)
		{
			System.out.println(inputData + " Thursday");
		}
		else if (inputData == 5)
		{
			System.out.println(inputData + " Friday");
		}
		else if (inputData == 6)
		{
			System.out.println(inputData + " Saturday");
		}
		else if (inputData == 7)
		{
			System.out.println(inputData + " Sunday");
		}
		else
		{
			System.out.println(inputData + " No specific data");
		}
	}
}
