package SlidingWindow;

/*
 * 🧩 Description:
Given an array nums consisting of n integers, and an integer k, find the maximum average of any contiguous subarray of size k.
 */

public class MaximumAverage_SubArray {

	public static void main(String[] args) {
		
		int arr[]= {1, 12, -5, -6, 50, 3};
		int k = 4;
		
		double result=maxsumfunc(arr,k);
		System.out.println("Maximum subarray is"+result);
	}
	
	public static double maxsumfunc(int arr[], int k) {
		int start=0;
		int sum=0;
		double maxsum=0;
		int i;
		
		for(i=0;i<arr.length;i++) {
			sum+=arr[i];
		
		
		if(i>=k-1) {
			 double currentAvg = (double) sum / k;
			if(currentAvg>maxsum) {
				maxsum=currentAvg;
			}
			
			sum-=arr[start];
			start++;
			
		}
		
		}
		
		return maxsum;
		
		
	}

}
