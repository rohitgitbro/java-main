package array;

public class pairs {
    public static void main(String[] args) {
        // System.out.println();
        int a[] = { 2, 4, 6, 8, 10 };

        // pairsFind(a);
        subArr(a);
    }

    public static void subArr(int a[]) {
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            int start = i;// 2,4,6,8,10
            for (int j = i; j < a.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(a[k] + " ");
                    sum += a[k];

                }
                minSum = Math.min(minSum, sum);
                maxSum = Math.max(maxSum, sum);
                System.out.println("sum is:" + sum);
                // System.out.println(sum);
                // sum = Math.min(a);

            }
            System.out.println();

        }
        System.out.println("Minimum sum is: " + minSum);
        System.out.println("Maximum sum is: " + maxSum);
    }

    public static void pairsFind(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int curr = a[i];// 2,4,6,8,10
            for (int j = i + 1; j < a.length; j++) {
                System.out.print("(" + curr + "," + a[j] + ")");// 4,6,8,10
            }
        }
    }
}
