package commontools;

import java.util.Arrays;

public class Algorithm09ArraySearch {
	public static void main(String[] args) {
		int[] arrNormal = { 4, 1, 8, 7, 3, 8, 2 };
		System.out.println(basicSearch(arrNormal, 8));

		int[] arr = { 13, 15, 19, 28, 33, 45, 78, 106 };
		int index = halfSearch(arr, 33);
		int index_2 = halfSearch_2(arr, 33);
		System.out.println("index=" + index + " index_2=" + index_2);

		int index1 = Arrays.binarySearch(arr, 5); // 如果存在返回的具体的角标位置，不存在返回的是
												  // -插入点-1
		System.out.println("index1=" + index1);
	}

	/*
	 * 数组常见功能：查找。
	 */
	public static int basicSearch(int[] arr, int key) {
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == key)
				return x;
		}
		return -1;
	}

	/*
	 * 二分查找法。
	 * 
	 */
	public static int halfSearch(int[] arr, int key) {
		int max,min,mid;
		max=arr.length-1;
		min=0;
		mid=(max+min)/2;
		
		while(max>=min){
			if(key>arr[mid])
				min=mid+1;
			else if(key< arr[mid])
				max=mid-1;
			else {
				return mid;
			}
			mid=(max+min)/2;
		}
		
		return -1;
	}

	public static int halfSearch_2(int[] arr, int key) {
		int Max, Min, Mid;
		Max = arr.length - 1;
		Min = 0;
		Mid = (Max + Min) / 2;

		while (arr[Mid] != key) {
			if (arr[Mid] < key)
				Min = Mid + 1;
			else {
				Max= Mid-1;
			}
			Mid= (Max + Min) / 2;
			if(Max<Min)
				return -1;
		}

		return Mid;
	}
}
