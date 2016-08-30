package itcastday02;

import java.io.InputStream;

/**
 * --day02 02-Java基础语法1 P1-P15 Test to define all the variables: values ,char,fraction and reference
 *
 */
class VarDemo
{
	public static void main(String[] args)
	{

		InputStream in = System.in;
		// practice all the varibales
		// Value
		byte bByte = 1;
		short sShortNumber = 2;
		int iIntValure = 3;
		long lLongValure = 4;
		// char
		char cCharVa = '1';
		char cCharVa1 = 'b';
		char cCharVa2 = 400;
		System.out.println(cCharVa2);
		// fractions
		float fFloatValure = 5;
		double dDouble = 6;
		// reference
		// class
		// interface
		// Array

		// 数据类型 变量名 = 初始化值;
		byte b2 = 3;
		short s = 4000;
		int x = 12;
		long l = 123l;

		float f = 2.3f;
		double d = 3.4;

		char ch = '1';
		boolean bl = true;

		{
			int z = 9;
			System.out.println(z);
		}

		char z = 'a';
		System.out.println(z);
	}
}
