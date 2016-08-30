package itcastday20.p2.io.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo
{

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args)
	{
		// elder one :
		FileWriter fw = null;
		try
		{
			fw = new FileWriter("/demo1.txt");
			fw.write("abcde" + IOExceptionDemo.LINE_SEPARATOR + "hahaha");

		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (fw != null)
			{
				try
				{
					fw.close();
				}
				catch (IOException e)
				{
					throw new RuntimeException("πÿ±’ ß∞‹");
				}
			}
		}

		// JDK1.5
		try (FileWriter fw2 = new FileWriter("/demo2.txt"))
		{
			fw2.write("abcde" + IOExceptionDemo.LINE_SEPARATOR + "hahaha");

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
