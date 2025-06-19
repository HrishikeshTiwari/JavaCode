package Day2;
import java.util.HashSet;

public class LongestConsecutiveSequence {
	
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: empty array

        HashSet<Integer> set = new HashSet<>();
        
        // Step 1: Insert all elements into the HashSet
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        // Step 2: Find the start of each sequence
        for (int num : set) {
            if (!set.contains(num - 1)) { // Only start a sequence if num - 1 is not present
                int currentNum = num;
                int currentLength = 1;

                // Expand the sequence to the right
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                // Update the longest sequence found
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(nums));
    }
}

/*
 *  Step-by-Step Algorithm
Insert all elements into a HashSet

This helps us quickly check if a number exists in O(1) time.
Iterate through the array and find sequence starting points

A number is a starting point of a sequence if num - 1 is NOT in the set.
If num - 1 exists, that means num is part of a longer sequence that has already been counted.
Expand the sequence forward

If num is a starting point, use a loop to keep checking num + 1, num + 2, ... until the sequence breaks.
Count the length of this sequence.
Track the longest sequence found

Keep updating maxLength if a longer sequence is found.
 */
