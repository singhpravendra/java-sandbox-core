/**
 * 
 */
package com.commonproblem;

/**
 * @author pravendra.singh
 *
 */
public class Problems {
	
	public int fibonacci(int num){
		if (num == 1)
			return 1;
		if (num == 2)
			return 1;
		return fibonacci(num-1)+fibonacci(num-2);
	}
	
	public void FibSeries(int num){
		for(int i=1;i<=num;i++){
			System.out.print(fibonacci(i));
			System.out.print(" ");
		}
	}

}
