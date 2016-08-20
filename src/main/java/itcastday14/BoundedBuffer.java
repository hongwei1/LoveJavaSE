package itcastday14;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBuffer {
	// new lock object
	final Lock lock = new ReentrantLock();
	// two different conditions: put and take
	final Condition notFull = lock.newCondition();
	final Condition notEmpty = lock.newCondition();

	final Object[] items = new Object[100];//生产100只鸭子
	int putptr, takeptr, count; //记录鸭子信息：生产，取出，个数

	public void put(Object x) throws InterruptedException {
		lock.lock();
		try {
			while (count == items.length) //100
				notFull.await();
			items[putptr] = x;
			if (++putptr == items.length)//from 0 to 100 loop 
				putptr = 0;
			++count;
			notEmpty.signal();
		} finally {
			lock.unlock();
		}
	}

	public Object take() throws InterruptedException {
		lock.lock();
		try {
			while (count == 0)
				notEmpty.await();
			Object x = items[takeptr];
			if (++takeptr == items.length)//from 0 to 100 loop 
				takeptr = 0;
			--count;
			notFull.signal();
			return x;
		} finally {
			lock.unlock();
		}
	}
}
