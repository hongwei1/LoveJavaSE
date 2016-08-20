package itcastday12;

/*
如何创建一个线程呢？
	创建线程方式一：继承Thread类。

步骤：
1，定义一个类继承Thread类。
2，覆盖Thread类中的run方法。
3，直接创建Thread的子类对象创建线程。
4，调用start方法开启线程并调用线程的任务run方法执行。

可以通过Thread的getName获取线程的名称 Thread-编号(从0开始)

主线程的名字就是main。
*/

/*
class Demo2 {
	private String name;

	Demo2(String name) {
		this.name = name;
	}

	public void run() {
		for (int x = 0; x < 10; x++) {
			System.out.println(name + "....x=" + x);
		}
	}
}

class ThreadDemo2 {
	public static void main(String[] args) {
		Demo2 d1 = new Demo2("旺财");
		Demo2 d2 = new Demo2("xiaoqiang");
		d1.run();
		d2.run();
	}
}
*/

/*
class Demo2 extends Thread {
	private String name;

	Demo2(String name) {
		this.name = name;
	}

	public void run() {
		for (int x = 0; x < 10; x++) {
			for (int y = -9999999; y < 999999999; y++) {
			}
			System.out.println(name + "....x=" + x);
		}
	}
}

class ThreadDemo2 {
	public static void main(String[] args) {
		Demo2 d1 = new Demo2("旺财");
		Demo2 d2 = new Demo2("xiaoqiang");
		d1.start();// 开启线程，调用run方法。
		d2.start();
		System.out.println("over....");
	}
}
*/

class Demo2 extends Thread {
	private String name;

	Demo2(String name) {
		super(name);// set the name for thread object
		this.name =name;
	}

	public void run() {
		for (int x = 0; x < 10; x++) {
			System.out.println(name + "....x=" + x + ".....Thread name=" + Thread.currentThread().getName());
		}
	}
}

class ThreadDemo2 {
	public static void main(String[] args) {
		Demo2 d1 = new Demo2("旺财");
		Demo2 d2 = new Demo2("xiaoqiang");
//		d1.run();// 开启线程，调用run方法。
//		d2.run();
		
		d1.start();// 开启线程，调用run方法。
		d2.start();
		
		System.out.println("over...." + Thread.currentThread().getName());
	}
}
// 调用run和调用start有什么区别？
