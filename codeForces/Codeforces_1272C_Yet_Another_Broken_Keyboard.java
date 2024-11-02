// AC: 296 ms 
// Memory: 700 KB
// Combinatorics.
// T:O(n + k), S:O(k)
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1272C_Yet_Another_Broken_Keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), cur = 0;
        long ret = 0;
        String s = sc.next();
        HashSet<Character> letters = new HashSet<>();
        for (int i = 0; i < k; i++) {
            letters.add(sc.next().charAt(0));
        }
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (letters.contains(c)) {
                cur++;
                if (i == n - 1) {
                    ret += (long) cur * (cur + 1) / 2;
                }
            } else {
                ret += (long) cur * (cur + 1) / 2;
                cur = 0;
            }
        }

        System.out.println(ret);
    }
}
