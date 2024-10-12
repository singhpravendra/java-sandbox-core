/**
 * 
 */
package com.primtiveDataType;

/**
 * @author pravendra.singh
 *
 */
public class ShortDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short st ;
		st = 32767; //less than 32767 not type-cast if value is more than 32767 explicitly cast to short 
		st = (short) 32768; //-32,768 to 32767.  -- 2 byte 
		System.out.println(st);
	}

}
