package day21.p3.io.charstream.buffer.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextByBufTest
{
	private static final String PATHREAD = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife/LoveJavaSE/src/itcastday21/buf.txt";
	private static final String PATHWRITE = "/Users/zhanghongwei/Documents/Dropbox/EclipseLife/LoveJavaSE/src/itcastday21/buf_copy.txt";

	public static void main(String[] args) throws IOException
	{

		FileReader fr = new FileReader(CopyTextByBufTest.PATHREAD);
		BufferedReader bufr = new BufferedReader(fr);

		FileWriter fw = new FileWriter(CopyTextByBufTest.PATHWRITE);
		BufferedWriter bufw = new BufferedWriter(fw);

		String line = null;
		while ((line = bufr.readLine()) != null)
		{
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
		bufw.close();
		bufr.close();

	}

}
