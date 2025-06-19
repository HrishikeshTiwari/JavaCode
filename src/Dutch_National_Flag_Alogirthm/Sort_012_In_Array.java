package Dutch_National_Flag_Alogirthm;

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
