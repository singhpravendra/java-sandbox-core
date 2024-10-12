/**
 * 
 */
package com.enumtest;

/**
 * @author pravendra.singh
 *
 */
public class EnumTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EnumTest enmTest = new EnumTest();
		System.out.println(enmTest.size.MEDIUM);
		String village=null;
		String city=null;
		String vtc=city!=null?city+"":village+"";
		System.out.println("null check  "+vtc+"");
	}

}
