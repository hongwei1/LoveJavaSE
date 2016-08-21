package itcastday15.p1.string.demo;

public class StringObjectDemo {
	public static void main(String[] args) {

//		String s1 = "abc";
//		String s2 = "abc";
		
		//intern():对字符串池进行操作的 
		
		String s1 = new String("abc");
		String s2 = s1.intern(); // 把字符串加入到常量池中。
		
		System.out.println(s1==s2);
		
		
		
	}

}
