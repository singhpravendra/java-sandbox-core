/**
 * 
 */
package com.dessault;

/**
 * @author pravendra.singh
 *
 */
public class ExcepTest{

	public int test()  throws Exception{
		int i;
	try{
		String s = "XYZ";
		i = Integer.parseInt(s);
		System.out.println(i+" ");
		return i;
	}catch(NumberFormatException e){
		i = 10;
		System.out.println(i+" ");
		throw new Exception();
	}
	finally{
		i=20;
		System.out.println(i+" ");
		return 3;
	}
	}
	public static void main(String[] args) throws Exception {
		ExcepTest tst = new ExcepTest();
		tst.test();
	}

}
