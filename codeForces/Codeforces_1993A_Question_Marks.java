// AC: 312 ms 
// Memory: 900 KB
// Map.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1993A_Question_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            String s = sc.next();
            HashMap<Character, Integer> record = new HashMap<>();
            for (char c : s.toCharArray()) {
                if (c != '?') {
                    record.merge(c, 1, Integer::sum);
                }
            }
            for (char c : Arrays.asList('A', 'B', 'C', 'D')) {
                ret += Math.min(n, record.getOrDefault(c, 0));
            }

            System.out.println(ret);
        }
    }
}
