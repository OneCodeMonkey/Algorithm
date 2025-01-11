// Time: 592 ms 
// Memory: 800 KB
// DP.
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_1195C_Basketball_Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n], arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        long[] dp1 = new long[n + 1], dp2 = new long[n + 1];
        dp1[1] = arr1[0];
        dp2[1] = arr2[0];
        for (int i = 2; i <= n; i++) {
            long max1 = Math.max(dp1[i - 2], dp2[i - 2]);
            dp1[i] = Math.max(dp2[i - 1] + arr1[i - 1], max1 + arr1[i - 1]);
            dp2[i] = Math.max(dp1[i - 1] + arr2[i - 1], max1 + arr2[i - 1]);
        }

        System.out.println(Math.max(dp1[n], dp2[n]));
    }
}

