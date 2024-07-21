public class FsLARGEST {
    public static void main(String[] args) {
        // int b[] = { 1, 5, 3, 8 };
        int b[] = { -1, -5, -3, -8 };

        System.out.println(slarget(b));
        ;
    }

    public static int slarget(int a[]) {
        int largest = a[0];
        int selarget = Integer.MIN_VALUE;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                // selarget = largest;
                largest = a[i];
            }

            else if (a[i] != largest && selarget > a[i])
                selarget = a[i];
        }

        return selarget;
    }

}
