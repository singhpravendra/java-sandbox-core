/**
 * 
 */
package com.pattern;

/**
 * @author pravendra.singh
 *
 */
public class PascalTriangle {
	static void pascal(int n){
		int whitespace = 0;
		int[][] arr = new int[n][n];
		for(int line = 0; line<n; line++){
			whitespace = n-line-1;
			for(int j=0;j<whitespace;j++){
				System.out.print(" ");
			}
			for(int i = 0 ;i<=line; i++){
				if (line==i || i==0)
					arr[line][i]=1;
				else
					arr[line][i] = arr[line-1][i-1] + arr[line-1][i]; 
				
				
				if(i!=0)
					System.out.print("*"+arr[line][i]);
				else
					System.out.print(arr[line][i]);
			}
			System.out.println("");
		}
		
	}
	
	public static void main(String[] args) {
		pascal(5);

	}

}
