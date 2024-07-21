package array.array;

public class SecondLargest {
    public static void main(String[] args) {
        int a[] = {203,5,223,53,45};
        System.out.println(slarge(a));
    }

    /**
     * @param a
     * @return
     */
    public static int slarge(int a[]) {
        int largest = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }

        int Slargest = Integer.MIN_VALUE;
        for (int i =0; i < a.length; i++) {
            if (a[i] > Slargest && a[i] != largest) {
                Slargest = a[i];
            }
        }
        return  Slargest;  
    }

}

