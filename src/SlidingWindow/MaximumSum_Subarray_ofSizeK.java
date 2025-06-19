package SlidingWindow;

/*
 * Description: Given an array of integers and an integer k, find the maximum sum of a subarray of size k.

Example: Input: [2, 1, 5, 1, 3, 2], k=3
Output: 9 (subarray [5, 1, 3])
 */

/*public class MaximumSum_Subarray_ofSizeK {

	public static void main(String[] args) {
		
		int arr[]= {2, 1, 5, 1, 3, 2};
		
		//System.out.println(arr.length);
		
		int k=3;
		int maxsum=0;
		
		for(int i=0;i<arr.length-k;i++) {
			int sum=0;
			for(int j=i;j<i+k;j++) {
				sum+=arr[j];
			}
			
			maxsum=Math.max(sum, maxsum);
			
		}
		
		System.out.println("the maximum sum of a subarray of size k "+maxsum);
		
		

	}

}
*/






import java.util.Arrays;

public class MaximumSum_Subarray_ofSizeK {
    public static int[] findMaxSumSubarray(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;
        int start = 0, maxStart = 0;

        for (int end = 0; end < arr.length; end++) {
            windowSum += arr[end]; // Add the next element

            // When the window reaches size K
            if (end >= k - 1) {
                if (windowSum > maxSum) {
                    maxSum = windowSum;
                    maxStart = start; // Store the start index of max subarray
                }
                windowSum -= arr[start]; // Remove the element going out of the window
                start++; // Move the window forward
            }
        }

        // Extract the subarray with the max sum
        int[] maxSubarray = Arrays.copyOfRange(arr, maxStart, maxStart + k);
        
        //Arrays.copyOfRange(arr, maxStart, maxStart + k):- returns a new subarray (subset array) copied from the original arr. 
        //It does not modify the original array — it creates a new array with elements starting from index maxStart to maxStart + k.
        
        System.out.println("Maximum Sum: " + maxSum);
        return maxSubarray;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int[] result = findMaxSumSubarray(arr, k);
        System.out.println("Subarray with Maximum Sum: " + Arrays.toString(result));
    }
}

