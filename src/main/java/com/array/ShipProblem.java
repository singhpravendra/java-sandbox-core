package com.array;

public class ShipProblem {

	public static void main(String[] args) {
		//3,6,2,7,5
		int arr[] =  {6,5,8,4,7,10,9};
		int[] brr= new int[10];
		brr[0]=arr[0];
		//System.out.println(brr[0]);
		for (int i=arr.length-1;i>0;i--) {
				if( arr[i]<arr[i-1]) {
					brr[i]=arr[i];
				}
		}
		for (int i=0; i<arr.length;i++) {
		System.out.println(brr[i]);
		}
	}

}
