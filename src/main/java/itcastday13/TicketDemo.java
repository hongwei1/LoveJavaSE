package itcastday13;


//需求：卖票。

// way1: use the static number and extends the threads :still wrong
class TicketWay1 extends Thread
{
	private static int num = 10;

	public void run() {
		while (num > 0) {
			for (long i = -99999999; i < 99999999; i++);
			System.out.println(Thread.currentThread().getName() + ".....sale...." + num--);
		}
	}
}

class TicketDemoWay1 {
	public static void main(String[] args) {
		TicketWay1 t1 = new TicketWay1();// 创建1个线程任务对象。
		TicketWay1 t2 = new TicketWay1();// 创建2个线程任务对象。
		TicketWay1 t3 = new TicketWay1();// 创建3个线程任务对象。
		TicketWay1 t4 = new TicketWay1();// 创建4个线程任务对象。

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}


// way2: use the Runnable interface :still wrong

class TicketWay2 implements Runnable {
	private int num = 10;

	public void run() {
		while (num > 0) {
			for (long i = -99999999; i < 99999999; i++);
			System.out.println(Thread.currentThread().getName() + ".....sale...." + num--);
		}
	}
}

class TicketDemoWay2 {
	public static void main(String[] args) {
		TicketWay2 t = new TicketWay2();// 创建1个线程任务对象。

		new Thread(t).start();// call 4 个线程任务对象。
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}
}



//way 3: use synchronized code
class TicketWay3 implements Runnable// extends Thread
{
	private int num = 10;
	Object b=new Object();
	
	public void run() {
		synchronized (b) { // to know which part is in the lock 
			while (num > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + ".....sale...." + num--);
			}
		}
	}
}

class TicketDemoWay3 {
	public static void main(String[] args) {
		TicketWay3 t = new TicketWay3();// 创建一个线程任务对象。

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
//my Heave
/**
 * mutiplyThread must think about 
 * 1 the share data
 * 2 how many lines the threads works
 * 
 * 
 * */
class TicketMy{
	public static void main(String[] args) {
		MyThicketThread MyThicketThread = new MyThicketThread();
		
		Thread thread1 = new Thread(MyThicketThread);
		Thread thread2 = new Thread(MyThicketThread);
		thread1.start();
		thread2.start();
	}
}

class MyThicketThread implements Runnable{
	int ticketNumber = 1;
	Object mutex = new Object();
	
	@Override
	public void run() {
		// t1 t2
		synchronized (mutex) {
			if (ticketNumber > 0)// t1 t2
				System.out.println("set out :" + ticketNumber--);
		}
	}
	
}
