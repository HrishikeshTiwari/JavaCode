package Day2;

public class TwoSum {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Input: nums = [2, 7, 11, 15], target = 9  
           Output: [0, 1]  
           Explanation: nums[0] + nums[1] = 2 + 7 = 9, so return [0, 1].
           

		 */

		
		int arr[] = {2, 11, 7, 15};
		int target = 9;


		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(" "+i+" "+j);
				}
			}
			
		
		}
	}

}
