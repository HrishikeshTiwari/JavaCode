package Dutch_National_Flag_Alogirthm;

public class SeperatingEven_Odd {

    public static void main(String[] args) {

        int arr[] = {2, 3, 4, 5, 6, 7, 8, 10, 12, 16};

        rearrange(arr);

        System.out.println("Printing the elements of the array after separation:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static void rearrange(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            // If left is even, move forward
            if (arr[left] % 2 == 0) {
                left++;
            }
            // If right is odd, move backward
            else if (arr[right] % 2 != 0) {
                right--;
            }
            // Left is odd, right is even — swap them
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
