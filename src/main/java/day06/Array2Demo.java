package day06;

/*
二维数组定义的格式�??
*/

class Array2Demo
{
	public static void main(String[] args)
	{

		int[][] arr0 = new int[1][];
		int[][] arr1 = new int[1][1];
		int[][] arr2 = { { 3, 1, 7 }, { 5, 8, 2, 9 }, { 4, 1 } };
		int[] arr3 = null;
		System.out.println(arr3);
		// System.out.println(arr3[0]);
		String a = null;
		System.out.println(a);

		// int[] arr = new int[3];
		// System.out.println(arr);//[I@1fb8ee3 @左边是实体的类型�? @右边是实体的哈希值�??

		// int[][] arr = new int[3][2];//创建�?个二维数组，该数组中�?3个一维数组，每一个一维数组中�?2个元素�??
		// System.out.println(arr); //直接打印二维数组�? [[I@c17164
		// System.out.println(arr[0]); //直接打印二维数组中的角标0的一维数组�?? [I@1fb8ee3
		// System.out.println(arr[0][0]);//直接打印二维数组中的角标0的一维数组中角标�?0的元素�?? 0

		// int[][] arr = new int[3][];
		// System.out.println(arr); //直接打印二维数组�? [[I@c17164
		// System.out.println(arr[0]); //直接打印二维数组中的角标0的一维数组�?�null
		// System.out.println(arr[0][0]);//直接打印二维数组中的角标0的一维数组中角标�?0的元素�?? NullPointerException

		// int[][] arr = new int[3][2];
		// System.out.println(arr.length);//打印二维数组的长度�?�其实就是一维数组的个数�?
		// System.out.println(arr[1].length);//打印二维数组中角标为1�?维数组的长度�?

		int sum = 0;
		int[][] arr = { { 3, 1, 7 }, { 5, 8, 2, 9 }, { 4, 1 } };
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				sum += arr[i][j];
			}
		}

		System.out.println("sum=" + sum);

		// 甲：30 59 28 17
		// 乙；37 60 22 19
		// int[] arr = {{30,59,28,17},{37,60,22,19}};

		// int[][][] arr = new int[3][2][4];

		int[] x, y[] = null;
		// x=y;
		x = y[0];
		// x[0]=y[0];
		x[0] = y[0][0];
		// x[0] = y;
	}
}

/*
 * int[] x,y[]; int[] x; int[] y[];
 * 
 * 
 * a x = y;
 * 
 * b x = y[0];
 * 
 * c x[0] = y[0];
 * 
 * d x[0] = y[0][0];
 * 
 * e x[0] = y;
 */