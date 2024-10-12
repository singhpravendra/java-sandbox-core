/**
 * 
 */
package com.string;

import java.util.HashSet;

/**
 * @author pravendra.singh
 *
 */
public class StringFirstRepeated {

	public char FirstRepeatedChar(String str){
		HashSet hs = new HashSet<>();
		
		for (int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(hs.contains(ch))
				return ch;
			else
				hs.add(ch);
		}
		
		return 0;
	}
}
