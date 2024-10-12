/**
 * 
 */
package com.array;

/**
 * @author pravendra.singh
 *
 */
public class Subarray {

	
	public static void subArray(int [] arr){
		
		int start=0,end=0,max_next = 0,max_till=0,s=0;
		
		for (int i=0; i<arr.length;i++){
			max_next=max_next+arr[i];
			
		if(max_next<0){
				max_next=0;
				s=i+1;
			}
		if(max_till<max_next){
			max_till=max_next;
			start = s;
			end = i;
			
		}
		}
		System.out.println("Sum :"+max_till);
		for(int k = start;k<=end;k++){
			System.out.print(arr[k]+" ");
		}
	
	}
	public static void main(String[] args) {
		int a[] = { -2, 4, -3, 4, -1, -2, 1, 5, -3 ,10,-2}; 
        subArray(a);

	}

}
