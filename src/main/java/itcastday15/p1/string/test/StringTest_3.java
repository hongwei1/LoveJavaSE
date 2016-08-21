package itcastday15.p1.string.test;

/*
 * 3，两个字符串中最大相同的子串。
 * "qwerabcdtyuiop"
 * "xcabcdvbn"
 * 
 * 思路：
 * 1，既然取得是最大子串，先看短的那个字符串是否在长的那个字符串中。
 * 如果存在，短的那个字符串就是最大子串。
 * 2，如果不是呢，那么就将短的那个子串进行长度递减的方式去子串，去长串中判断是否存在。
 * 如果存在就已找到，就不用在找了。
 * 
 * 
 */
public class StringTest_3 {
	public static void main(String[] args) {

		// String s1 = "qwerabcdtyuiop";
		// String s2 = "xcabcdbn";
		String s1 = "abcdeeee";
		String s2 = "xabcyy";

		String maxSubtringMy = getMaxSubtringMy(s1, s2);
		System.out.println("maxSubtringMy=" + maxSubtringMy);

		String s = getMaxSubstring(s2, s1);
		System.out.println("s=" + s);
	}

	/**
	 * 
	 * max --9 xcabcdvbn s2(0,s2.length())
	 * 
	 * max - 1 cabcdvbn xcabcdvb s2(1,s2.length()) | s2(0,s2.length()-1)
	 * 
	 * max - 2 abcdvbn cabcdvb xcabcdv s2(2,s2.length()) | s2(1,s2.length()-1)
	 * |s2(2,s2.length()-2) for(int j =i;j>0;i--) s2(j,s2.length()-(i-j))
	 * 
	 * max -3 bcdvbn abcdvb cabcdv bcdvbn
	 * 
	 * max -4 cdvbn bcdvb abcdv cabcd xcabc
	 * 
	 * @param s1
	 * @param s2
	 */
	private static String getMaxSubtringMy(String s1, String s2) {
		String substring = s2;
		for (int i = 0; i < s2.length() && !s1.contains(substring); i++) {
			for (int j = i; j >= 0; j--) {
				substring = s2.substring(j, s2.length() - (i - j));
				if (s1.contains(substring)) {
					return substring;
				}
			}
		}
		return null;
	}

	/**
	 * 获取最大子串
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static String getMaxSubstring(String s1, String s2) {

		String max = null, min = null;
		max = (s1.length() > s2.length()) ? s1 : s2;

		min = max.equals(s1) ? s2 : s1;

		System.out.println("max=" + max);
		System.out.println("min=" + min);

		for (int i = 0; i < min.length(); i++) { //

			for (int a = 0, b = min.length() - i; b != min.length() + 1; a++, b++) {//a=0,b=8,a=1,b=9
				String sub = min.substring(a, b);//a=0,b=8
				System.out.println(sub);
				if (max.contains(sub))
					return sub;
			}
		}

		return null;
	}
}
