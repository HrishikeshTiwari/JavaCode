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
	    if (n == 0 || n == 1) {
	        return n;
	    }

	    Set<Integer> set = new LinkedHashSet<>();  // LinkedHashSet preserves order
	    int resultindex = 0;

	    for (int i = 0; i < arr.length; i++) {
	        // Always add to the set
	        if (set.add(arr[i])) {           // when the duplicate element will be found it will not add it will return false.
	            arr[resultindex++] = arr[i];
	        }
	    }

	    return resultindex;
	}
}

// this is used when you want to return the array element in the function.

