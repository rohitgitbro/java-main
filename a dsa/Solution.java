public class Solution {
    public int findElement(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return 1; // Element found
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr1 = { 1, 2, 3, 4, 5 };
        int k1 = 3;
        System.out.println(solution.findElement(arr1, k1)); // Expected output: 1

        int[] arr2 = { 1, 2, 3, 4, 5 };
        int k2 = 6;
        System.out.println(solution.findElement(arr2, k2)); // Expected output: -1
    }
}
