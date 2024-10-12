package com.string;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

/**
 * @author pravendra.singh
 *
 */
public class WordReverse {
	
	
	static String reverse(String str){
		
		System.out.println("String is: "+str);
		Pattern pattern = Pattern.compile("\\s");
		System.out.println("Pattern : "+pattern);
		String [] strToken = pattern.split(str);
		for(int i=strToken.length-1;i>=0;i--){
			System.out.print(strToken[i]+" ");
		}
		return str; 
	}
	public String tokenString(String str){
		StringTokenizer strtkn = new StringTokenizer(str);
		while (strtkn.hasMoreTokens()){
			System.out.print(strtkn.nextToken());
		}
		//System.out.println(strtkn);
		return str;
	}
	
	 public static void main(String[] args) 
	    { 	
		 	WordReverse obj = new WordReverse();
	        String s1 = "Welcome to geeksforgeeks"; 
	        System.out.println("\nReverse  : "+reverse(s1)); 
	  
	        String s2 = "I love Java Programming"; 
	        System.out.println("\nReverse  : "+reverse(s2)); 
	        
	        System.out.println(obj.tokenString(s1));
	    } 

}
