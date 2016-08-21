package itcastday14;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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
class PeoCusMain3 {
	public static void main(String[] args) {
		Fish3 Fish3 = new Fish3();

		ProducerMy3 producer = new ProducerMy3(Fish3);
		ConsumerMy3 Consumer = new ConsumerMy3(Fish3);

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

class Fish3 {
	int number = 0;
	boolean flag = false;
	// access the resource protected by this lock
	Lock l = new ReentrantLock();
	
	// tow monitores
	Condition cookCondition = l.newCondition();
	Condition eatCondition  = l.newCondition();
	
	// sychronised , make one and buy one
	void cookFish() throws InterruptedException { // t0
		l.lock();
		try {
			while (flag)
				cookCondition.wait(); // t1
			System.out.println("1");
			flag = true;
			eatCondition.signal();
		} finally {
			l.unlock();
		}
	}

	void earFish() throws InterruptedException {//t3 t4
		l.lock();
		try {
			while (!flag) //
				eatCondition.wait();
			System.out.println("2");
			flag = false;
			cookCondition.notify();
		} finally {
			l.unlock();
		}
	}
}

class ProducerMy3 implements Runnable {

	Fish3 Fish3 = null;

	ProducerMy3(Fish3 Fish3) {
		this.Fish3 = Fish3;
	}

	@Override
	public void run() {
		while (true)
			try {
				Fish3.cookFish();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}

class ConsumerMy3 implements Runnable {
	Fish3 Fish3 = null;

	ConsumerMy3(Fish3 Fish3) {
		this.Fish3 = Fish3;
	}

	@Override
	public void run() {
		while (true)
			try {
				Fish3.earFish();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}