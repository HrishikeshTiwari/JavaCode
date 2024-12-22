/*
 * Optimal approach
 * 1.Reverse the subarray with the help of first d element (reverse(arr,arr+d)).this(reverse(arr,arr+d))
 * means arr refers to the starting pointer of the array.
   arr + d refers to the pointer at the position d elements ahead of arr.
   2. Reverse the last (n-d) element (Reverse(arr+d,arr+n))
   3. finally reverse the whole array (arr,arr+n)
 */



package ArrayBasic;

public class RotateElement_By_Dposition2 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        int d = 3;
        System.out.println("Element before rotation of the array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        LeftRotation(arr, d, n);
        System.out.println("\nArray after Rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void LeftRotation(int arr[], int d, int n) {
        if (n == 0) {
            return;
        }

        d = d % n; // This ensures d is within the array bounds
        reverse(arr, 0, d - 1); // Reverse the first d elements
        reverse(arr, d, n - 1); // Reverse the last (n - d) elements
        reverse(arr, 0, n - 1); // Reverse the whole array
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            // Correct swapping logic
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

