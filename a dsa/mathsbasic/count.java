package mathsbasic;

public class count {

    public static int evenlyDivides(int N) {
        int count = 0;
        int originalN = N; // Store original number to check divisibility
        while (N > 0) {
            int r = N % 10; // Get last digit
            if (r != 0 && originalN % r == 0) { // Check if it's not zero and divides N
                count++;
            }
            N = N / 10; // Remove last digit
        }
        return count; // Return the total count
    }

    public static void main(String[] args) {
        int result = evenlyDivides(1012); // Test with a sample input
        System.out.println(result); // Output the result
    }
}
