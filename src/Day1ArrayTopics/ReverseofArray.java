package Day1ArrayTopics;

public class ReverseofArray {

	public static void main(String[] args) {
	
		/* int arr[]= {1,2,3,4,5,6,7,8};
		
		int n=arr.length;
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
		*/
		
		// Another way by using swap method
		
		int arr[]= {1,2,3,4,5,6,7,8};
		
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		System.out.println("Element of the array after reversing");
		for(int n:arr) {
			System.out.print(n+" ");
		}
		

	}

}

// why we cannot give int start=arr[0] in place of int start=0;
//This means you are assigning the value of arr[0] (which is 1) to the start variable. The start variable should represent the index of the array,
//not the value. So instead of holding the value of the first element of the array (arr[0]), it should hold the index of the first element, which is 0.
