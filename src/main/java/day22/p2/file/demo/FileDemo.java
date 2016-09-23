package day22.p2.file.demo;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
//		constructorDemo();
		//myheaven();
		myHeaven();
	}

	private static void myHeaven() {
		//four fields: for different systems.
		System.out.println(File.pathSeparator);//different path-separator 
		System.out.println(File.pathSeparatorChar);//different path-separator 
		System.out.println(File.separator);    // name-separator 
		System.out.println(File.separatorChar);    // name-separator 
		
		//4 constructions
		File f0 = new File("asdf");
		File f1 = new File("aa", "bb");
		File f2 = new File(f0,"asdf");
		File f3 = new File("URL");
	}

	public static void constructorDemo() {
		// 可以将一个已存在的，或者不存在的文件或者目录封装成file对象。
		File f1 = new File("c:\\a.txt");

		File f2 = new File("c:\\", "a.txt");

		File f = new File("c:\\");

		File f3 = new File(f, "a.txt");

		// static String separator 与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
		File f4 = new File("c:" + File.separator + "abc" + File.separator + "a.txt");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);

	}

}
