/**
 * 
 */
package com.dessault;

/**
 * @author pravendra.singh
 *
 */

interface I1{
	int i=10;
	int j=20;
	void display();
}
interface I2 extends I1{
	int i=20;
}
interface I3 extends I1,I2{
	int i =30;
}

class ConcreteClass implements I3{
	public static final int j=10;
	public void display(){
		System.out.println(" "+i+" "+j);
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		I2 objCon = new ConcreteClass();
		objCon.display();
		System.out.println(" "+objCon.i+" "+objCon.j);

	}

}
