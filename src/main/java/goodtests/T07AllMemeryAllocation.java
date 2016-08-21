package goodtests;
/*
 * 
//--/LoveJavaSE/src/itcastday10/Test.java
	father class construct  pk explicit initialization ? : father class construct earlier
	eg: 见：super(); // 父类结束初始化，子类才显示初始化成员变量
	
//--/LoveJavaSE/src/itcastday10/Test2.java
	the construct code and explicit initialization ?      :explicit initialization earlier
	
	implicit initialization > super()> construct code >son().
	
	1 构造函数加载
	2 默认初始化
	3 构造器
	4 父类初始化
	5 显式初始化
	6 构造代码块
	7 构造函数的具体初始化
	
	answer：/LoveJavaSE/src/itcastday10/构造代码块初始化过程.bmp	
	
*/

public class T07AllMemeryAllocation {
	    public static void main(String[] args) {    
	        objPoolTest();
	    }

	    public static void objPoolTest() {
	    	Integer i1 = 40;
	    	Integer i2 = 40;
	    	Integer i3 = 0;
	    	Integer i4 = new Integer(40);
	    	Integer i5 = new Integer(40);
	    	Integer i6 = new Integer(0);

	    	System.out.println("i1=i2   " + (i1 == i2));
	    	System.out.println("i1=i2+i3   " + (i1 == i2 + i3));
	    	System.out.println("i1=i4   " + (i1 == i4));
	    	System.out.println("i4=i5   " + (i4 == i5));
	    	System.out.println("i4=i5+i6   " + (i4 == i5 + i6));   
	    	System.out.println("40=i5+i6   " + (40 == i5 + i6));       
	    }
}





