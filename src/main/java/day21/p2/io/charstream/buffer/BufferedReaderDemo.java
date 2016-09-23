package day21.p2.io.charstream.buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo
{

	private static final String PATH = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife/LoveJavaSE/src/itcastday21/buf.txt";

	public static void main(String[] args) throws IOException
	{

		FileReader fr = new FileReader(PATH);

		BufferedReader bufr = new BufferedReader(fr);

		String line = null;

		while ((line = bufr.readLine()) != null)
		{
			System.out.println(line);
		}
		/*
		 * String line1 = bufr.readLine(); System.out.println(line1); String line2 = bufr.readLine(); System.out.println(line2); String line3 = bufr.readLine();
		 * System.out.println(line3); String line4 = bufr.readLine(); System.out.println(line4); String line5 = bufr.readLine(); System.out.println(line5);
		 */

		bufr.close();
		// my heaven
		myHeaven();

	}

	/**
	 * using buffer to read a file
	 *
	 * @throws IOException
	 */
	private static void myHeaven() throws IOException
	{
		System.out.println("------my heaven------");
		FileReader fileReader = new FileReader(PATH);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		String rLine = null;
		while ((rLine = bufferedReader.readLine()) != null)
		{
			System.out.println(rLine);
		}
		bufferedReader.close();

		// String readLine = bufferedReader.readLine();
		// System.out.println(readLine);
		// String readLine1 = bufferedReader.readLine();
		// System.out.println(readLine1);
		// String readLine2 = bufferedReader.readLine();
		// System.out.println(readLine2);
		// String readLine3 = bufferedReader.readLine();
		// System.out.println(readLine3);
		// String readLine4 = bufferedReader.readLine();
		// System.out.println(readLine4);

		// TODO 1 直接背会两个方法就行了，背也是应用
		// a word a word
		int read = 0;
		while ((read = bufferedReader.read()) != -1)
		{
			System.out.print((char) read);
		}
		// the array
		char[] bfArr = new char[1024];
		int len = 0;
		while ((len = bufferedReader.read(bfArr)) != -1)
		{
			System.out.print(String.valueOf(bfArr, 0, len));
		}

	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void demo() throws FileNotFoundException, IOException
	{
		FileReader fr = new FileReader("buf.txt");

		char[] buf = new char[1024];

		int len = 0;
		while ((len = fr.read(buf)) != -1)
		{
			System.out.println(new String(buf, 0, len));
		}

		fr.close();
	}

}
