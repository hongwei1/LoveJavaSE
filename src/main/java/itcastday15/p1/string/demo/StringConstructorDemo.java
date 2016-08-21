package itcastday15.p1.string.demo;

import itcastday15.p1.string.test.StringTest_2;
import itcastday15.p2.stringbuffer.demo.StringBufferDemo;

public class StringConstructorDemo {

	public static void main(String[] args) {
		//1 空参数
		String s = new String();//等效于String s = "";  不等效String s = null;
		String s1 = "";
		String s2 = null;
		//2将字节数组转成字符串可以通过String类的构造函数完成。
		stringConstructorDemo();
		//3字符数组转成字符串可以通过String类的构造函数完成。
		stringConstructorDemo2();
		
	}

	public static void stringConstructorDemo2() {
		char[] arr = {'w','a','p','q','x'};
		String s = new String(arr);
		String s1 = new String(arr,1,3);
		System.out.println("s="+s);
		System.out.println("s1="+s1);
		String s2= new String();
		String s3= new String("asdf");
		String s4= new String(arr);
		
	}

	public static void stringConstructorDemo() {
		byte[] c ={97,98,99,65,(byte) 1111};
		String s= new String(c);
		String s1= new String(c,1,3);
		System.out.println(s);
		System.out.println(s1);
		String s2 = new String(c);
		int [] intS={1,2,3,4};
		String s3= new String(intS,1,3);
		System.out.println("-----s3: "+s3);
		StringBuffer s4= new StringBuffer(233);
		System.out.println(s4);
		String s5= new String(s4);
	}



}
