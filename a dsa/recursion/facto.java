package recursion;

public class facto {
    public static void main(String[] args) {
        System.out.println(findFacto(3));
        System.out.println(nThfibonacci(5));
        // int a[] = { 1, 2, 3, 4 };
        int a[] = { 41, 32, 30, 4 };
        // int a[] = { 4 };
        System.out.println(isSorted(a, 0));
        // int a[] = { 1, 4, 2, 3, 4, 4 };
        // int a[] = { 4, 4, 4 };
        System.out.println(firstOccurence(a, 0, 4));
        System.out.println(firstOccurence(a, 0, 5));
        System.out.println(lastOccurence(a, 0, 4));
        // System.out.println(lastOccurence(a, 0, 3));

        // System.out.println(xpow(2, 5));
        System.out.println(xpowOptimize(2, 6));

    }

    public static int xpowOptimize(int x, int n) {
        if (n == 1) {
            return x;
        }

        int halfPower = xpowOptimize(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSq = n * halfPowerSq;

        }
        return halfPowerSq;

    }

    public static int xpow(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * xpow(x, n - 1);
    }

    public static int lastOccurence(int a[], int i, int key) {
        if (i == a.length) {
            return -1;

        }
        int isFound = lastOccurence(a, i + 1, key);
        if (isFound != -1) {
            return isFound;
        }
        // check withself
        if (key == a[i]) {
            return i;
        }
        return isFound;
    }

    public static int findFacto(int n) {
        if (n == 0) {
            return 1;
        }
        int fn = n * findFacto(n - 1);
        return fn;
    }

    public static int nThfibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;

        }

        int fibnm1 = nThfibonacci(n - 1);
        int fibnm2 = nThfibonacci(n - 2);
        int fib = fibnm1 + fibnm2;
        return fib;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;

        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);

    }

    public static int firstOccurence(int a[], int i, int x) {
        if (i == a.length) {
            return -1;

        }
        if (a[i] == x) {
            return i;
        }
        return firstOccurence(a, i + 1, x);
    }
}