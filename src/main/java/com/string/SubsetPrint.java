/**
 * 
 */
package com.string;

/**
 * @author pravendra.singh
 *
 */
/*public class SunsetPrint {

	static void subset(String str){
		int size = str.length();
		char [] charray = str.toCharArray();
		for (int i = 1; i< (1<<size); i++){
			for (int j = 0; j < size; j++) 
				if ((i & (1 << j)) > 0)
					System.out.print(charray[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String str = "abc";
		subset(str);

	}

}*/

//A Java program to print all subsets of a set 
import java.io.IOException; 

public class SubsetPrint 
{ 
	// Print all subsets of given set[] 
	static void printSubsets(char set[]) 
	{ 
		int n = set.length; 

		// Run a loop for printing all 2^n 
		// subsets one by obe 
		for (int i = 0; i < (1<<n); i++) 
		{ 
			System.out.print("{ "); 

			// Print current subset 
			for (int j = 0; j < n; j++) 

				// (1<<j) is a number with jth bit 1 
				// so when we 'and' them with the 
				// subset number we get which numbers 
				// are present in the subset and which 
				// are not 
				if ((i & (1 << j)) > 0) 
					System.out.print(set[j] + " "); 

			System.out.println("}"); 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		char set[] = {'a', 'b', 'c'}; 
		printSubsets(set); 
	} 
} 

