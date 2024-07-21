package string;

public class reversRecursion {
     public static void main(String[] args) {
        String s1 = "hellhi";
    System.out.println(fn(s1,"",s1.length()-1));
    }
    public static String fn(String s, String r,int i) {
        // if(s.isEmpty() || s.length() == 1){
        //    return  s;
        // }
        if(i<0){
            return  r;
         }
        return  fn(s,r+s.charAt(i),i-1);

    }
}
