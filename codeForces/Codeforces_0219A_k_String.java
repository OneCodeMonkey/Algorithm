// AC: 374 ms 
// Memory: 0 KB
// Hashtable
// T:O(n), S:O(n), n = s.length()
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_0219A_k_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        if (k == 1) {
            System.out.println(s);
            return;
        }
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.merge(c, 1, Integer::sum);
        }
        StringBuilder ret = new StringBuilder();
        for (char c : charCount.keySet()) {
            int time = charCount.get(c);
            if (time % k != 0) {
                System.out.println(-1);
                return;
            }
            ret.append(String.valueOf(c).repeat(time / k));
        }

        System.out.println(ret.toString().repeat(k));
    }
}
