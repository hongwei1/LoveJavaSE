package commontools;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

/**
 * This my own tools, design for the simple use the java
 *
 * @author Hongwei Zhang
 * @version V1.0
 */

public class MyTools
{
	public static String readFileToString;

	private MyTools()
	{
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
	 * Example: MyTools.myStringToFile("src/test/resources/t.txt", "Hi,Hongwei"); Always will create a new file .
	 *
	 * @param path
	 * @param content
	 */
	public static void myStringToFile(String path, String content)
	{
		try
		{
			FileUtils.writeStringToFile(new File(path), content);
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
