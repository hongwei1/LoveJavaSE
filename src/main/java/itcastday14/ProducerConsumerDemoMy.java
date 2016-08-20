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
class PeoCusMain {
	public static void main(String[] args) {
		Fish fish = new Fish();

		ProducerMy producer = new ProducerMy(fish);
		ConsumerMy Consumer = new ConsumerMy(fish);

		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(producer);
		Thread t3 = new Thread(producer);
		Thread t4 = new Thread(Consumer);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

class Fish {
	int number = 0;
	boolean flag = false;

	// sychronised , make one and buy one
	synchronized void cookFish() throws InterruptedException { // t0
		while (flag)
			this.wait(); // t1 
		System.out.println("1");
		flag = true;
		this.notifyAll();
	}

	synchronized void earFish() throws InterruptedException {//t3 t4
		while (!flag) //
			this.wait();
		System.out.println("2");
		flag = false;
		this.notifyAll();
	}
}

class ProducerMy implements Runnable {

	Fish fish = null;

	ProducerMy(Fish fish) {
		this.fish = fish;
	}

	@Override
	public void run() {
		while (true)
			try {
				fish.cookFish();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}

class ConsumerMy implements Runnable {
	Fish fish = null;

	ConsumerMy(Fish fish) {
		this.fish = fish;
	}

	@Override
	public void run() {
		while (true)
			try {
				fish.earFish();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}