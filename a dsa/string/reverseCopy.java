package string;

public class reverseCopy {
    public static void main(String[] args) {

        String s = "abc def";
        String Rev = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            Rev = ch + Rev;
        }
        System.out.println(Rev);
    }
}