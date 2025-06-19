package Dutch_National_Flag_Alogirthm;
/*
 * Question: Sort an Array of -1, 0, and 1
Problem Statement:
Given an array consisting only of the integers -1, 0, and 1, sort the array in-place so that:
All -1s come first, followed by 0s, then 1s.
 */

public class Dutch2 {

	public static void main(String[] args) {
		int arr[] ={0, 1, -1, 0, 1, -1, 0};
		 rotate(arr);
		 System.out.println("printing the element of the array after sorting");
			
			for(int element:arr) {
				System.out.print(element+" ");
			}
	
	}
	
	public static void rotate(int arr[]) {
		
		int left=0,mid=0,right=arr.length-1;
		
		while(mid<=right) {
			if(arr[mid]==-1) {
				int temp=arr[left];
				arr[left]=arr[mid];
				arr[mid]=temp;
				left++;
				right++;
			}
			
			else if(arr[mid]==0) {
				mid++;
			}
			
			else {
				int temp=arr[mid];
				arr[mid]=arr[right];
				arr[right]=temp;
				right--;
			}
		}
		
	}

}
