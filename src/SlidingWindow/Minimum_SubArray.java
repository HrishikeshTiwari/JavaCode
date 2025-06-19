package SlidingWindow;

import java.util.Arrays;

/*
 * 🧩 Description:
Given an array of integers arr and a number k, find the minimum sum of any contiguous subarray of size k.
Input:
arr = [4, 2, 1, 7, 8, 1, 2, 8, 10], k = 3

Output:
4 + 2 + 1 = 7
Explanation: The minimum sum is from the subarray [4, 2, 1].
 */

public class Minimum_SubArray {

	public static void main(String[] args) {
		
		int arr[]= {4, 2, 1, 7, 8, 1, 2, 8, 10};
		
		int k=3;
		 int min=findminimum(arr, k);
		 System.out.println("The minimum sum is\n"+min);
	
	}
	
	public static int findminimum(int arr[], int k) {
		int minsum=Integer.MAX_VALUE;
		int windowsum=0;
		 int windowstart=0;
		int end=0;
		int start=0;
		
		for(end=0;end<arr.length;end++) {
			windowsum+=arr[end];
			
		
		if(end>=k-1) {
			if(windowsum<minsum) {
				minsum=windowsum;
				windowstart= start;
			}
			
			 windowsum-=arr[start];
			start++;
		}
		
		
		
		
	}
		int minsubarray[]= Arrays.copyOfRange(arr, windowstart, windowstart+k);
		System.out.println("the minimum subarray is "+Arrays.toString(minsubarray));
		return minsum;

}
}
