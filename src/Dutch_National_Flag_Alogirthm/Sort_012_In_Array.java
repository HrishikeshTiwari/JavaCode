package Dutch_National_Flag_Alogirthm;

/*
 * 🎯 Problem:
Given an array with elements containing only 0, 1, and 2, sort the array in ascending order in-place, meaning:
All 0s come first,
followed by all 1s,
then all 2s.
🧠 Intuition:
Use three pointers:
low → where the next 0 should go
mid → current index being checked
high → where the next 2 should go




 */

public class Sort_012_In_Array {

	public static void main(String[] args) {

		int[] arr = {2, 0, 2, 1, 1, 0};
		
		sort(arr);
		
		System.out.println("printing the element of the array after sorting");
		
		for(int element:arr) {
			System.out.print(element+" ");
		}

	}
	
	public static void sort(int arr[]) {
		int low=0, mid=0, high=arr.length-1;
		
		while(mid<=high) {
			
			
			if(arr[mid]==0) {
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
			}
			
			else if(arr[mid]==1) {
				mid++;
			}
			else {
				int temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
			}
			
		}
	}

}
