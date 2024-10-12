/**
 * 
 */
package com.variableType;

/**
 * @author pravendra.singh
 *
 */
/**
 * These variables are declared inside method of the class. Their scope is limited to the 
 * method which means that You can�t change their values and access them outside of the method.
 */
public class LocalVariable {
	 // instance variable
	   public String myVar="instance variable";
	    
	   public void myMethod(){
	    	// local variable
	    	String myVar = "Inside Method";
	    	System.out.println(myVar);
	   }
	   public static void main(String args[]){
	      // Creating object
		   LocalVariable obj = new LocalVariable();
	    	
	      /* We are calling the method, that changes the 
	       * value of myVar. We are displaying myVar again after 
	       * the method call, to demonstrate that the local 
	       * variable scope is limited to the method itself.
	       */
	      System.out.println("Calling Method");
	      obj.myMethod();
	      System.out.println(obj.myVar);
	   }

}

/*
 * Output :
 	Calling Method
	Inside Method
	instance variable
*/
