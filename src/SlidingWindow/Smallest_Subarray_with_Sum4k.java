package SlidingWindow;
/*
 * 🧩 Question: Smallest Subarray with Sum ≥ K
📝 Description:
Given an array of positive integers arr[] and a number K, find the length of the smallest contiguous subarray whose sum is greater than or equal to K.
If no such subarray exists, return 0.
✅ Example:
Input:
arr = [2, 3, 1, 2, 4, 3],  K = 7
Output:
2
Explanation:
The subarray [4, 3] has sum 7 and is the smallest possible.


✅ Approach: Sliding Window (Variable Size)
Use two pointers: start and end.

Expand the window with end until the sum ≥ K.

Once condition is satisfied, try to shrink the window from start while maintaining the condition.

Keep track of the minimum window size found.
 */


public class Smallest_Subarray_with_Sum4k {

    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 2, 4, 3};
        int k = 7;
        int result = findSmallestSubarray(arr, k);
        System.out.println("Smallest subarray length: " + result);
    }

    public static int findSmallestSubarray(int arr[], int k) {
        int left = 0;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            windowSum += arr[right];

            while (windowSum >= k) {
                minLength = Math.min(minLength, right - left + 1);
                windowSum -= arr[left];
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength; // If no such subarray exists, return 0. 
        
        //return minLength;
    }
}

