package string;

public class reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("  hello world  ");

        reverse(sb);
    }

    public static void reverse(StringBuilder sb) {
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
