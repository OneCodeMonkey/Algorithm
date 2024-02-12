// AC: 654 ms 
// Memory: 400 KB
// Greedy.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1921C_Sending_Messages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long f = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), prevTime = 0;
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                int m = sc.nextInt();
                if (!flag) {
                    continue;
                }
                f -= Math.min((m - prevTime) * a, b);
                prevTime = m;
                if (f <= 0) {
                    flag = false;
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
