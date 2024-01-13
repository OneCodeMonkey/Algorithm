// AC: 202 ms 
// Memory: 0 KB
// hashmap.
// T:O(sum(ni)), S:O(1)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1914A_Problemsolving_Log {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), maxScore = 0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            String s = sc.next();
            HashMap<Character, Integer> record = new HashMap<>();
            for (char c : s.toCharArray()) {
                record.merge(c, 1, Integer::sum);
            }
            for (char c : record.keySet()) {
                if (record.get(c) >= c - 'A' + 1) {
                    ret++;
                }
            }
            System.out.println(ret);
        }
    }
}
