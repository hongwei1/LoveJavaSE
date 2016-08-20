package itcastday20.p3.io.filereader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

//需求：读取一个文本文件。将读取到的字符打印到控制台.

public class FileReaderDemo2 {

	
	private static final String PATH = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife/LoveJavaSE/src/itcastday20/p3/io/filereader/demo.txt";

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(PATH);

		/*
		 * 使用read(char[])读取文本文件数据。
		 * 
		 * 先创建字符数组。
		 */
		char[] buf = new char[1024];

		int len = 0;

		while ((len = fr.read(buf)) != -1) {
			System.out.println(new String(buf, 0, len));
		}

		/*
		 * int num = fr.read(buf);//将读取到的字符存储到数组中。
		 * System.out.println(num+":"+new String(buf,0,num)); int num1 =
		 * fr.read(buf);//将读取到的字符存储到数组中。 System.out.println(num1+":"+new
		 * String(buf,0,num1)); int num2 = fr.read(buf);//将读取到的字符存储到数组中。
		 * System.out.println(num2+":"+new String(buf));
		 */

		fr.close();
		
		//my Heaven
		myHeaven();
	}

	private static void myHeaven() {
		try {
			Reader reader = new FileReader(PATH);
			char[] cbuf = new char[3];
			int len=reader.read(cbuf,0,reader.read(cbuf));
			while (len!=-1) {
				System.out.println(cbuf);
				len=reader.read(cbuf);
			}
			reader.close();
		} catch (Exception e) {

		}
	}

}
