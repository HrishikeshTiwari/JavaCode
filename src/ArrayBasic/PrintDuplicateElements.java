package ArrayBasic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintDuplicateElements {

	public static void main(String[] args) {

    int arr[]= {1,2,3,4,5,6,5,3,2};
    
    Set<Integer> set= new HashSet<Integer>();
    System.out.println("Printing the duplicate element");
    
    for(int i=0;i<arr.length;i++) {
    	
    	
    	if(!set.add(arr[i])) {
    		System.out.println(+arr[i]);
    	}
    }

	}

}

/*
 * Algorithm
 * 
 * 1. Declare an set because set store only unique element.
 * 2. run a loop and add the element. 
 * 3. Add the element in the list. if it is duplicate it will not add it will return false.set.add(arr[i]) if the element is not present it will throw false.
 * 
 */
 
