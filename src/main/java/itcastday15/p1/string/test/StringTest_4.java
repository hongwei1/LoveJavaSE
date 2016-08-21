package itcastday15.p1.string.test;

/*
 * 4，模拟一个trim功能一致的方法。去除字符串两端的空白 
 * 
 * 思路：
 * 1，定义两个变量。
 * 一个变量作为从头开始判断字符串空格的角标。不断++。
 * 一个变量作为从尾开始判断字符串空格的角标。不断--。
 * 2,判断到不是空格为止，取头尾之间的字符串即可。
 */
public class StringTest_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "       abc    ";

//		s = myTrim(s);
		s = myTrimMy(s);
		System.out.println("-" + s + "-");
		
	}
	/**
	 * 1 检测空格，删除空格
	 * 2 head for(int i=0;i<s.leng();i++)
	 * 			if(s.subsring(i)!=" ")
	 * 				indexHead = i;
	 * 3 tail for (int j=s.lengt();j>0;j--）
	 * 			if(s.subsring(i)!=" ")
	 * 				indexTail = j;
	 * 4 s.substring(indexHead,indexTail)
	 * 
	 * */
	private static String myTrimMy(String s) {
		int startIndex =0;
		int endIndex= s.length();
		for (int i = 0; i < s.length(); i++) {
			if(!(" ").equals(s.substring(i,i+1))){
				startIndex=i;
				break;
			}
		}
		for (int i = s.length()-1; i >=0; i--) {
			if(!(" ").equals(s.substring(i,i+1))){
				endIndex=i;
				break;
			}
		}
		return s.substring(startIndex,endIndex+1);
	}

	public static String myTrim(String s) {

		int start = 0, end = s.length() - 1;

		while (start <= end && s.charAt(start) == ' ') {
			start++;
		}
		while (start <= end && s.charAt(end) == ' ') {
			end--;
		}
		return s.substring(start, end + 1);
	}

}
