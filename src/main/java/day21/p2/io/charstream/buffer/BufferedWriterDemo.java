package day21.p2.io.charstream.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo
{

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	private static final String PATH = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife/LoveJavaSE/src/itcastday21/buf.txt";

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{

		FileWriter fw = new FileWriter(BufferedWriterDemo.PATH);

		// 为了提高写入的效率。使用了字符流的缓冲区。
		// 创建了一个字符写入流的缓冲区对象，并和指定要被缓冲的流对象相关联
		BufferedWriter bufw = new BufferedWriter(fw);

		// 使用缓冲区的写入方法将数据先写入到缓冲区中。
		// bufw.write("abcdefq"+LINE_SEPARATOR+"hahahha");
		// bufw.write("xixiixii");
		// bufw.newLine();
		// bufw.write("heheheheh");

		for (int x = 1; x <= 4; x++)
		{
			bufw.write("abcdef" + x);
			bufw.newLine();
			bufw.flush();
		}

		// 使用缓冲区的刷新方法将数据刷目的地中。
		bufw.flush();

		// 关闭缓冲区。其实关闭的就是被缓冲的流对象。
		bufw.close();

		// 关闭缓冲区就关闭了流,
		// fw.write("hehe");
		// fw.close();

	}

}
