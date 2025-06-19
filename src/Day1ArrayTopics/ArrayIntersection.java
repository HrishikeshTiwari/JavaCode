/*
 * Approach 1: Using HashSet (Efficient)
🔹 Steps
Store elements of arr1 in a HashSet.
Traverse arr2, and check if each element exists in the set.
Add common elements to the result set (to avoid duplicates).
 */


package Day1ArrayTopics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

	public static void main(String[] args) {

		int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 3, 5};
        int result[]=findIntersection(arr1,arr2);
        System.out.println("Intersection: " + Arrays.toString(result));

	}
	
	
	public static int[] findIntersection(int arr1[], int arr2[]) {
		HashSet<Integer> hs= new HashSet<Integer>();
		HashSet<Integer> result= new HashSet<Integer>();
		
		for(int n1:arr1) {
			hs.add(n1);
		}
		
		for(int n2:arr2) {
			if(hs.contains(n2)) {
				result.add(n2);
			}
		}
		
		return result.stream().mapToInt(Integer::intValue).toArray();
	}

}
//Most efficient approach: HashSet (O(n))
