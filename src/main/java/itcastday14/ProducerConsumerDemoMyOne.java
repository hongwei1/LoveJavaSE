package itcastday14;

/*
生产者，消费者。

多生产者，多消费者的问题。
if判断标记，只有一次，会导致不该运行的线程运行了。出现了数据错误的情况。
while判断标记，解决了线程获取执行权后，是否要运行！

notify:只能唤醒一个线程，如果本方唤醒了本方，没有意义。而且while判断标记+notify会导致死锁。
notifyAll解决了本方线程一定会唤醒对方线程的问题。

*/
/*
 * 
 * 1 many producers and many consumers 
 * 	1 single pro single cons
 * 	2 many 
 * 
 * 
 * */
class PeoCusMain2 {
	public static void main(String[] args) {
		Fish1 Fish1 = new Fish1();

		ProducerMy1 producer = new ProducerMy1(Fish1);
		ConsumerMy1 Consumer = new ConsumerMy1(Fish1);

		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(Consumer);

		t1.start();
		t2.start();
	}
}

class Fish1 {
	int number = 0;
	boolean flag = false;

	// sychronised , make one and buy one
	synchronized void cookFish() throws InterruptedException {
		if (flag)
			this.wait();
		System.out.println("1");
		flag = true;
		this.notify();
	}

	synchronized void earFish() throws InterruptedException {
		if (!flag)
			this.wait();
		System.out.println("2");
		flag = false;
		this.notify();
	}
}

class ProducerMy1 implements Runnable {

	Fish1 Fish1 = null;

	ProducerMy1(Fish1 Fish1) {
		this.Fish1 = Fish1;
	}

	@Override
	public void run() {
		while (true)
			try {
				Fish1.cookFish();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}

class ConsumerMy1 implements Runnable {
	Fish1 Fish1 = null;

	ConsumerMy1(Fish1 Fish1) {
		this.Fish1 = Fish1;
	}

	@Override
	public void run() {
		while (true)
			try {
				Fish1.earFish();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}