/**
 * 
 */
package com.string;

import java.util.Scanner;

/**
 * @author pravendra.singh
 *
 */
public class StringTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringReverse strRev = new StringReverse();

		String delstr = "Enter the String";
		System.out.println(strRev.strReverse(delstr));
		System.out.println(strRev.strReverseWithStrbuffer(delstr));
		
		try
			{
			Scanner sc = new Scanner(System.in);
			//System.out.println("Enter the delimiter");
			//char delimiter = ' ';
			//System.out.println("Enter the"+ delimiter +"seperated String");
			System.out.println("Enter the String");
			delstr = sc.nextLine();
			//StringReverseDelimiter strDel = new StringReverseDelimiter();
			//strDel.strReversWDel(delstr, delimiter);
			//sc.close();
			//System.out.println();
			strRev.strReverseWithwhitespace(delstr);
			}catch(Exception e){
				e.printStackTrace();
		}
		
	}
}