/**
 * 
 */
package com.nestedClass;

/**
 * @author pravendra.singh
 *
 */

class Outer{
	private int a=10;
	public void show(){
		System.out.println("Outer class");
	}
	/*static*/ class Inner{
		//static int a=1;
		public void show(){
			System.out.println("Nested Inner call");
		}
	}
}
public class NestedInner {
	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		//System.out.println(in.a.);
		in.show();
	}
}
