package array;

public class largest {
    public static void main(String[] args) {
        int a[] = { 1, 42, 2, 5 };

        System.out.println(large(a));
    }

    public static int large(int[] a) {
        int largest = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        return largest;
    }
}
