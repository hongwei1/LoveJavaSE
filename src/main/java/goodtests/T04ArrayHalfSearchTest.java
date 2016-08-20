package goodtests;

public class T04ArrayHalfSearchTest 
{
	public static void main(String[] args) 
	{
		/*
		面试题： 
		question?
			给定一个有序的数组，如果往该数组中存储一个元素，并保证这个数组还是有序的，
			那么个元素的存储的角标为如何获取。
			{13,15,19,28,33,45,78,106};
		answer:
			answer is halfSearchInterview. only care about the arrMin.
		
	*/
		int[] arr = {13, 15, 19, 28, 33, 45, 78, 106 };
		
		System.out.println(halfSearchInterview(arr, 0));
		System.out.println(halfSearchInterview(arr, 50));
		System.out.println(halfSearchInterview(arr, 14));
		System.out.println(halfSearchInterview(arr, 200));
		
	}
	
	private static int halfSearchInterview(int[] arr, int key) {
		int arrMax,arrMin,arrMid;
		arrMax=arr.length-1;
		arrMin=0;
		arrMid=(arrMax+arrMin)/2;
		
		while(arrMax>=arrMin){
			if(key>arr[arrMid])
				arrMin=arrMid+1;
			else if(key<arr[arrMid])
				arrMax=arrMid-1;
			else {
				return arrMid;
			}
			arrMid=(arrMax+arrMin)/2;
		}
		return arrMin;
	}
}
