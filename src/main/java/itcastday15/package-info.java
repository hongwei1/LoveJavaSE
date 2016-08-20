/**
--------------------------------------------String----------------------------------------------
StringDemo.java
01-常用对象API(String类-特点).avi (23:42)
	1 特点：字符串对象一旦被初始化就不会被改变。
	2 字符串常量池--池中没有就建立，池中有，直接用。
		String s = "abc";
	3 new 出的对象在堆中。
	eg:StringDemo.java 
	
StringConstructorDemo.java
	1 一共有15个constructors： 1+8+2+1+3 =15
	2 byte[]--> String 
	3 char[]--> String 
	eg: StringConstructorDemo 

StringMethodDemo.java
	1 一共有65个methods：按照面向对象的思想对字符串进行功能分类。
	1,获取：
		1.1 获取字符串中字符的个数(长度).
				int length();
		1.2 根据位置获取字符。
				char charAt(int index);
		1.3 根据'字符'获取在字符串中的第一次出现的位置.
				int indexOf(int ch)
				int indexOf(int ch,int fromIndex):从指定位置进行ch的查找第一次出现位置 
				int lastIndexOf(int ch)
				int lastIndexOf(int ch,int fromIndex):从指定位置进行ch的查找第一次出现位置 
			根据'字符串'获取在字符串中的第一次出现的位置.
				int indexOf(String str);
				int indexOf(String str,int fromIndex);
				int lastIndexOf(String str);
				int lastIndexOf(String str,int fromIndex);
		1.4 获取字符串中一部分字符串。也叫子串.
				String substring(int beginIndex, int endIndex)//包含begin 不包含end 。
				String substring(int beginIndex);
	2，转换。
		2.1 将字符串变成字符串数组(字符串的切割)
			String[]  split(String regex):涉及到正则表达式.
		2.2 将字符串变成字符数组。
			char[] toCharArray();
		2.3 将字符串变成字节数组。
			byte[] getBytes();
		2.4 将字符串中的字母转成大小写。
			String toUpperCase():大写
			String toLowerCase():小写
		2.5 将字符串中的内容进行替换
			String replace(char oldch,char newch);
			String replace(String s1,String s2);
		2.6 将字符串两端的空格去除。
			String trim();
		2.7 将字符串进行连接 。
			String concat(string);
		2.8 静态函数，把别得值变为字符串
			String.valueOf(4)--> 4 --> 字符串
	3，判断
		3.1 两个字符串内容是否相同啊？
			boolean equals(Object obj);
			boolean equalsIgnoreCase(string str);忽略大写比较字符串内容。
		3.2 字符串中是否包含指定字符串？
			boolean contains(string str);
		3.3 字符串是否以指定字符串开头。是否以指定字符串结尾。
			boolean startsWith(string);
			boolean endsWith(string);
	4，比较。
		4.1 "abc".compareTo("aqz")
		
StringObjectDemo.java
	//intern():对字符串池进行操作的,把堆中数据，放入常量池中

StringTest.java
StringTest_1.java
	1，给定一个字符串数组。按照字典顺序进行从小到大的排序。
		{"nba","abc","cba","zz","qq","haha"}
StringTest_2.java
	2，一个子串在整串中出现的次数。
 		"nbaernbatynbauinbaopnba"
StringTest_3.java
 	3，两个字符串中最大相同的子串。
 		"qwerabcdtyuiop"
  		"xcabcdvbn"
StringTest_4.java
 	4，模拟一个trim功能一致的方法。去除字符串两端的空白 


--------------------------------------------StringBuffer------------------------------------------
StringBufferDemo.java	
	StringBuffer:就是字符串缓冲区,用于存储数据的容器。
	1 特点：
		1，长度的可变的。 
		2，可以存储不同类型数据。
		3，最终要转成字符串进行使用。
		4，可以对字符串进行修改。
	2 构造器 -- 4 
		StringBuffer() 
		StringBuffer(CharSequence seq) 
		StringBuffer(int capacity) 
		StringBuffer(String str) 
	3 功能 -- 50
	  既然是一个容器对象。应该具备什么功能呢？
	  CURD --增删改查  C(create)U(update)R(read)D(delete) 
		1，添加：
				StringBuffer append(data); --14
				StringBuffer insert(index,data); --12
				sb.append(x) 和 sb.insert(sb.length(), x) 具有相同的效果。
		2，删除：
				StringBuffer delete(start,end):包含头，不包含尾。 -1
				StringBuffer deleteCharAt(int index):删除指定位置的元素 -1
		3，查找：
				char charAt(index);
				int indexOf(string);
				int lastIndexOf(string);
		4，修改：
				StringBuffer replace(start,end,string);
				void setCharAt(index,char);
--------------------------------------------day15StringBuilder---------------------------------------
StringBuilderDemo.java
	jdk1.5以后出现了功能和StringBuffer一模一样的对象。就是StringBuilder
	不同的是：
		StringBuffer是线程同步的。通常用于多线程。
		StringBuilder是线程不同步的。通常用于单线程。 它的出现提高效率。

StringBuilderTest.java
 	将一个int[]数组变成字符串。
	 	eg1：用String会浪费空间，每次都会产生新的String在常量池中。
	 	eg2：用StringBuffer可以提高效率。
	如果你保存的数据要以字符串的形式来使用则用stringbuffer 和stringbuilder的形式。
	一旦进入他们取出的就只有字符串了数组，存入和取出的格式一样的。

JDK升级
	1，简化书写。
	2，提高效率。
	3，增加安全性。

*/
/**
* show 方法的简述. 
* <p>show 方法的详细说明第一行<br> 
* show 方法的详细说明第二行 
* @param b true 表示显示，false 表示隐藏 
* @return 没有返回值  

 * @author zhanghongwei
 *
 */

package itcastday15;