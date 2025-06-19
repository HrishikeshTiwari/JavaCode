package Day2;

public class Searchin_Rotated_Sorted_Array {

	public static void main(String[] args) {


		/*
 * Problem statement
 * Problem 2: Search in a Rotated Sorted Array
You are given a sorted array that has been rotated at some unknown pivot. You need to find a target element in this array in O(log n) time.

🔍 Example 1:
java
Copy
Edit
Input: nums = [4,5,6,7,0,1,2], target = 0  
Output: 4  
(0 is found at index 4)
		 */
		
		
		/*Approach (Using Modified Binary Search)
		 The array is sorted but rotated, so we can’t apply normal binary search directly.
		 We modify binary search:
		 One half of the array will always be sorted.
		 We check which half is sorted and decide where to search next.
		 If the left half is sorted, check if the target is in this range.
		 If the right half is sorted, check if the target is in this range.
		
		*/
		
		int arr[]= {4,5,6,7,0,1,2};
		int target=0;
		System.out.println("The element is present at Location\n"+search(arr,target));

	}
	
	public static int search(int arr[], int target) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			
			// check if the left half is sorted
			if(arr[low]<=arr[mid]) {
				
				if(target>=arr[low] && target<arr[mid]) {
					high=mid-1;
				}
				else {
					high=mid+1;
				}
			}
			
			   // Otherwise, right half must be sorted
			if(target<arr[mid]&& target<=arr[high]) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
		
	}
	

}
