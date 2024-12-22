/*
 Algorithm to find the second Largest number in an array
 1. declare two variable Largest and second Largest and initialize them with 0 and -1
 2. run a loop and check every element of the array and check if it greater than largest then transfer that value to largest
 before that assign largest value to second largest then assign arr[i] into largest.
 3. check another condition if arr[i] is smaller than largest but it is greater than  second largest then in that case just
 transfer / assign the value of arr[i] into secondlargest
 * 
 */




package ArrayBasic;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[]= {1,2,45,67,89,84};
		int largest=0;
		int secondLargest=-1;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}
			
			else if (arr[i]<largest && arr[i]>secondLargest){
				secondLargest=arr[i];
				
			}
			
		}
		
		System.out.println("The largest and second largest number is ");
		System.out.println(largest);
		System.out.println(secondLargest);

	}

}
