/**
 * 
 */
package com.finals;

/**
 * @author pravendra.singh
 *
 */
public class FinalCheck {

	//If variables status (value) are not assigned than that variables are called blank *** variables  
	final int i,j,k;  //must be initialized at declaration level,through constructor or initialization block
	static final int l; // must initialize with static block
	//initialization block
	{
		i=10;
	}
	
	//construction initialization
	public FinalCheck() {
		j=10;
		k=10;
	}
	
	//static block initialization
	static{
		l=10;
	}
	public static void main(String[] args) {
		
		final double d;
		//public int y=10;

	}

}
