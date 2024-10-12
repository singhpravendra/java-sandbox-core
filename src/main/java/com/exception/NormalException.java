/**
 * 
 */
package com.exception;

import java.io.FileNotFoundException;

/**
 * @author pravendra.singh
 *
 */
public class NormalException {

	/**
	 * @param args
	 * @throws CustomExceptions 
	 */
	public static void main(String[] args) throws CustomExceptions {
		int a=0;
		int b=20;
		int d[];
		int x;
		try{

			x=	b/a;
		}catch(ArithmeticException e){
			throw new CustomExceptions("Custom","BAD_FILE_TYPE");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Inside catch2");
		}
		finally{
			System.out.println("Inside finally");
		}
		System.out.println("Outside finally");
	}

}
