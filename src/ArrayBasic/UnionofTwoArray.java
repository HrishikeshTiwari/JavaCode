/*  
 * Brute Force approach
 *
 * UNION OF TWO ARRAY
 * 1. Declare set and add all the element from both the array as set takes only unique element.
 * 2. after adding all the element from the array into set add set element into arryalist and return that list
 * 3. the method which is declared in the main method that return type should be ArryaLiat<Integer> 
 * lst=method name. then print the element from arraylist using for each loop.
 *  */

package ArrayBasic;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnionofTwoArray {

	public static void main(String[] args) {

     int arr1[]= {1,2,3,4,5,6};
     int n=arr1.length;
     int arr2[]= {1,2,3,7,8,9,10};
     int n1=arr2.length;
    ArrayList<Integer>lst=  Union(arr1,n,arr2,n1);
    
    for(int val:lst) {
    	System.out.print(val+" ");
    }
     

	} 
	
	public static ArrayList<Integer> Union(int arr1[], int n, int arr2[], int m){
		Set<Integer> set= new LinkedHashSet<>();
		
		for(int i=0;i<n;i++) {
			set.add(arr1[i]);
		}
		
		// Adding the unique element from second array
		
		for(int i=0;i<m;i++) {
			set.add(arr2[i]);
		}
		
		// adding the list value into the arraylist
		ArrayList<Integer> lst= new ArrayList<Integer>();
		for(int element:set) {
			lst.add(element);
		}
		return lst;
		
	}

}

// Time complexity:-
//O(n1logn+n2logn) +O(n1+n2)  => O(n1+n2) will be for worst cases when both the array is having
//different element

// space complexity:O(n1+n2) +O(n1+n2) the second n1+n2 space is for returning the element.

