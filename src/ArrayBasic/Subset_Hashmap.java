package ArrayBasic;

/*
 * We can use a hash set to store elements of a[], this will help us in constant time complexity searching. We first insert all elements of a[] 
 * into a hash set. Then, for each element in b[], we check if it exists in the hash set.
 */
import java.util.HashSet;
import java.util.Set;

public class Subset_Hashmap {

	public static void main(String[] args) {
	
		
		int arr1[]= {1,2,3,4,5,6,7,8};
		int arr2[]= {12,23};
		
		if(issubset(arr1,arr2)) {
			System.out.println("The array is subset of another array");
		}
		
		else {
			System.out.println("The array is not subset ");
		}
		
	}
	
	public static boolean issubset(int arr1[], int arr2[]) {
		int n= arr1.length;
		int m=arr2.length;
		
		Set<Integer> hashset= new HashSet<Integer>();
		
		for(int num:arr1) {
			hashset.add(num);
		}
		
		for(int num:arr2) {
			if(hashset.contains(num)) {
				return true;
			}
		}
		
		return false;
		 
		
	}

}
