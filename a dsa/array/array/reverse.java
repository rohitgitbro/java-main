package array;

import java.util.Arrays;

public class reverse {
    // public static void main(String[] args) {
    // // System.out.println("Try programiz.pro");
    // int a[] = { 1, 3, 5 };
    // reverse(a);

    // }

    // public static void reverse(int a[]) {
    // for (int i = 0; i < a.length / 2; i++) {
    // int j = a.length - 1;
    // int temp = a[i];
    // a[i] = a[j];
    // a[j] = temp;
    // j--;
    // }
    // for (int i = 0; i < a.length; i++) {
    // System.out.print(a[i] + " ");
    // }
    // }

    // }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println("Original array: " + Arrays.toString(arr));

        reverseArray(arr);

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }
    }
}
