// AC: 327 ms 
// Memory: 1200 KB
// Hashmap & Greedy.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1800B_Count_the_Number_of_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), ret = 0;
            String s = sc.next();
            HashMap<Character, Integer> record = new HashMap<>();
            for (char c : s.toCharArray()) {
                record.merge(c, 1, Integer::sum);
            }
            for (int c = 'a'; c <= 'z'; c++) {
                int lower = 0, upper = 0;
                if (record.containsKey((char) c)) {
                    lower = record.get((char) c);
                }
                if (record.containsKey((char) (c - 32))) {
                    upper = record.get((char) (c - 32));
                }
                int exist = Math.min(lower, upper), notPair = lower + upper - 2 * exist;
                if (exist > 0) {
                    ret += Math.min(lower, upper);
                }
                if (notPair > 0 && k > 0) {
                    ret += Math.min(k, notPair / 2);
                    k -= Math.min(k, notPair / 2);
                }
            }

            System.out.println(ret);
        }
    }
}
