package Day4;

import java.util.Arrays;
import java.util.Scanner;

/*
 * replace one element in an array a then copy all elements from array a to b and print them in descending order
 */

public class ArrayManipulation {

	public static void main(String[] args) {

      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int n=sc.nextInt();
      int arr1[]= new int[n];
      // adding the element into the array1
      
      for(int i=0;i<arr1.length;i++) {
    	  arr1[i]=sc.nextInt();
      }
      
      System.out.println("Enter the element index of the element which for which you want to remove the element");
      int index=sc.nextInt();
      System.out.println("Enter the value which you want to push");
      int value=sc.nextInt();
      
       arr1[index]=value;
      
      int arr2[]= new int[n];
      
      Arrays.sort(arr1);
      
      for(int i=0;i<arr1.length;i++) {
    	  arr2[arr2.length-i-1]=arr1[i];
      }
      
      System.out.println("Printing the element of the array after reversing of element of second array");
      
      for(int i=0;i<arr2.length;i++) {
    	  System.out.print(arr2[i]+" ");
      }
      
 

	}

}
