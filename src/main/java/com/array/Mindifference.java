/**
 * 
 */
package com.array;

import java.util.Arrays;

/**
 * @author pravendra.singh
 *
 */
public class Mindifference {

	static void mindiffer(int [] arr){
		int size = arr.length;
		Arrays.sort(arr);
		int min_diff = arr[1]-arr[0];
		for(int i=2;i<size;i++){
			if(arr[i]-arr[i-1]<min_diff){
				min_diff=arr[i]-arr[i-1];
			}
		}
		System.out.println("min_diff :"+min_diff);
	}
	static void maxdiffer(int [] arr){
		int size = arr.length;
		Arrays.sort(arr);
		int maxdiffer = arr[size-1]-arr[0];
		System.out.println("Max difference : "+maxdiffer);
	}
	
	public static void main(String[] args) {
		int [] arr = {1,5,2,4,1,6,8,10};
		maxdiffer(arr);
		mindiffer(arr);

	}

}
