/**
 * 
 */
package com.commonproblem;

import java.util.Scanner;

/**
 * @author pravendra.singh
 *
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//fibonacci example
		System.out.println("Enter the number of words you want to get the fibonacci sum");
		Problems prblm = new Problems();
		int n;
		try(Scanner sc = new Scanner(System.in)){
			n = sc.nextInt();
			
		prblm.FibSeries(n);
		}
		
	}

}
