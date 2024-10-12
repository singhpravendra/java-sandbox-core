/**
 * 
 */
package com.variableType;

/**
 * @author pravendra.singh
 *
 */
/**
 * Static variables are also known as class variable because they are associated with the 
 * class and common for all the instances of class. For example, If I create three objects 
 * of a class and access this static variable, it would be common for all, the changes made
 * to the variable using one of the object would reflect when you access it through other objects.
 * */
public class StaticClassVariable {

	public static String myClassVar="class or static variable";
	
	   public static void main(String args[]){
		   StaticClassVariable obj = new StaticClassVariable();
		   StaticClassVariable obj2 = new StaticClassVariable();
		   StaticClassVariable obj3 = new StaticClassVariable();
	      
	      //All three will display "class or static variable"
	      System.out.println(obj.myClassVar);
	      System.out.println(obj2.myClassVar);
	      System.out.println(obj3.myClassVar);

	      //changing the value of static variable using obj2
	      obj2.myClassVar = "Changed Text";

	      //All three will display "Changed Text"
	      System.out.println(obj.myClassVar);
	      System.out.println(obj2.myClassVar);
	      System.out.println(obj3.myClassVar);
	   }

}
/**
 * Output  :
 * class or static variable
 * class or static variable
 * class or static variable
 * 
 * Changed Text
 * Changed Text
 * Changed Text
 * */
