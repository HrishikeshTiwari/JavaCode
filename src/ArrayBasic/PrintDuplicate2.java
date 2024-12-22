/*
 * The loop iterates over each element num in the array.
  seen.add(num):
  Tries to add the current number num to the seen HashSet.
  If the number is already in the set, add() returns false else it will return true.
  if (!seen.add(num)):
  This condition is true when the number is a duplicate.
  The duplicate is then added to the duplicates HashSet.
 */




package ArrayBasic;

import java.util.HashSet;

public class PrintDuplicate2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1, 1, 1};
        
        HashSet<Integer> seen = new HashSet<>();
        
        HashSet<Integer> duplicates = new HashSet<>();

        System.out.println("Duplicate elements in the array:");

        for (int num : arr) {
            if (!seen.add(num)) { // If the element is already in 'seen', it's a duplicate
                duplicates.add(num);
            }
        }

        for (int dup : duplicates) {
            System.out.println(dup);
        }
    }
}

// when the element is already present in the array it return false. ((!seen.add(num)) ! in the given method makes false to true
// because of that condition becomes true and enter to the next iteration where it add element to duplicate hashset.

