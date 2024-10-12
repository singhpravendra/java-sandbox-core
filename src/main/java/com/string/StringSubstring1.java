/**
 * 
 */
package com.string;

/**
 * @author pravendra.singh
 *
 */
public class StringSubstring1 {

	public static void substring(String str){
		int size = str.length();
		char[] charray = str.toCharArray();
		
		for(int len = 1 ;len<=size; len++){
			for(int i=0;i<=size-len;i++){
				int j=i+len-1;
				for(int k=i;k<=j;k++){
					System.out.print(charray[k]);
				}
				System.out.println();
			}
		}
		
	}
	
	public static void main(String[] args) {
		String str = "abc";
		substring(str);

	}

}
