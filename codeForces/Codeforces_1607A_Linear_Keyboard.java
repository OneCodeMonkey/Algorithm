// AC: 218 ms 
// Memory: 0 KB
// .
// T:(sum(word[i].length)), S:O(max(word[i].length))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1607A_Linear_Keyboard {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String keyboard = sc.next(), word = sc.next();
            HashMap<Character, Integer> mapping = new HashMap<>();
            for (int j = 0; j < 26; j++) {
                mapping.put(keyboard.charAt(j), j + 1);
            }
            int prev = mapping.get(word.charAt(0)), ret = 0;
            for (int j = 1; j < word.length(); j++) {
                int curIndex = mapping.get(word.charAt(j));
                ret += Math.abs(curIndex - prev);
                prev = curIndex;
            }
            System.out.println(ret);
        }
    }
}
