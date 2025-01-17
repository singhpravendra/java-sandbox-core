/**
 * 
 */
package com.thread;

/**
 * @author pravendra.singh
 * 
 */
public class InterruptExample implements Runnable {
	public void run() {
		try {
			Thread.sleep(1001);
			System.out.println("["+Thread.currentThread().getName()+"] Run sleep");
		} catch (InterruptedException e) {
			System.out.println("["+Thread.currentThread().getName()+"] Interrupted by exception!");
		}
		while(!Thread.interrupted()) {
			System.out.println("["+Thread.currentThread().getName()+"] Thread is in Interrupted stage");
		}
		System.out.println("["+Thread.currentThread().getName()+"] Interrupted for the second time.");
	}

	public static void main(String[] args) throws InterruptedException {
		Thread myThread = new Thread(new InterruptExample(), "myThread");
		myThread.start();
		System.out.println("["+Thread.currentThread().getName()+"] Sleeping in main thread for 5s...");
		Thread.sleep(1000);
		System.out.println("["+Thread.currentThread().getName()+"] Interrupting myThread");
		myThread.interrupt();
		System.out.println("["+Thread.currentThread().getName()+"] Sleeping in main thread for 5s...");
		Thread.sleep(1000);
		System.out.println("["+Thread.currentThread().getName()+"] Interrupting myThread");
		myThread.interrupt();
	}
}
