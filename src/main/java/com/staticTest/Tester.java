/**
 * 
 */
package com.staticTest;

/**
 * @author pravendra.singh
 *
 */
class Parent {
	
	public static void check(){
		System.out.println("Parent");
	}

}

class Child extends Parent{
	public static void check(){
		System.out.println("Child");
	}
}

public class Tester{
	public static void main(String[] args) {
		Parent st = new Child();
		st.check();
	}
}