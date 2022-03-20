// AC: Time: 374 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_118A_String_Task {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        StringBuilder ret = new StringBuilder();
        HashSet<Character> vowel = new HashSet<>(Arrays.asList('A', 'a', 'O', 'o', 'Y', 'y', 'E', 'e', 'U', 'u', 'I', 'i'));
        for (char c : str.toCharArray()) {
            if (!vowel.contains(c)) {
                ret.append('.');
                ret.append(Character.toLowerCase(c));
            }
        }

        System.out.println(ret.toString());
    }
}