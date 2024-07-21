public class DmoveZero {

    public void moveZeroes(int[] nums) {
        int j = -1;

        // Find the first zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // If there are no zeros in the array, no need to do anything
        if (j == -1)
            return;

        // Move non-zero elements forward
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill the remaining elements with zero
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = { 0, 1, 0, 3, 12 };
        solution.moveZeroes(nums1);
        // Expected output: [1, 3, 12, 0, 0]
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums2 = { 0 };
        solution.moveZeroes(nums2);
        // Expected output: [0]
        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }
}
