public class Erotate {

    public void rotate(int[] nums, int k) {
        k = k % nums.length; // In case k is greater than the length of the array
        reverse(nums, 0, nums.length - 1); // Step 1: Reverse the entire array
        reverse(nums, 0, k - 1); // Step 2: Reverse the first k elements
        reverse(nums, k, nums.length - 1); // Step 3: Reverse the remaining n-k elements
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}