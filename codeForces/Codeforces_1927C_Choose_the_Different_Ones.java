// AC: 1280 ms 
// Memory: 32800 KB 
// Calculate set with n-array and m-array which elements in [1, k], 
// if set1.size() >= k/2, set2.size() >= k/2 and  merged set size == k, that is the answer.
// T:O((sum(ni, mi))), S:O(max(k))
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1927C_Choose_the_Different_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            HashSet<Integer> record1 = new HashSet<>(), record2 = new HashSet<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a <= k) {
                    record1.add(a);
                }
            }
            for (int j = 0; j < m; j++) {
                int b = sc.nextInt();
                if (b <= k) {
                    record2.add(b);
                }
            }
            boolean ret = false;
            if (record1.size() >= k / 2 && record2.size() >= k / 2) {
                record1.addAll(record2);
                if (record1.size() == k) {
                    ret = true;
                }
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
