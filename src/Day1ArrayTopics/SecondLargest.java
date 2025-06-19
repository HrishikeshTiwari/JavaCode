package Day1ArrayTopics;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     
     System.out.println("Enter the size of the array which you want to provide");
     int n=sc.nextInt();
     int arr[]= new int[n];
     System.out.println("enter"+n+ "element of the array");
     for(int i=0;i<n;i++) {
    	 arr[i]=sc.nextInt();
     }
     
   /*
     // finding second largest by sorting method
     
     Arrays.sort(arr);
     System.out.println(arr[1]);
     
     */
     
     int largest=0;
     int secondlargest=-1;
     
     for(int i=0;i<arr.length;i++) {
    	 if(arr[i]>largest) {
    		 secondlargest=largest;
    		 largest=arr[i];
    	 }
    	 
    	 else if(arr[i]<largest && arr[i]>secondlargest) {
    		 secondlargest=arr[i];
    	 }
     }
     
     System.out.println("the largest elememnt is"+largest);
     System.out.println("the  second largest elememnt is"+secondlargest);

	}

}
