// AC: 326 ms 
// Memory: 0 KB
// Brute-force & hashmap.
// T:O(sum(ni * mi)), S:O(max(ni + mi))
// 
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Codeforces_1941A_Rudolf_and_the_Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt(), max1 = 0, max2 = 0, ret = 0;
            HashMap<Integer, Integer> record1 = new HashMap<>();
            TreeMap<Integer, Integer> record2 = new TreeMap<>();
            for (int j = 0; j < n; j++) {
                int b = sc.nextInt();
                max1 = Math.max(max1, b);
                record1.merge(b, 1, Integer::sum);
            }
            for (int j = 0; j < m; j++) {
                int c = sc.nextInt();
                max2 = Math.max(max2, c);
                record2.merge(c, 1, Integer::sum);
            }
            if (max1 + max2 <= k) {
                ret = n * m;
            } else {
                for (int j : record1.keySet()) {
                    int count1 = record1.get(j);
                    if (j + max2 <= k) {
                        ret += count1 * m;
                    } else {
                        for (int r : record2.keySet()) {
                            if (j + r > k) {
                                break;
                            }
                            ret += count1 * record2.get(r);
                        }
                    }
                }
            }

            System.out.println(ret);
        }
    }
}
