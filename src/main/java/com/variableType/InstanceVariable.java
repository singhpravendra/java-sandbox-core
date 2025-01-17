/**
 * 
 */
package com.variableType;

/**
 * @author pravendra.singh
 * 
 */

/*
 * instance variables have their own separate copy of instance variable.
 */

public class InstanceVariable {

	String myInstanceVar = "instance variable";

	public static void main(String args[]) {
		InstanceVariable obj = new InstanceVariable();
		InstanceVariable obj2 = new InstanceVariable();
		InstanceVariable obj3 = new InstanceVariable();

		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);

		obj2.myInstanceVar = "Changed Text";

		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);
	}
}

/*
 * Output :
 * 	instance variable
	instance variable
	instance variable
	
	instance variable
	Changed Text
	instance variable
 */