// AC: 312 ms 
// Memory: 24700 KB
// dp
// T:O(max(nums[i])), S:O(1e5)
// 
import java.util.Scanner;

public class Codeforces_455A_Boredom {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), pos = 0, maxN = 0;
        int maxSize = 100_000 + 1;
        long[] record = new long[maxSize];
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            record[t]++;
            maxN = Math.max(maxN, t);
        }
        long[] dp = new long[maxSize];
        dp[1] = record[1];
        for (int i = 2; i <= maxN; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + record[i] * i);
        }
        System.out.println(dp[maxN]);
    }
}
