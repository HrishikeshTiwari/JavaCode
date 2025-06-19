package Day2;

public class First_And_LastElement_in_Sorted_Array {
	
        public static int[] searchFirstLast(int[] arr, int target) {
        int first = findPosition(arr, target, true);  // Find first occurrence
        int last = findPosition(arr, target, false);  // Find last occurrence
        return new int[]{first, last};
    }

    private static int findPosition(int[] arr, int target, boolean findFirst) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  // Find mid

            if (arr[mid] == target) {
                result = mid;  // Target found
                if (findFirst) {
                    high = mid - 1;  // Move left
                } else {
                    low = mid + 1;   // Move right
                }
            } else if (arr[mid] < target) {
                low = mid + 1;  // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        return result;  // Return position or -1 if not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 7, 7, 8};
        int target = 4;

        int[] result = searchFirstLast(arr, target);
        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
    }
}

/*
 * Why Do We Need findFirst?
The variable findFirst is a boolean flag that helps us determine whether we are searching for the first occurrence or the last occurrence of the target.

If findFirst = true → We search for the first occurrence by moving left (high = mid - 1).
If findFirst = false → We search for the last occurrence by moving right (low = mid + 1).
*/