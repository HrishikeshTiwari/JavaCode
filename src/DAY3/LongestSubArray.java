package DAY3;

import java.util.HashMap;

public class LongestSubArray {
    public static int findLongestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int sum = 0, maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // Compute prefix sum

            // If sum equals k, update maxLength
            if (sum == k) {
                maxLength = i + 1;
            }

            // If (sum - k) exists in HashMap, update maxLength
            if (prefixSumMap.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(sum - k));
            }

            // Store first occurrence of the prefix sum in HashMap
            prefixSumMap.putIfAbsent(sum, i);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, -2, 5, -3, 2, 6, -4, 2, 4};
        int k = 5;
        System.out.println(findLongestSubarray(nums, k));  // Output: 5
    }
}
