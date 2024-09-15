// AC: 405 ms 
// Memory: 1200 KB
// Greedy & constructive.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1992C_Gorilla_and_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            StringBuilder ret = new StringBuilder();
            for (int j = n; j >= k; j--) {
                ret.append(j);
                if (j > 1) {
                    ret.append(" ");
                }
            }
            for (int j = k - 1; j > m; j--) {
                ret.append(j);
                ret.append(" ");
            }
            for (int j = 1; j <= m; j++) {
                ret.append(j);
                if (j != m) {
                    ret.append(" ");
                }
            }

            System.out.println(ret);
        }
    }
}
