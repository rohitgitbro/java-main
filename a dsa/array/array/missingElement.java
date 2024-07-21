/*
 * package array;

public class missingElement {
     public static void main(String[] args) {
        int a[] = {1,2,4};// for sort array only
    System.out.println(fn(a));
    }
    public static int  fn(int a[]) {
        for (int i =1; i <= a.length; i++) {
            int flag = 0;
            for (int j = 0; j < a.length - 1 ; j++) {
                if(a[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                return i;
            }
        }
        return -1;
    }
    
}
 */


package array;

public class missingElement {
    public static void main(String[] args) {
        int a[] = {1,2,4};
        System.out.println(fn(a));
    }
    public static int  fn(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i] + 1 != a[i + 1]){
                return a[i] + 1;
            }
        }
        return 0;
    }
}