package ArrayBasic;
/*
 * Brute force Approach
 * the very basic approach is to use two nested loops: the outer loop picks each element from b[], 
 * and the inner loop searches for this element in a[] and check for all elements in b[].
 */

public class SubsetofAnotherArray1 {

	public static void main(String[] args) {


		int arr1[] = {11, 1, 13, 21, 3, 7};
		int arr2[] = {12,14} ;
		
		if(issubset(arr1,arr2)) {
			System.out.println("The array is subset of another array");
		}
		
		else {
			System.out.println("The array is not subset of another array");
		}

	}
	
	public static boolean issubset(int arr1[], int arr2[]) {
		
		int n=arr1.length;
		int m=arr2.length;
		boolean found=false;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<m;j++) {
				if(arr1[i]==arr2[j]) {
					found=true;
					break;
					
				}
			}
			
			// If any element is not found, return false
			if(!found) return false;
			
			
		}
		return true;
	
	}

}

//Time Complexity: O(m*n)
//Auxiliary Space: O(1)
