package itcastday16.p1.stringbuilder.test;

public class StringBuilderTest {
	public static void main(String[] args) {
		//StringBuilder
		StringBuilder s1 = new StringBuilder("hello");
		StringBuilder s2 = new StringBuilder("java");
		show(s1,s2);
		System.out.println(s1+"......."+s2); //hhahallo +java
		
		//String
		String s3 = "hello";
		String s4 = "java";
		show1(s3,s4);
		System.out.println(s3+"......."+s4);//Hello....java
	}

	private static void show(StringBuilder s1, StringBuilder s2) {
		s1.replace(1, 2, "Haha"); //s1=hhahallo
		s1 = s2;
		System.out.println(s1+"......."+s2);// java+java
	}

	private static void show1(String s1, String s2) {
		s2.replace('a', 'o');//s2=java
		s1=s2; //s1==s2==java
		System.out.println(s1+"......."+s2); //java...java
	}

	
}
