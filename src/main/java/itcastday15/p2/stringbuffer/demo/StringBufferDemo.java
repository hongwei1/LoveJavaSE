package itcastday15.p2.stringbuffer.demo;

public class StringBufferDemo {
	public static void main(String[] args) {
		bufferMethodDemo();
		bufferMethodDemo_1();
		bufferMethodDemo_2();
	}
	
	
	private static void bufferMethodDemo_2() {
		StringBuffer sb = new StringBuffer("abce");
		//1 增加
		sb.append("a");
		sb.setCharAt(1, 'a'); //java.lang.StringIndexOutOfBoundsException:
		sb.charAt(4);
		sb.insert(1, 'b');   //java.lang.ArrayIndexOutOfBoundsException
		
		//2，删除
		System.out.println("----"+sb.length());
		sb.delete(1, 3);//ae
		sb.deleteCharAt(1);
		System.out.println("----"+sb.length());
		
		//2.2 清空缓冲区。
		sb.delete(0,sb.length());
		sb = new StringBuffer();
		
		//2.3查找替换
		sb.setLength(10);
		System.out.println("sb:"+sb);
		sb.charAt(2);
		sb.indexOf("a");
		sb.lastIndexOf("a");
		// 4，修改：
		sb.replace(1, 3, "nba");
		sb.setCharAt(2, 'q');
		
		System.out.println("len:"+sb.length());
		System.out.println(sb.reverse());
		
		
	}

	//4，可以对字符串进行修改。
	private static void bufferMethodDemo_1() {
		StringBuffer sb = new StringBuffer("abce");
		sb.append("xixi");
		sb.insert(2, "qq");
		
		System.out.println(sb.toString());
	}

	public static void bufferMethodDemo(){
		//创建缓冲区对象。
		StringBuffer sb = new StringBuffer();
		boolean b= true;
		//2，可以存储不同类型数据。
		sb.append(4).append(false);//.append("haha");
		//3， insert 用法
		sb.insert(1, "haha");
		sb.append(true);
		sb.append("true");
		sb.append(b);
		//3，最终要转成字符串进行使用。
		System.out.println(sb);
		
	}
	
	

}
