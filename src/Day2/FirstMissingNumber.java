package Day2;

public class FirstMissingNumber {

	public static void main(String[] args) {
		
		int arr[]= {7,8,9,11,12};
		
		/*
		 * Input: nums = [1, 2, 0]  
           Output: 3  
           Explanation: The first missing positive number is **3**.
           
           
           Input: nums = [3, 4, -1, 1]  
		   Output: 2  
		   Explanation: The first missing positive number is **2**.
		 */
		
		
		
          int n=arr.length;
          
          for(int i=0;i<n;i++) {
        	  while(arr[i]>0 && arr[i]<=n && arr[arr[i] - 1] != arr[i]) {
        		  
        	  }
          }
	}

}







public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        // Step 1: Place each number at its correct index
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with its correct position
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Step 2: Find the first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all numbers are placed correctly, return next positive number
        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println("First Missing Positive: " + firstMissingPositive(nums)); // Output: 2
    }
}






















