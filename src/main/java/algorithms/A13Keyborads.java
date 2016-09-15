package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//BK --day22 IO-5键盘 eg13KeyBoards ???可以再想想readline是怎么实现的???
public class A13Keyborads
{

	final private static InputStream inputValue = System.in;
	/**
	 * <pre>
	 * 1 read value from system.in and package it to a string.
	 *
	 * 2 while value is over , stop
	 *
	 * 3 while not over, loop get new value
	 * </pre>
	 *
	 * @throws IOException
	 */
	final private static StringBuilder stringBuilder = new StringBuilder();

	public static void main(String[] args) throws IOException
	{
		readMyKey();
		readMyKeySimple();
	}

	private static void readMyKeySimple() throws IOException
	{
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		String readLine = null;
		while ((readLine = bufr.readLine()) != null)
		{
			if ("over".equals(readLine))
			{
				break;
			}
			System.out.println(readLine);
		}
	}

	private static void readMyKey() throws IOException
	{
		String finalValue = stringBuilder.toString().toUpperCase();
		int read;
		while (true)
		{
			if ("OVER".equals(finalValue))
			{
				break;
			}

			read = A13Keyborads.inputValue.read();
			while (true)
			{
				if (read == '\n')
				{
					break;
				}
				A13Keyborads.stringBuilder.append((char) read);
				read = A13Keyborads.inputValue.read();
			}
			finalValue = stringBuilder.toString().toUpperCase();
			System.out.println(finalValue);
			stringBuilder.delete(0, stringBuilder.length());
		}
	}

}
