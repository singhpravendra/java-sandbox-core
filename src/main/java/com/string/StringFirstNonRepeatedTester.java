/**
 * 
 */
package com.string;

import java.util.Scanner;

/**
 * @author pravendra.singh
 *
 */
public class StringFirstNonRepeatedTester {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			StringFirstNonRepeated strObj = new StringFirstNonRepeated();
			System.out.println("Enter the String :");
			String str = sc.nextLine();
			System.out.println(strObj.StrFstNonRptChar(str));
			
			
			System.out.println(strObj.StrFstNonRptWord(str));
		}
	}
}
