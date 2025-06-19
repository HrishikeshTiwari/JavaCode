package GFG_Array;

/*
 *Inversion count in an array is a measure of how far the array is from being sorted. Specifically:
An inversion is a pair of elements in the array such that the earlier element is greater than the later one.
Formal Definition:
For an array arr[], a pair (i, j) forms an inversion if:
i < j and
arr[i] > arr[j]
Example:
arr = {2, 4, 1, 3, 5}
The inversions are:
(2, 1)
(4, 1)
(4, 3)
So, inversion count = 3
 */

public class Inversion_count {

	public static void main(String[] args) {
		int arr[]= {2, 4, 1, 3, 5};
		int count=inversion(arr);
		System.out.println("the number of inversion count is"+count);
		

	}
	
	public static int inversion(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					System.out.print(arr[i]+""+arr[j]+" ");
					count++;
				}
			}
		}
		return count;
	}

}
