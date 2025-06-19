package Day1ArrayTopics;

import java.util.Scanner;

public class movingZeroAtEnd {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array which you want");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter"+n+"Element of the array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[count++]=arr[i];
			}
		}
		
		while(count<arr.length) {
			arr[count++]=0;
		}
		
		System.out.println("The element of the array after shifting the zero at the end of the aaray");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	

}
