/**
 * 
 */
package com.string;
import java.lang.String;
import java.util.Arrays;

/**
 * @author pravendra.singh
 *
 */
public class StringTest {

	//How to get distinct characters and their count in a String
	private String distChar(String input){
		String buffer = "";
	    for (int i = 0; i < input.length(); i++) {
	        if (!buffer.contains(String.valueOf(input.charAt(i)))) {
	            buffer += input.charAt(i);
	        }
	       
	    }
		return "Distinct Characters are:"+buffer+" Count of Character is :"+buffer.length();
	}
	
	//check if a String is Palindrome
	private boolean strPalindrome(String input){
		boolean plndrm =true;
		for (int i = 0;i<input.length()/2;i++){
			if(input.charAt(i)!=input.charAt(input.length()-i-1)){
				plndrm = false;
				break;
			}
		}
		return plndrm;
	}
	//Remove all occurrences of a given character from input String
	private String strRemoveCh(String input){
		String buffer = "";
		buffer+=input.replaceAll(input.valueOf("c"),"");
		return buffer;
	}
	private String stringImmutable() {

			String s1 = "Java"; // "Java" String created in pool and reference assigned to s1
			String s2 = s1; //s2 is also having the same reference to "Java" in the pool
			System.out.println(s1 == s2); // proof that s1 and s2 have same reference
			s1 = "Python"; // s1 will create the new string pool for Python
			System.out.println(s1 == s2); 
			System.out.println(s2);
			return s2;
			
		}
	//Write a program to count number of words in a String
	private String distWords(String input){
		String buffer = "";
		//Not work proper
		//System.out.println(input.split(" ").length);
		String trimmedLine = input.trim();
		System.out.println("trimmedLine :"+trimmedLine);
		int count = trimmedLine.isEmpty() ? 0 : trimmedLine.split("\\s+").length;
		//System.out.println(count); 
		return ""+count;
	}
	//Program to check if two Strings are created with same characters
	private boolean anagram(String input1,String input2){
		//1.Sort the String after converting into Char Array 
		//2.Compare character by character
		boolean angrm = true;
		if(input1.length() !=input2.length()){
			return false;
		}
		char in1[]=input1.toCharArray();
		char in2[]=input2.toCharArray();
		Arrays.sort(in1);
		Arrays.sort(in2);
		System.out.println("in1 : "+in1.toString()+"\nin2 : "+in2.toString());
		for (int i=0;i<in1.length;i++){
			if(in1[i]!=in2[i]){
				angrm = false;
				break;
			}
		}
		return angrm;
	}
	//check if a String contain the another string
	private boolean strContain(String input1,String input2){
			boolean plndrm =false;
			if(input1.contains(input2) || input2.contains(input1)){
				plndrm = true;
			}
			return plndrm;
		}
	//Swap two Strings without using a third variable
	private String strSwap(String input1,String input2){
			input1 = input1.concat(input2);
			input2 = input1.substring(0,input1.length()-input2.length());
			input1 = input1.substring(input2.length());
			return input1+ " "+input2;
			
		}
	//Program to find out first non repeated character from input String
	private String strFirstNonrptyCh(String input1){
		String buffer = "";
		final int NO_OF_CHARS = 256; 
		int index = -1, i;
		char count[] = new char[NO_OF_CHARS];
		for (i = 0; i < input1.length();  i++) 
            count[input1.charAt(i)]++; 
		//System.out.println(count);
		for (i = 0; i < input1.length();  i++) 
        { 
            if (count[input1.charAt(i)] == 1) 
            { 
                index = i; 
                break; 
            }    
        }
		return ""+input1.charAt(index);
		
	}
	//Check if a String contains only digits
	private boolean strOnlyNumber(String input){
		if(input.matches("\\d+")){
			return true;
		}
		return false;
	}
	//Compare two Strings
	private String strCompare(String str1,String str2){
		return ""+str1.compareTo(str2);
	}
	//String GetBytes()
	private String strGetBytes(String str){
		String buffer = "";
		byte [] strByt = str.getBytes();
		for(int i=0;i<strByt.length;i++){
			buffer +=strByt[i]+",";
		}
		return buffer;
	}
	public static void main(String[] args) {
		String str = "adedshsaadfaa";
		String input1 = "adedshsaadfaa";
		String input2 = "addshsaadfaa";
		StringTest strTest = new StringTest();
		System.out.println(strTest.distChar(str));
		System.out.println(strTest.strPalindrome(str));
		System.out.println(strTest.strRemoveCh(str));
		System.out.println(strTest.stringImmutable());
		System.out.println(strTest.distWords("My name is Indus"));
		System.out.println(strTest.distWords(" This	is  not   properly formatted		line "));
		System.out.println(strTest.anagram(input1,input2));
		System.out.println(strTest.strContain(input1,input2));
		System.out.println(strTest.strSwap(input1,input2));
		System.out.println("strFirstNonrptyCh :"+strTest.strFirstNonrptyCh(input1.trim()));
		System.out.println(strTest.strOnlyNumber(str));
		System.out.println(strTest.strCompare(str,input1));
		System.out.println(String.valueOf(input1));
		System.out.println(strTest.strGetBytes(str));
	}
}
