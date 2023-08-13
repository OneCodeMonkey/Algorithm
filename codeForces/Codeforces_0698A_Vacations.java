// AC: 202 ms 
// Memory: 0 KB
// DP.
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_0698A_Vacations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ret = 0;
        int[] arr = new int[n];
        // dp0: rest dp1: go to gym, dp2: go to contest
        int[] dp0 = new int[n + 1], dp1 = new int[n + 1], dp2 = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        for (int i = 0; i < n; i++) {
            dp0[i + 1] = Math.max(dp0[i], Math.max(dp1[i], dp2[i]));
            if (arr[i] == 1) {  // contest
                dp2[i + 1] = Math.max(dp0[i] + 1, Math.max(dp1[i] + 1, dp2[i]));
            } else if (arr[i] == 2) {   // gym
                dp1[i + 1] = Math.max(dp0[i] + 1, Math.max(dp2[i] + 1, dp1[i]));
            } else if (arr[i] == 3) {   // either
                dp1[i + 1] = Math.max(dp0[i] + 1, Math.max(dp2[i] + 1, dp1[i]));
                dp2[i + 1] = Math.max(dp0[i] + 1, Math.max(dp1[i] + 1, dp2[i]));
            }
        }

        System.out.println(n - Math.max(dp0[n], Math.max(dp1[n], dp2[n])));
    }
}
