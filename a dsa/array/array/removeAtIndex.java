package array;

public class removeAtIndex {
    public static void main(String[] args) {
        
    
    int a[] = {1,5,8};
    int size = a.length;
int key = 0;
    for(int i = key; i<size-1; i++){
        a[i] = a[i+1];

    }
    size--;
    for (int i = 0; i < size; i++) {
        System.out.println(a[i]);
    }

    
}
}