// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_474A_Keyboard {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String direction = sc.next(), rawStr = sc.next();
        String row1 = "qwertyuiop", row2 = "asdfghjkl;", row3 = "zxcvbnm,./";
        HashMap<Character, Character> mappingLeft = new HashMap<>(), mappingRight = new HashMap<>();
        for (String str : Arrays.asList(row1, row2, row3)) {
            for (int i = 1; i < str.length(); i++) {
                mappingLeft.put(str.charAt(i), str.charAt(i - 1));
            }
            for (int i = 0; i < str.length() - 1; i++) {
                mappingRight.put(str.charAt(i), str.charAt(i + 1));
            }
        }
        StringBuilder ret = new StringBuilder();
        for (char c : rawStr.toCharArray()) {
            ret.append("L".equals(direction) ? mappingRight.get(c) : mappingLeft.get(c));
        }

        System.out.println(ret);
    }
}
