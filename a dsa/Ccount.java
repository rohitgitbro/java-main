public class Ccount {

    public static void main(String[] args) {
        System.out.println(count(47)); // Output: 2
        System.out.println(count(0)); // Output: 1 (special case for zero)
        System.out.println(count(-123)); // Output: 3 (handles negative numbers)
    }

    static int count(int n) {
        if (n == 0) {
            return 1; // Special case for zero (one digit)
        }

        // Handle negative numbers
        n = Math.abs(n);

        // Improved logarithmic approach:
        return (int) Math.ceil(Math.log10(n));
    }
}
