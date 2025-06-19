package Day2;

public class SearchElement {

	public static void main(String[] args) {

    int arr[]= {1,2,3,4,5,6,8,9};
    int target=8;
    int index=search(arr,target);
    System.out.println("The index of the element present in the array is"+index);

	}
	
	
	public static int search(int arr[], int target) {
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==target) {
				return i;
			}
			
			
		}
		return -1;
		
	}

}
