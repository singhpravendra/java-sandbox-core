/**
 * 
 */
package com.exception;

/**
 * @author pravendra.singh
 *
 */
public class CustomExceptions extends Exception {

	private static final long serialVersionUID = 4664456874499611218L;
	
	private String errorCode="Unknown_Exception";
	
	public CustomExceptions(String message, String errorCode){
		super(message);
		this.errorCode=errorCode;
	}
	
	public String getErrorCode(){
		return this.errorCode;
	}
	

}