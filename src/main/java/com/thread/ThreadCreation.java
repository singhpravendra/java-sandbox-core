/**
 * 
 */
package com.thread;

/**
 * @author pravendra.singh
 *
 */
//1. extends Thread class
public class ThreadCreation extends Thread{
	
	static int count = 0;
	public void run(){
		while(count<10)
			System.out.println(count++ +"Thread ID : "+Thread.currentThread().getId()+" Thread Name : "+Thread.currentThread().getName()+" Thread State : "+Thread.currentThread().getState());
	}

public static void main(String[] args) {
	System.out.println(count++ +"Thread ID : "+Thread.currentThread().getId()+" Thread Name : "+Thread.currentThread().getName()+" Thread State : "+Thread.currentThread().getState());
	ThreadCreation th = new ThreadCreation();
	th.start();
}

}
