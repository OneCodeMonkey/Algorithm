// AC: 420 ms 
// Memory: 0 KB
// Calculate range.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1878C_Vasilije_in_Cacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            long x = sc.nextLong();
            long minSum = (long) (1 + k) * k / 2, maxSum = (long) (n + n - k + 1) * k / 2;
            System.out.println((x >= minSum && x <= maxSum) ? "YES" : "NO");
        }
    }
}
