package array;

public class binary {
    public static void main(String[] args) {
        int a[] = { 1, 3, 5, 7 };
        int k = 5;
                        
        System.out.println(binarySearch(a, k));

    }

    public static int binarySearch(int a[], int key) {
        int start = a[0];
        int end = a.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (a[mid] == key) {
                return mid;
            }

            if (a[mid] < key) {// right
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
