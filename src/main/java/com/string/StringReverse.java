/**
 * 
 */
package com.string;

/**
 * @author pravendra.singh
 *
 */
public class StringReverse {

	// Program to reverse a String
		public String strReverse(String input){
			String buffer = "";
			for(int i=input.length()-1;i>=0;i--){
				buffer+=input.charAt(i);
			}
			return "Reverse of given input string is :"+buffer;
		}
		
		// Program to reverse a String
		public String strReverseWithStrbuffer(String input){
			System.out.println("Input String is : "+input);
			StringBuffer strbuffer = new StringBuffer(input);
			String buffer = "";
			buffer = strbuffer.reverse().toString();
			return "Reverse of given input string is :"+buffer;
		}
		
		public void strReverseWithwhitespace(String str){
			System.out.println("Input String is : "+str);
			
			char[] chArr = str.toCharArray();
			
			for(int i=str.length();i>0;i--)
				System.out.print(chArr[i-1]);	
		}
}
