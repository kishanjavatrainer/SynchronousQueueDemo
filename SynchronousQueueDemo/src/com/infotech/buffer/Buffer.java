package com.infotech.buffer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

//Shared class used by threads
public class Buffer {
	// SynchronousQueue
	private BlockingQueue<Integer> blockingQueue = new SynchronousQueue<Integer>();

	public void get() {
		// retrieve from synchronousQueue
		try {
			System.out.println("Consumer received - " + blockingQueue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void put(int data) {
		try {
			// putting in synchronousQueue
			blockingQueue.put(data);
			System.out.println("Producer produced - " + data);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
