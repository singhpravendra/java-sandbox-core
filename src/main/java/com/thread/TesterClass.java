/**
 * 
 */
package com.thread;

/**
 * @author pravendra.singh
 *
 */
public class TesterClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread th1 = new Thread(new ThreadRnbl(), "th1");
		Thread th2 = new Thread(new ThreadRnbl(), "th2");
		th2.start();
		th1.start();
		th1.run();
		th2.run();
		
		
		/*ThreadRnbl th = new ThreadRnbl();
		th.run();*/

	}

}
