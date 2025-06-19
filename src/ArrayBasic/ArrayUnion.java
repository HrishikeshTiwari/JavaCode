package ArrayBasic;

import java.util.HashSet;
import java.util.Set;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] array1 = {5,6,7,8,8,1,2,3,5,6,7};
        int[] array2 = {4, 5, 6, 7, 8};

        Set<Integer> unionSet = new HashSet<>();

        for (int num : array1) {
            unionSet.add(num);
        }

        for (int num : array2) {
            unionSet.add(num);
        }

        System.out.println("Union of the two arrays: " + unionSet);
    }
}