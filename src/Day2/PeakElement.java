package Day2;

public class PeakElement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,1};
		peak(arr);

	}
	
	
	public static void peak(int arr[]) {
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i+1] && arr[i]>arr[i-1]) {
				System.out.println("the peak element is"+arr[i]);
				break;
			}
		}
		
	}

}

/*
 * A peak element is an element that is strictly greater than its neighbors. Given an array, find a peak element’s index in O(log n) time.
🔍 Example 1:
java
Copy
Edit
Input: nums = [1, 2, 3, 1]  
Output: 2  
Explanation: `nums[2] = 3` is a peak because `3 > 2` and `3 > 1`.
 */
