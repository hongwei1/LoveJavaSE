package itcastday10;

/*
多态时，
成员的特点：
1，成员变量。
	编译时：参考引用型变量所属的类中的是否有调用的成员变量，有，编译通过，没有，编译失败。
	运行时：参考引用型变量所属的类中的是否有调用的成员变量，并运行该所属类中的成员变量。
	简单说：编译和运行都参考等号的左边。
	作为了解。



2，成员函数(非静态)。
	编译时：参考引用型变量所属的类中的是否有调用的函数。有，编译通过，没有，编译失败。
	运行时：参考的是对象所属的类中是否有调用的函数。
	简单说：编译看左边，运行看右边。

	因为成员函数存在覆盖特性。


3，静态函数。
		编译时：参考引用型变量所属的类中的是否有调用的静态方法。
		运行时：参考引用型变量所属的类中的是否有调用的静态方法。
		简单说，编译和运行都看左边。

		其实对于静态方法，是不需要对象的。直接用类名调用即可。


		

*/

class Fu {
	int num = 3;
	void show() {
		System.out.println("fu show "+num);
	}

	static void staticMethod() {
		System.out.println("fu static method");
	}
}

class Zi extends Fu {
	int num = 4;
	void show() {
		System.out.println("zi show "+num);
	}

	static void staticMethod() {
		System.out.println("zi static method");
	}
}

class DuoTaiDemo3 {
	public static void main(String[] args) {
//		Fu.staticMethod();
//		Zi.staticMethod();
		Fu f = new Zi();
		f.staticMethod();
//		f.show();
//		System.out.println(f.num);
	}
}
