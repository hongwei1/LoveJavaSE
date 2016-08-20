package itcastday07;

class PersionStatic
{
	String name; // 成员变量==实例变量
	static String country = "CN";// 静态变量==类变量

	public void show()
	{
		System.out.println(PersionStatic.country + ":" + this.name);
	}
}

class StaticDemo
{
	static int num = 4;

	public static void main(String[] args)
	{
		PersionStatic p = new PersionStatic();
		p.name = "小强";
		p.show();
		System.out.println(PersionStatic.country);
		System.out.println(PersionStatic.country);
		// PersionStatic.show();

		StaticDemo.show();
	}

	public static void show()
	{
		System.out.println(StaticDemo.num);
	}
}
