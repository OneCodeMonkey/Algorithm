// AC: 935 ms 
// Memory: 800 KB
// DP: or called prefix sum.
// T:O(q), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_1539B_Love_Song {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        String s = sc.next();
        int[] dp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            dp[i + 1] = dp[i] + (s.charAt(i) - 'a' + 1);
        }
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt(), r = sc.nextInt(), ret = dp[r] - dp[l - 1];
            System.out.println(ret);
        }
    }
}
