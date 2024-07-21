package array;
// package array;

public class remove {
    public static void main(String[] args) {
        int a[] = { 1, 3, 4, 5, 5, 7 };
        int newLength = removeElem(a, 5);

        // Print the new array
        for (int i = 0; i < newLength; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int removeElem(int a[], int k) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != k) {
                a[index++] = a[i];
            }
        }
        return index;
    }
}
