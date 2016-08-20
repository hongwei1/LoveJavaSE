package Glispa;

import java.util.Comparator;

public class PassA{
	public static void main(String[]strings){
		PassA passA =new PassA();
		passA.start();
		
	}
	void start() {
		long [] a1 = {3,4,5};
		long [] a2 = fix(a1); // a1[1] = 7 --> [3,7,5] 
		//TODOGlispa 1- 9:37:40 AM  a2 --a1// a2=[3,7,5]
		System.out.println(a1[0]+a1[1]+a1[2]+"");
		System.out.println(""+a1[0]+a1[1]+a1[2]);
		System.out.println(a2[0]+a2[1]+a2[2]);
	}
	long [] fix (long [] a3){
		a3[1]= 7;
		return a3; 
	}
}

class SC2 {
	public static void main(String[] args) {
		SC2 s = new SC2();
		s.start();
	}

	void start() {
		 int a= 3;
		 int b=4;
		 System.out.println(" "+7+2+" "); // 72 --> string first
		 System.out.println(a+b); //7 Addition
		 System.out.println(" "+a+b+" "); // 34 String
		 System.out.println(" "+7+2+" "); // 72
		 System.out.println(foo()+a+b+" "); //foo34
		 System.out.println(a+b+foo());// 7foo
	}

	String  foo() {
		return "foo";
	}
}

////TODOGlispa 2  - 9:45:16 AM 
/*
 * order is it right ??
 * implements Comparator< String> 
 * 1 /LoveJavaSE/src/itcastday19/p1/map/test/CompByLetter.java
 * 2 
 * TreeSetDemo.java
		1 判断元素唯一性的方式：就是根据比较方法的返回结果是否是0，是0，就是相同元素，不存。 
		2 TreeSet对元素进行排序的方式一：
			让元素自身具备比较功能，元就需要实现Comparable接口,覆盖compareTo方法。
ComparatorByLength.java
ComparatorByName.java
		3 TreeSet集合第二种排序方式二：(如果不要按照对象中具备的自然顺序进行排序。如果对象中不具备自然顺序。怎么办？)
			让集合自身具备比较功能，定义一个类实现Comparator接口，覆盖compare方法。
			将该类对象作为参数传递给TreeSet集合的构造函数。
	
	--day18 集合技巧 1
 * */

//TODOGlispa 3 - 9:51:32 AM 
///LoveJavaSE/src/Glispa/QQ20160108-0.gif

//TODOGlispa 4 - 9:55:52 AM  but I can go to details
///LoveJavaSE/src/itcastday09/子类的实例化过程图解.bmp

//b:/LoveJavaSE/src/itcastday07/ConsDemo.java

//TODOGlispa 5 - 9:59:32 AM 
class T5{
	public static void main(String[] args) {
		int x =20;
		String sup =(x<15)?"small":(x<22)?"tiny":"huge";
		System.out.println(sup);
//TODOGlispa 6 - 10:04:39 AM 		
		System.out.println(16>>2);
		System.out.println(16>>>2);// no sign right shift
		System.out.println((16/2)^2); //^ mean xor --> "1000"xor"10",same 0.no 1
		System.out.println((2)^2);
	}
}

//TODOGlispa 7 - 10:07:34 AM 
// set the java path in eclipse .I used before 
// 1 cope all the files
// 2 links the file

//TODOGlispa 8 - 10:08:30 AM 
// 1 JUnit , sometimes
// 2 see the result directly

//TODOGlispa 9 - 10:09:45 AM 
// 1 版本库就是一个仓库，你把东西放进去(通常是你编写的程序代码)，然后再在需要的时候拿出来。
//	 通常这种仓库都有一个很神奇的地方，你不但能看到你放进去的东西现在的样子，还能看到它以前的样子，
//	 这就是版本了，同一件东西每次放进去时的样子都会被保留下来，所以你可以追溯这个东西在任何时期的样子。
	// 1 each change has record 
	// 2 go back any history time you prefer
	// 3 git can divide another distribution and mergy later
// 2

//TODOGlispa 10 - 11:42:37 AM
//QQ20160108-1.gif

//TODOGlispa 13 - 10:39:37 AM  
//a.1 /(\w{4})(\d+)x(\d+)/
//b.1 /(\d{4})(\d{4})(\d{4})/ 
//c.1 /(\d+)(\w+)(\d+),/ 应该是错的 
//d.1 /*(\w{2})-.+/i --/和i是什么？
//d.2 /.*(\d{2}).*/i


//TODOGlispa 8.1 - 11:25:37 AM 
//index1.html
//glispa.css