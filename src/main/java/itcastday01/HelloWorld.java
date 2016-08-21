package itcastday01;

public class HelloWorld {
	
	
	static int a;
	
	static public void main(String[] args) {
		System.out.println("hello wolrd !!!");
		
		String aString ="hongwei";
		StringBuffer aBuffer=new StringBuffer("hongwei");
		a=3;
		a=4;
		int c = add(a,a);
		System.out.println(a);
		System.out.println(aString);
		System.out.println(aBuffer);
		
		System.out.println(c);
	}

	private static int add(int a2, int a3) {
		a2=4;
		a3=5;
		int d = add1(a2,a2);
		return a2+a3;
	}
	private static int add1(int a2, int a3) {
		a2=4;
		a3=5;
		return a2+a3;
	}
}