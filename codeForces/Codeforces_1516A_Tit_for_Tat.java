// AC: 281 ms 
// Memory: 700 KB
// Greedy.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1516A_Tit_for_Tat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), k1 = k;
            StringBuilder ret = new StringBuilder();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (j == n - 1) {
                    ret.append(a + k1 - k);
                } else {
                    if (a <= k) {
                        ret.append(0);
                        k -= a;
                    } else {
                        ret.append(a - k);
                        k = 0;
                    }
                    ret.append(" ");
                }
            }

            System.out.println(ret);
        }
    }
}
