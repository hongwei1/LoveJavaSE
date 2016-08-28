package itcastday07;

class PersionStatic
{

	static interface Foo
	{
		void sys();
	}

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

	public static void main(String args)
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

class aa extends StaticDemo implements PersionStatic.Foo
{
	// @Override // BK --day07 Class 4Encapsulation 3Static 6静态方法不能继承
	public static void main(String args)
	{
		PersionStatic p = new PersionStatic();
		System.out.println(PersionStatic.country);

	}

	@Override
	public void sys()
	{
	}
}