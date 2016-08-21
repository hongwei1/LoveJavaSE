package itcastday13;

/*
死锁：常见情景之一：同步的嵌套。

*/
class Ticket implements Runnable {
	private int num = 100;
	Object obj = new Object();
	boolean flag = true;

	public void run() {

		if (flag)
			while (true) {// 每次都重新拿锁
				synchronized (obj) { // 拿obj锁，
					                 // 拿this锁
					show();// 运行完show()就放开this锁，
				}          // 运行完obj就放开obj锁，
			}
		else
			while (true)
				this.show();
	}
/*
 * t1 放开this，
 * 	t2 拿到this,等待obj
 *    t1 放开obj
 *      t1 又拿起了obj，等待this
 *        
 * 
 * */
	public synchronized void show() {// 先拿this锁
		synchronized (obj) {         // 再拿obj锁
			if (num > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}

				System.out.println(Thread.currentThread().getName() + ".....sale...." + num--);
			}
		}
	}
}

class DeadLockDemo {
	public static void main(String[] args) {
		Ticket t = new Ticket();
		// System.out.println("t:"+t);

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		t.flag = false;
		t2.start();
	}
}
