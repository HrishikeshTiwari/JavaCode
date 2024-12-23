/*
 * shifting the array using Sorting Method.
 * 1. first sort the array and then all 0 will come in the begining of the array than
 * 2. print the element in descending order. the element 0 will be printed at the last of the aaray.
 */



package ArrayBasic;

import java.util.Arrays;

public class ShiftingZeroAtEnd2 {

	public static void main(String[] args) {

       int arr[]= {1,2,0,3,0,5,0,8,9};
       Arrays.sort(arr);
        shifting(arr);

	}
	
	public static void shifting(int arr[]) {
		int n=arr.length;
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
