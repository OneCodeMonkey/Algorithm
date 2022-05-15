// AC: 202 ms 
// Memory: 0 KB
// dp
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_189A_Cut_Ribbon {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), ret = 0;
        int[] dp = new int[4001];
        for (int i = a; i <= n; i++) {
            if (dp[i - a] > 0 || i - a == 0) {
                dp[i] = Math.max(dp[i], dp[i - a] + 1);
            }
        }
        for (int i = b; i <= n; i++) {
            if (dp[i - b] > 0 || i - b == 0) {
                dp[i] = Math.max(dp[i], dp[i - b] + 1);
            }
        }
        for (int i = c; i <= n; i++) {
            if (dp[i - c] > 0 || i - c == 0) {
                dp[i] = Math.max(dp[i], dp[i - c] + 1);
            }
        }

        System.out.println(dp[n]);
    }
}
