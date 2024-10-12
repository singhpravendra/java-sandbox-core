/**
 * 
 */
package com.string;

import java.util.regex.Pattern;

/**
 * @author pravendra.singh
 *
 */
public class GetTheSumOfNumber {
	
	
	public int getSum(String str){
		System.out.println("Inserted String is :"+str);
		int sum = 0;
		
		String strNo = str.replaceAll("\\D"," ");
		strNo = strNo.trim();
		System.out.println(strNo);
		String[] strArray = strNo.split(" ");
		for(String c: strArray){
			sum+=Integer.parseInt(c);
		}
		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new GetTheSumOfNumber().getSum("Hello 50km to 10 to 4");

	}

}
