package sorting;

public class bubleSort {
    public static void main(String[] args) {
        int a[] = { 3, 5, 2, 7, 1 };
        // bubble(a);
        // selection(a);
        insertion(a);
    }

    public static void bubble(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) { // j = 4 - i // 3 sudhi pelu loop
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void selection(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[smallest] > a[j]) {
                    smallest = j;
                }
            }
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "s ");
        }
        System.out.println();
    }

    public static void insertion(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > current) {
                a[j + 1] = a[j];
                j--;
            }
            a[j+1] = current;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "i ");
        }
        System.out.println();
    }
}
