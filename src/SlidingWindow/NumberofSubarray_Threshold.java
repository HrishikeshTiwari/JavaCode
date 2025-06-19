package SlidingWindow;

/*
 * 🧩 Problem: Count the number of subarrays of size k with average greater than or equal to a threshold
📋 Description:
You are given an integer array arr, an integer k, and an integer threshold.

Return the number of contiguous subarrays of size k whose average is greater than or equal to threshold.
 */

public class NumberofSubarray_Threshold {

	public static void main(String[] args) {
		int arr[]= {4, 5, 6, 3, 5, 7, 8};
		int k=3;
		int threshold = 5;
		
		int count=findsubarray(arr,k,threshold);
		System.out.println("The number of subaarya is"+count);

	}
	
	public static int findsubarray(int arr[], int k, int threshold) {
		int i;
		int count=0;
		int sum=0;
		int start=0;
		int maxstart=0;
		
		for(i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		 if(i>=k-1) {
			
			if((sum / k) >= threshold) {
				count++;
			}
			 // Slide the window: remove the element at the start of window
			sum=sum-arr[start];
			start++; 
		}
		
	}
		return count;

}
}
