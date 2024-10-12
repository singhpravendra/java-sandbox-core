/**
 * 
 */
package com.primtiveDataType;

/**
 * @author pravendra.singh
 *
 */
public class ByteDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bt ;
		bt = 126; //less than 127 not type-cast if value is more than 127 explicitly cast to byte 
		bt = (byte) 130; //-128 to 127  -- 1 byte or 8 bits 
		System.out.println(bt);
	
	}

}
