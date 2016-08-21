package itcastday10;

class FuT2 {
	{
		System.out.println("fu lei construction code run ");
	}
	
	FuT2() {
		System.out.println("fu lei fuction run ");
		show();
	}

	void show() {
		System.out.println("hehe");
	}
}

class ZiT2 extends FuT2{
	int num = 9;
	{
		System.out.println("constructor code ..." + num);
		num = 10;
	}

	ZiT2() {
		super();
		System.out.println("zi constructor ..." + num);
	}

	void show() {
		System.out.println("show ... " + num);
	}

}

public class Test2 {
	public static void main(String[] args) {
		new ZiT2();
	}
}