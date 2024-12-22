/*
 * Removing the Duplicate element from the array using set.
Use a hash set or dictionary to store elements already processed
Initialize index of result array as 0.
Traverse through the input array. If an element is not in the hash set, put it at the result index and insert into the set.
Return the size of the array with unique elements in the main function
and with the help of new size of the array run a loop and print the element of the array.

This method is applicable when the array is not sorted.
 */

package ArrayBasic;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElemenet {

	public static void main(String[] args) {
		int arr[]= {1,2,1,3,4,3,5,6,7,8,5,8,8,8,5};
		//int arr[]= {9};
		
		int length=arr.length;
		int newsize=remove(arr,length);
		System.out.println("Element of the array after removing duplicate");
		for(int i=0;i<newsize;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	
	public static int remove(int arr[], int n) {
		
		
		// corner case
		
		if(n==0 || n==1) {
			return n;
		}
		
		// To track seen elements
		Set<Integer> set= new LinkedHashSet<Integer>();
		
		  // To maintain the new size of the array
		int resultindex=0;
		
		
		for(int i=0;i<arr.length;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
				arr[resultindex++]=arr[i];
			}
		}
		
		  // Return the size of the array with unique elements
		return resultindex;
	}

}
