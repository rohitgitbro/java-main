package recursion;

public class palindrome {
    public static void main(String[] args) {
        String testString = "madam"; // Example string to test
        boolean result = fn(0, testString);
        System.out.println("Is the string \"" + testString + "\" a palindrome? " + result);

    }

    public static boolean fn(int i, String s) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
            return false;
        }
        return fn(i + 1, s);
    }
}