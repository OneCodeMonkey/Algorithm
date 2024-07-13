// AC: 405 ms 
// Memory: 900 KB
// map.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1980A_Problem_Generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), ret = 0;
            String s = sc.next();
            HashMap<Character, Integer> record = new HashMap<>();
            for (char c : s.toCharArray()) {
                record.merge(c, 1, Integer::sum);
            }
            for (int c1 = 'A'; c1 <= 'G'; c1++) {
                char c = (char) c1;
                if (record.getOrDefault(c, 0) < m) {
                    ret += m - record.getOrDefault(c, 0);
                }
            }

            System.out.println(ret);
        }
    }
}
