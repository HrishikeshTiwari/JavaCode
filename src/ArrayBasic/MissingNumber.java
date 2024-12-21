/*Algorithm to find the missing number
 (a)First, we will find the summation of first N Natural number using specified formula i.e. N(N+1)/2.
(b)	Then we will add all the element of the array using Loop.
(c)	Finally we will consider the difference b/w fist N Natural number and sum of array elements.

 */
package ArrayBasic;


public class MissingNumber {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,5,6,7};
		int N=arr.length+1;
		int Naturalsum=N*(N+1)/2;
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		System.out.println("The missing Number in the array is");
		int result=Naturalsum-sum;
		System.out.println(result);
	
		

	}

}
