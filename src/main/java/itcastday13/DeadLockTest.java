package itcastday13;

class Test implements Runnable {
	private boolean flag;

	Test(boolean flag) {
		this.flag = flag;
	}

	public void run() {

		if (flag) {
			while (true)
				synchronized (MyLock.locka) {
					System.out.println(Thread.currentThread().getName() + "..if   locka....");
					synchronized (MyLock.lockb) {
						System.out.println(Thread.currentThread().getName() + "..if   lockb....");
					}
				}
		} else {
			while (true)
				synchronized (MyLock.lockb) {
					System.out.println(Thread.currentThread().getName() + "..else  lockb....");
					synchronized (MyLock.locka) {
						System.out.println(Thread.currentThread().getName() + "..else   locka....");
					}
				}
		}

	}

}

class MyLock {
	public static final Object locka = new Object();
	public static final Object lockb = new Object();
}

class DeadLockTest {
//	public static void main(String[] args) {
//		Test a = new Test(true);
//		Test b = new Test(false);
//
//		Thread t1 = new Thread(a);
//		Thread t2 = new Thread(b);
//
//		t1.start();
//		t2.start();
//
//		/*
//		 * t1 first£¬it get locka,wait for lockb
//		 *   t2 next, it get lockb,waif for locka
//		 * 
//		 * 
//		 * 
//		 */
//	}
}
//my heaven
class MyLocks{
	public final static Object lock1 = new Object(); 
	public final static Object lock2 = new Object(); 
}
class MyMain{
	public static void main(String[] args) {
		 MyThread t1 =new MyThread(true); 
		 MyThread t2 =new MyThread(false); 
		 
		 Thread thread1 = new Thread(t1);
		 Thread thread2 = new Thread(t2);
		 
		 thread1.start();
		 thread2.start();
		
	}
}
class MyThread implements Runnable{

	public boolean flag ;
	public MyThread(boolean flag) {
		this.flag=flag;
	}
	@Override
	public void run() {
		int i=0,j=0;
		while(true){
			if (flag) {
				synchronized (MyLocks.lock1) {
					synchronized(MyLocks.lock2){
						System.out.println("1->2"+(i++));
					}
				}
			}else{
				synchronized (MyLocks.lock2) {
					synchronized(MyLocks.lock1){
						System.out.println("2->1"+(j++));
					}
				}
			}
		}
	}
}