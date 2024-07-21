package string;

public class reverseWord {
    public static void main(String[] args) {
        String str = "hello world";
        String a[] = str.split(" ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");

        }
    }

}
