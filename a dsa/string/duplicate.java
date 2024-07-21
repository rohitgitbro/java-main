package string;

import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        String s = "apnnaccollege";

        removeDuplicate(s, 0, new StringBuilder(""), new boolean[26]);
    }

    public static void removeDuplicate(String s, int idx, StringBuilder newstr, boolean map[]) {
        if (idx == s.length()) {
            System.out.println(newstr);
            return;
        }
        char currChar = s.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicate(s, idx + 1, newstr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(s, idx + 1, newstr.append(currChar), map);
        }
    }
}
