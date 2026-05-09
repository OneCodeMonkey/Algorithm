// Time: 327 ms 
// Memory: 800 KB
// greedy
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_2121B_Above_the_Clouds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            HashMap<Character, Integer> record = new HashMap<>();
            for (int j = 1; j < n - 1; j++) {
                record.merge(s.charAt(j), 1, Integer::sum);
            }
            boolean flag = true;
            for (char c : record.keySet()) {
                if (record.get(c) > 1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                if (record.containsKey(s.charAt(0)) || record.containsKey(s.charAt(n - 1))) {
                    flag = false;
                }
            }

            System.out.println(flag ? "NO" : "YES");
        }
    }
}
