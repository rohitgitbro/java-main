package array;

import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        int a[] = {1, 3, 2, 4, 1, 3};
        dupliRemoveUsingSet(a);
    }

    public static void dupliRemoveUsingSet(int a[]) {
        Set<Integer> d = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (!d.add(a[i])) {
                System.out.println("Duplicate found: " + a[i] + " at index "+i);
                
            }
        }
    }
}
