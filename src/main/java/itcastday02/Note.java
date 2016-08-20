package itcastday02;

/**
 * P1-P19 传智播客_Java培训_毕向东_Java基础[02-Java基础语法1]
 *
 * I took the notes by going though the PPT.
 * 
 */

public class Note
{

	public static void main(String[] args)
	{
		// p5 传智播客_Java培训_毕向东_Java基础[02-Java基础语法1]
		// test the identifier ：_ and $
		int _$ = 2, $a_ = 6;
		System.out.println(_$);
		System.out.println($a_);

		// p10 传智播客_Java培训_毕向东_Java基础[02-Java基础语法1]
		// test keyword "null" ,null means empty object.It has no heap space,
		// just in constant pool
		Integer i = null;
		Object o1 = null;
		System.out.println("null----" + (i == o1)); // proof "null" has a stack memory? "==" means address

		String strP10 = null;
		String strP10_1 = null;
		System.out.println(strP10 == o1); // proof "null" has a stack memory

		// Practice the Octal,Decimal ，Hex ,different kinds of numbers.
		System.out.println(0xAE); // Hex
		System.out.println(String.format("%H", 0xAE)); // Hex
		System.out.println(0117); // Octal
		System.out.println(Integer.toOctalString(0117)); // Octal
		System.out.println(Integer.toBinaryString(5)); // Octal
		System.out.println(12); // Decimal

		// p15 传智播客_Java培训_毕向东_Java基础[02-Java基础语法1]
		// test the + function in connecting String
		System.out.println('a');
		System.out.println("a");
		System.out.println('a' + 1 + "  = a+1 ");
		System.out.println("a+1 = " + "a" + 1);

		// p17 传智播客_Java培训_毕向东_Java基础[02-Java基础语法1]
		// test the function of "++"
		int b = 16;
		System.out.println(++b);
		b = 16;
		System.out.println(b++);
		b = 16;
		System.out.println(b / 10 * 100);

		// p18 传智播客_Java培训_毕向东_Java基础[02-Java基础语法1]
		// test the % , / and +
		System.out.println(-5 % 2); // -1
		System.out.println(5 % -2); // +1
		// float divide all the float bits.
		System.out.println(11.0 / 2);
		// integer divide only has the integer bits
		System.out.println(11 / 2);
		// + used into integer and string ,has different meanings.
		System.out.println('a' + 1);
		System.out.println("a" + 1);

		// p19 传智播客_Java培训_毕向东_Java基础[02-Java基础语法1]
		// type cast
		short s = 3000;
		s = (short) (s + 2);
		s += 2;
	}

}
