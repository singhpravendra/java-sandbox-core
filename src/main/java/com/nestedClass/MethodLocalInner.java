/**
 * 
 */
package com.nestedClass;

/**
 * @author pravendra.singh
 *
 */

class MethodOuter {
void outerMethod() {
	int x = 98;
	System.out.println("inside outerMethod");
	class Inner {
		int x = 5;
		void innerMethod() {
			System.out.println("x= "+x);
		}
	}
	Inner y = new Inner();
	y.innerMethod();
}
}
public class MethodLocalInner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MethodOuter x=new MethodOuter();
	      x.outerMethod();
	   }

}
