/*
 * Approach
We need to find the first element that appears exactly once in the array.
✅ Optimized Approach: Using HashMap (Time Complexity: O(n))
Step 1: Traverse the array and store the frequency of each element in a HashMap.
Step 2: Traverse the array again and find the first element with a frequency of 1.
Step 3: Return that element.
 */

package Day1ArrayTopics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class First_Non_Repeating_Character {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		
		int n=sc.nextInt();
		int arr1[]= new int[n];
		
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		
		for(int el:arr1) {
			map.put(el, map.getOrDefault(el, 0)+1);
			
		}
		
		/*
	
		// traversing the map
		
		for(int el:arr1) {
			if(map.get(el)==1) {
				System.out.println("the first non repeating character is"+el);
				break;
			}
		}
		*/
		
		// or We can also traverse the array to check the frequency and then print the element which is having frequency more than 2.
		for(Map.Entry<Integer, Integer>el:map.entrySet()) {
			if(el.getValue()==1) {
				System.out.println("The first non repeating character is"+el.getKey());
				break;
			}
		}

	}

}
