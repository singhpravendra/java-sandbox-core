/**
 * 
 */
package com.pattern;

import java.util.Scanner;

/**
 * @author pravendra.singh
 *
 */
public class Diamond {

	private static void pyramid(int rows) {
		for (int i = 1; i <= rows; i++) {
			int numberOfWhiteSpaces = rows - i;
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			for (int j = 0; j < numberOfWhiteSpaces; j++) {
				System.out.print(" ");
			}
			
			System.out.println("");
		}
	}

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter the rows to print:");
			int rows = scanner.nextInt();
			// System.out.println("Rows = "+rows);
			scanner.close();

			System.out.println("Printing Pattern 1\n");
			pyramid(rows);


		}
	}

	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		
		System.out.println("Enter the height of diamond");
		int size;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int count = size-1;
		for(int i=1;i<=size;i++){
			for(int j=1;j<=count;j++)
			System.out.println(" ");
			count--;
			for(int k=1;k<=2*i-1;k++)
			System.out.println("*");
			System.out.println();
		}
	}
	}*/
			
