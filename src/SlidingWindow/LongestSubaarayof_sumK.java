package SlidingWindow;
/*
 * 🔍 Problem Statement:
Given an array of positive integers and an integer k, find the length of the longest subarray whose sum is equal to k.
✅ Constraints for Sliding Window Approach:
This only works when all elements are positive.

If the array contains negative numbers, use a HashMap-based approach instead.

🧠 Explanation:
Use two pointers left and right to maintain a window.

Move the right pointer to expand the window and add to the sum.

If the sum exceeds k, move the left pointer to reduce the window size.

Whenever sum == k, update the maximum length.
 */


public class LongestSubaarayof_sumK {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 1, 1, 1, 3};
        int k = 5;
        int length = findMaxSumSubarray(arr, k);
        System.out.println("\nLength of longest subarray with sum " + k + ": " + length);
    }

    public static int findMaxSumSubarray(int arr[], int k) {
        int left = 0, right = 0;
        int sum = 0;
        int maxLength = 0;
        int start = -1, end = -1;

        while (right < arr.length) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    start = left;
                    end = right;
                }
            }

            right++;
        }

        if (maxLength > 0) {
            System.out.print("Longest subarray with sum " + k + " is: ");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("No subarray found with sum " + k);
        }

        return maxLength;
    }
}
