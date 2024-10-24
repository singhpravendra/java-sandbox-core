/**
 * 
 */
package com.string;


import org.apache.commons.lang3.StringUtils;

/**
 * @author pravendra.singh
 *
 */
public class StringReverseDelimiter {
	
	public String strReversWDel(String str,char del){
		String buffStr = "";
		System.out.println("Given String is : "+ str);
		buffStr = StringUtils.reverseDelimited(str, del);
		return buffStr;
	}

}
