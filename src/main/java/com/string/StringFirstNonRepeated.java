/**
 * 
 */
package com.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author pravendra.singh
 *
 */
public class StringFirstNonRepeated {

	public char StrFstNonRptChar (String str){
		char ch = 0;
		System.out.println("Exampled String is :"+str);
		String trmStr = str.trim();
		System.out.println(trmStr);
		for(char chArray : trmStr.toCharArray()){
			if(str.indexOf(chArray)==str.lastIndexOf(chArray)){
				System.out.println("First Non repeated char is :"+chArray);
				break;
				//System.out.println("Afetr break");
			}
		}
		return ch;
	}

	public String StrFstNonRptWord (String str){
		Pattern ptn = Pattern.compile("\\s+");
		String [] strArray = ptn.split(str);
		Map<String, String> hMap = new LinkedHashMap<String, String>();
	      for(int i = 0; i < strArray.length ; i++ ) {
	         if(!hMap.containsKey(strArray[i])) {
	            hMap.put(strArray[i],"Unique");
	         }         
	      }
	      System.out.println(hMap);		
		return str;
	}
}
