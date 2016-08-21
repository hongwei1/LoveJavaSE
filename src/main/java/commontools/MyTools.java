package commontools;

/**
This my own tools, design for the simple use the java
@author Hongwei Zhang
@version V1.0
 */


public class MyTools {
	private MyTools () {}
	/**
	get the max of the integer array
	@param arr input an integer array
	@return the max value of the array 
	*/
	public static int getMax(int[] arr)
	{
		int maxIndex = 0;
		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]>arr[maxIndex])
					maxIndex = x;//
		}
		return maxIndex;
	}
	/**
	sort the array using select algorithm
	@param arr input integer array
	
	*/
	public static void selectSort(int[] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=x+1; y<arr.length; y++)
			{
				if(arr[x]>arr[y])
					swap(arr,x,y);
			}
		}
	}

	/**
	change the indexes of the array
	@param arr integer array
	@param a index1
	@param b index2
	
	
	*/
	public static void swap(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	/**
	find the index of item
	@param arr integer array
	@param key the value
	@return index of the value
	*/
	public static int getIndex(int[] arr,int key)
	{
		for(int x=0; x<arr.length; x++)
		{
			if(arr[x]==key)
				return x;
		}
		return -1;
	}

	/**
	change the array to String
	@param arr integer array
	@return String of the array
	*/
	public static String arrayToString(int[] arr)
	{
		String str = "[";

		for(int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				str = str + arr[x]+", ";
			else
				str = str + arr[x]+"]";
		}
		return str;
	}
	

	public static void myPrint(String words, int[] arr) {
		myPrint(" "+words+" ");
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ", ");
		}
		System.out.println("]");
	}


	public static void myPrint(int[] arr, String words) {
		myPrint(words);
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ", ");
		}
		System.out.println("]");
	}


	public static void myPrint(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ", ");
		}
		System.out.println("]");
	}

	public static void myPrint(char[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ", ");
		}
		System.out.println("]");
	}

	public static void myPrint(String words) {
		System.out.println("----------For" + words + "---------");
	}
	public static void myPrint() {
		System.out.println();
	}


}
