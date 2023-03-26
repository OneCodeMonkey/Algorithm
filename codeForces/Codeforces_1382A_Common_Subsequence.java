// AC: 233 ms 
// Memory: 0 KB
// The smallest common subsequence just need to find a common element.
// T:O(sum(ni + mi)), S:O(max(ni))
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1382A_Common_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), ret = 0;
            HashSet<Integer> record = new HashSet<>();
            for (int j = 0; j < n; j++) {
                record.add(sc.nextInt());
            }
            for (int j = 0; j < m; j++) {
                int b = sc.nextInt();
                if (record.contains(b)) {
                    ret = b;
                }
            }

            if (ret == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println("1 " + ret);
            }
        }
    }
}
