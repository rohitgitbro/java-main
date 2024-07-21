package array;
public class sorted {
    public static void main(String[] args) {
        // int a[] = {3,5,6,3,7};
        int a[] = {1,2,5,6};
        if (fn(a)) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }
    }

    public static boolean fn(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i] > a[i + 1]){
                return false;
            }
        }
        return true;
    }
}