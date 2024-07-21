public class Dreverse {
    public static void main(String[] args) {
        // reverse(-123);
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int n) {
        int revNum = 0;
        boolean isNegative = n < 0;
        n = Math.abs(n);

        while (n > 0) {
            int ld = n % 10;
            revNum = (revNum * 10) + ld;
            n /= 10;
        }
        if (isNegative) {
            revNum = -revNum;
        }
        return revNum;
    }

}
