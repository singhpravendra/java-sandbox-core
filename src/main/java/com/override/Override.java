/**
 * 
 */
package com.override;

/**
 * @author pravendra.singh
 *
 */
class Parent{
	public static void show(){
		System.out.println("Parent");
	}
}
class Child extends Parent{
	public static void show(){
		System.out.println("Child");
	}
	public void display(){
		System.out.println("Child display");
	}
}

public class Override{
	public static void main(String[] args) {
		/*Parent pr = new Parent();
		Child chl = new Child();
		*///Child ch = (Child) pr;
		Parent chil =  new Child();
		chil.show();
		Child.show();
	}
}