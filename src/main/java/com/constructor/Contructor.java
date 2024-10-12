/**
 * 
 */
package com.constructor;

/**
 * @author pravendra.singh
 *
 */
public class Contructor {
	int x;
	Contructor(){
		Contructor obj = new Contructor();
		obj.x=10;
		System.out.println(obj.x);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Contructor obj = new Contructor();
		System.out.println(obj.x);

	}

}
