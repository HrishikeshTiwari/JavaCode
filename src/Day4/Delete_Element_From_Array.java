package Day4;

import java.util.Arrays;

// we can delete the element of the array by 2 ways. 1 by shifting the array element. 2. By using another array. in this we will use second option

public class Delete_Element_From_Array {

	public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,6};
        
        int removeelmeent=3;
        int newarray[]=Remove(arr,removeelmeent);
        System.out.println("The old array is"+Arrays.toString(arr));
        System.out.println("Array after removing the array"+Arrays.toString(newarray));
        
	}
	
	
	public static int[]Remove(int arr[], int removeElement){
		int Newarray[]= new int[arr.length-1];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=removeElement) {
				Newarray[index]=arr[i];
				index++;
			}
		}
		return Newarray;
	}

}
