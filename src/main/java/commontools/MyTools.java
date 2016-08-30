package commontools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

/**
 * This my own tools, design for the simple use the java
 *
 * @author Hongwei Zhang
 * @version V1.0
 */

public class MyTools
{

	public static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static final String LINE_TABLEKEY = "\t";
	public static final String PATH = "src/main/java/commontools/1.txt";
	public static final String LINE_SPACE = "   ";

	public static String readFileToString;

	private MyTools()
	{
	}

	public static void main(String[] args) throws IOException
	{
		String orignalPath = "/Users/zhanghongwei/Desktop/1.txt";
		String newPath = "/Users/zhanghongwei/Desktop/2.txt";

		try (Reader reader = new FileReader(orignalPath); Writer writer = new FileWriter(newPath);)
		{
			char[] cbuf = new char[1024];
			for (int read = 0; read != -1; read = reader.read(cbuf))
			{
				writer.write(cbuf, 0, read);
			}

		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * get the max of the integer array
	 *
	 * @param arr
	 *            input an integer array
	 * @return the max value of the array
	 */
	public static int getMax(int[] arr)
	{
		int maxIndex = 0;
		for (int x = 0; x < arr.length; x++)
		{
			if (arr[x] > arr[maxIndex])
			{
				maxIndex = x;
			}
		}
		return arr[maxIndex];
	}

	/**
	 * sort the array using select algorithm
	 *
	 * @param arr
	 *            input integer array
	 *
	 */
	public static void selectSort(int[] arr)
	{
		for (int x = 0; x < arr.length - 1; x++)
		{
			for (int y = x + 1; y < arr.length; y++)
			{
				if (arr[x] > arr[y])
				{
					MyTools.swap(arr, x, y);
				}
			}
		}
	}

	/**
	 * find the index of item
	 *
	 * @param arr
	 *            integer array
	 * @param key
	 *            the value
	 * @return index of the value
	 */
	public static int getIndex(int[] arr, int key)
	{
		for (int x = 0; x < arr.length; x++)
		{
			if (arr[x] == key)
			{
				return x;
			}
		}
		return -1;
	}

	/**
	 * print the array format :[1, 2, 3]
	 *
	 * @param arr
	 *            [1, 2, 3]
	 */
	public static <T> void myPrint(T[] arr)
	{
		System.out.print("[");
		for (int i = 0; i < arr.length; i++)
		{
			if (i != arr.length - 1)
			{
				System.out.print(arr[i] + ", ");
			}
			else
			{
				System.out.println(arr[i] + "]");
			}
		}
	}

	public static void myPrint(int[] arr)
	{
		System.out.print("[");
		for (int i = 0; i < arr.length; i++)
		{
			if (i == arr.length - 1)
			{
				System.out.print(arr[i]);
			}
			else
			{
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println("]");
	}

	public static void myPrint(char[] arr)
	{
		System.out.print("[");
		for (int i = 0; i < arr.length; i++)
		{
			if (i == arr.length - 1)
			{
				System.out.print(arr[i]);
			}
			else
			{
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println("]");
	}

	/**
	 * Example: MyTools.myStringToFile("src/test/resources/t.txt", "Hi,Hongwei",true); Always will create a new file .
	 *
	 * @param path
	 * @param content
	 * @param flag
	 *            : true will append the content following . false will create a new file
	 */
	public static void myStringToFile(String path, String content, Boolean flag)
	{
		try
		{
			FileUtils.writeStringToFile(new File(path), content, Charset.defaultCharset(), flag);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Example: String myFileToString = MyTools.myFileToString("src/test/resources/t.txt");
	 *
	 * @param path
	 * @return String
	 */
	public static String myFileToString(String path)
	{
		try
		{
			MyTools.readFileToString = FileUtils.readFileToString(new File(path));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return MyTools.readFileToString;
	}

	/**
	 * change the indexes of the array
	 *
	 * @param arr
	 *            integer array
	 * @param a
	 *            index1
	 * @param b
	 *            index2
	 *
	 *
	 */
	public static void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
