// AC: 327 ms 
// Memory: 600 KB
// Only when there are two different point and distance > 1, the answer exists.
// T:O(sum(ni)), S:O(1)
// 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Codeforces_2004A_Closest_Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            boolean ret = true;
            HashMap<Integer, Integer> record = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (!ret) {
                    continue;
                }
                record.merge(a, 1, Integer::sum);
                if (record.size() >= 3) {
                    ret = false;
                }
            }
            if (ret) {
                Iterator<Integer> it = record.keySet().iterator();
                int diff = Math.abs(it.next() - it.next());
                if (diff == 1) {
                    ret = false;
                }
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
