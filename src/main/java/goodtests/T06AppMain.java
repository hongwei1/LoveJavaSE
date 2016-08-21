package goodtests;
//http://lz12366.iteye.com/blog/639873

// know more about the memory : stack ,heap, data ...

public class T06AppMain {
	public static void main(String[] args) // main 方法本身放入方法区。
	{
		Sample test1 = new Sample(" 测试1 "); // test1是引用，所以放到栈区里，
											 // Sample是自定义对象应该放到堆里面
		Sample test2 = new Sample(" 测试2 ");

		test1.printName();
		test2.printName();
		
		Sample s2= new Sample("aa");
		final Sample s1=s2; //TODO 2 final 认真体会final 的内容
		// http://renchx.com/jmm-final/
		// http://wenjiesu.iteye.com/blog/799332
		// http://www.weixueyuan.net/view/6103.html
		s2=new Sample("bb");
		System.out.println(s1);
		System.out.println(s2);
		s1.printName();
		s2.printName();
		
	}
}

class Sample // 运行时, jvm 把appmain的信息都放入方法区 {
{
	/** 范例名称 */
	private String name; // new Sample实例后， name 引用放入栈区里， name 对象放入堆里

	/** 构造方法 */
	public Sample(String name) {
		this.name = name;
	}

	/** 输出 */
	public void printName() // print方法本身放入 方法区里。
	{
		System.out.println(name);
	}

}