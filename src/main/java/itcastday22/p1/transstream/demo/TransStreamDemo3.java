package itcastday22.p1.transstream.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class TransStreamDemo3
{

	public static void main(String[] args) throws IOException
	{
		// TransStreamDemo3.eg1_copyTextFile();
		// TransStreamDemo3.eg2_keybordToFile();
		// TransStreamDemo3.eg3_FileToConsole();
		// TransStreamDemo3.eg4_KeybordToConsole();
		TransStreamDemo3.eg5_EncodeTofile();
		// TransStreamDemo3.readText_2();
	}

	/**
	 * <pre>
	============================================================

	5，将一个中文字符串数据按照指定的编码表写入到一个文本文件中.

	1，目的。OutputStream，Writer
	2，是纯文本，Writer。
	3，设备：硬盘File
	FileWriter fw = new FileWriter("a.txt");
	fw.write("你好");

	注意：既然需求中已经明确了指定编码表的动作。
	那就不可以使用FileWriter，因为FileWriter内部是使用默认的本地码表。
	只能使用其父类。OutputStreamWriter.
	OutputStreamWriter接收一个字节输出流对象，既然是操作文件，那么该对象应该是FileOutputStream

	OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"),charsetName);

	需要高效吗？
	BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.txt"),charsetName));
	 * </pre>
	 *
	 * @throws IOException
	 */
	private static void eg5_EncodeTofile() throws IOException
	{
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk_3.txt"), "GBK");
	 FileWriter fw = new FileWriter("gbk_1.txt");

		/*
		 * 这两句代码的功能是等同的。 FileWriter：其实就是转换流指定了本机默认码表的体现。而且这个转换流的子类对象，可以方便操作文本文件。
		 *
		 * 简单说：操作文件的字节流+本机默认的编码表。 这是按照默认码表来操作文件的便捷类。
		 *
		 * 如果操作文本文件需要明确具体的编码。FileWriter就不行了。必须用转换流。
		 *
		 */

		osw.write("你好");

		osw.close();
	}

	/**
	 * <pre>
	 *需求4：读取键盘录入数据，显示在控制台上。
	1,明确源和目的。
		源：InputStream Reader
		目的：OutputStream  Writer
	2，是否是纯文本呢？
		是，
		源：Reader
		目的：Writer
	3，明确设备。
		源：
			键盘：System.in
		目的：
			控制台：System.out

		InputStream in = System.in;
		OutputStream out = System.out;

	4，明确额外功能？
		需要转换，因为都是字节流，但是操作的却是文本数据。
		所以使用字符流操作起来更为便捷。
		InputStreamReader isr = new InputStreamReader(System.in);
		OutputStreamWriter osw = new OutputStreamWriter(System.out);

		为了将其高效。
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
	 * </pre>
	 *
	 * @throws IOException
	 *
	 */
	private static void eg4_KeybordToConsole() throws IOException
	{
		BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(System.out);
		StringBuilder stringBuilder = new StringBuilder();
		while (true)
		{
			// 1 先把一个个输入的数据组成一个子串
			int read = -1;
			while ((read = bufferedInputStream.read()) != '\n')
			{
				stringBuilder.append((char) read);
			}

			// 2 判断值
			if ("over".equalsIgnoreCase(stringBuilder.toString()))
			{
				break;
			}

			// 3输出
			bufferedOutputStream.write(stringBuilder.toString().toUpperCase().getBytes());
			bufferedOutputStream.write(System.getProperty("line.separator").getBytes());
			bufferedOutputStream.flush();
			stringBuilder.setLength(0);
		}
	}

	/**
	 * <pre>
	 **需求3：将一个文本文件数据显示在控制台上。
	1,明确源和目的。
		源：InputStream Reader
		目的：OutputStream  Writer
	2，是否是纯文本呢？
		是，
		源：Reader
		目的：Writer
	3，明确具体设备
		源：
			硬盘：File
		目的：
			控制台：System.out
	
		FileReader fr = new FileReader("a.txt");
		OutputStream out = System.out;//PrintStream
	4，需要额外功能吗？
		需要，转换。
		FileReader fr= new FileReader("a.txt");
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		需要，高效。
		BufferedReader bufr = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
	 *
	 * </pre>
	 *
	 * @throws IOException
	 */
	private static void eg3_FileToConsole() throws IOException
	{// 将一个文本文件数据显示在控制台上。文本是字节,控制台也是字节

		PrintStream out = System.out;
		try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("src/main/java/itcastday22/eg3_FileToConsole.txt"));)
		{

			int read = -1;
			while ((read = bufferedInputStream.read()) != -1)
			{
				out.write(read);
				out.flush();
			}

		}
	}

	/**
	 * <pre>
	 * 需求2：读取键盘录入信息，并写入到一个文件中。
	
	1,明确源和目的。
		源：InputStream Reader
		目的：OutputStream  Writer
	2，是否是纯文本呢？
		是，
		源：Reader
		目的：Writer
	3，明确设备
		源：
			键盘。System.in
		目的：
			硬盘。File
	
		InputStream in = System.in;
		FileWriter fw = new FileWriter("b.txt");
		这样做可以完成，但是麻烦。将读取的字节数据转成字符串。再由字符流操作。
	4，需要额外功能吗？
		需要。转换。	将字节流转成字符流。因为名确的源是Reader，这样操作文本数据做便捷。
			所以要将已有的字节流转成字符流。使用字节-->字符 。InputStreamReader
		InputStreamReader isr = new InputStreamReader(System.in);
		FileWriter fw = new FileWriter("b.txt");
	
		还需要功能吗？
		需要：想高效。
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufw = new BufferedWriter(new FileWriter("b.txt"));
	 * </pre>
	 *
	 * @throws IOException
	 */
	private static void eg2_keybordToFile() throws IOException
	{
		// 键盘到文件: 字符到字符吧
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/java/itcastday22/eg2_keybordToFile.txt")))
		{
			String readLine = null;
			while ((readLine = bufferedReader.readLine()) != null)
			{
				bufferedWriter.write(readLine);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				if ("over".equalsIgnoreCase(readLine))
				{
					break;
				}
			}
		}
	}

	/**
	 * <pre>
	 * 需求1：复制一个文本文件。
	1,明确源和目的。
		源：InputStream Reader
		目的：OutputStream  Writer
	2,是否是纯文本？
		是！
		源：Reader
		目的：Writer

	3,明确具体设备。
		源：
			硬盘：File
		目的：
			硬盘：File

		FileReader fr = new FileReader("a.txt");
		FileWriter fw = new FileWriter("b.txt");

	4,需要额外功能吗？
		需要，需要高效。
		BufferedReader bufr = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bufw = new BufferedWriter(new FileWriter("b.txt"));
	 * </pre>
	 *
	 * @throws IOException
	 */
	private static void eg1_copyTextFile() throws IOException
	{
		// 本文都是字符,可以用字符流.其他格式采用字节流了.
		try (BufferedReader bfBufferedReader = new BufferedReader(new FileReader("src/main/java/itcastday22/b.txt"));
				BufferedWriter bfBufferedWriter = new BufferedWriter(new FileWriter("src/main/java/itcastday22/b_copy.txt"));)
		{
			String readLine;
			while (null != (readLine = bfBufferedReader.readLine()))
			{
				bfBufferedWriter.write(readLine);
				bfBufferedWriter.newLine();
			}
		}
	}

}
