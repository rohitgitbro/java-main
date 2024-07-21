package array;

import java.util.Arrays;

public class duplicateRemove {
    public static void main(String[] args) {
        // int a[] = { 1, 33, 1, 2, 33, 233, 3 };
        int a[] = { 1, 2, 3, 2, 3, 5, 41 };
        int newLength = dRemove(a);
        for (int j = 0; j < newLength; j++) {
            System.out.println("" + a[j]);
        }
    }

    public static int dRemove(int a[]) {
         if (a.length == 0) return 0;
        Arrays.sort(a);
        int i = 0;
        for (int j = 1; j < a.length; j++) {
            if (a[i] != a[j]) {
                a[i + 1] = a[j];
                i++;
            }
        }
        return i + 1;

    }
}

/*
 * public class duplicateRemove {
 * public static void main(String[] args) {
 * int a[] = { 1, 33, 1, 2, 33, 233, 3 };
 * int newLength = dRemove(a);
 * 
 * // Print the array up to the new length
 * System.out.println("Array after removing duplicates:");
 * for (int i = 0; i < newLength; i++) {
 * System.out.print(a[i] + " ");
 * }
 * }
 * 
 * public static int dRemove(int a[]) {
 * int maxVal = Integer.MIN_VALUE;
 * for (int num : a) {
 * if (num > maxVal) {
 * maxVal = num;
 * }
 * }
 * 
 * // Create a boolean array to keep track of seen numbers
 * boolean[] seen = new boolean[maxVal + 1];
 * 
 * int index = 0;
 * for (int i = 0; i < a.length; i++) {
 * if (!seen[a[i]]) {
 * seen[a[i]] = true;
 * a[index++] = a[i];
 * }
 * }
 * return index;
 * }
 * }
 * 
 */