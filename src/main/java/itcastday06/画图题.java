package itcastday06;

class Demo2 {
	public static void main(String[] args) {
		int[] arr = new int[2];
		show(arr);
		System.out.println(arr[0]);
	}

	public static void show(int[] arr) {
		arr[0]++;
	}
}
