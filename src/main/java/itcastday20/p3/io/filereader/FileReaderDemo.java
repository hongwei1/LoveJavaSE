package itcastday20.p3.io.filereader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import commontools.MyTools;

/**
 * 需求：读取一个文本文件。将读取到的字符打印到控制台.
 *
 * @author zhanghongwei
 *
 */
public class FileReaderDemo
{
	/**
	 * EOF:end of file
	 *
	 */
	final static public int EOF = -1;

	public static void main(String[] args)
	{

		Reader fr = null;
		Reader fr1 = null;

		try
		{
			// 1,创建读取字符数据的流对象。
			// 在创建读取流对象时，必须要明确被读取的文件,一定要确定该文件是存在的,用一个读取流关联一个已存在文件。
			fr = new FileReader(MyTools.PATH);

			// 2,用Reader中的read方法读取字符,一个一个
			int ch0 = fr.read();
			System.out.println((char) ch0);
			int ch1 = fr.read();
			System.out.println(ch1);
			int ch2 = fr.read();
			int ch3 = fr.read();
			int ch4 = fr.read(); // 会一直读到-1,不回抛出异常
			int ch5 = fr.read();
			int ch6 = fr.read();
			int ch7 = fr.read();
			System.out.println(ch7);
			System.out.println("Loop read value--------");
			// 2 loop读取,new会重新开启一个资源

			fr1 = new FileReader(MyTools.PATH);
			int ch = -1;
			while (FileReaderDemo.EOF != (ch = fr1.read()))
			{
				System.out.println((char) ch);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (null != fr)
			{
				try
				{
					fr.close();
					fr1.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}
}
