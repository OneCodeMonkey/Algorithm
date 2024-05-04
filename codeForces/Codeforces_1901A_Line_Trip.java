// AC: 327 ms 
// Memory: 1100 KB
// Notice: the problems says we will need to reach x, and then return to 0.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1901A_Line_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), x = sc.nextInt(), prev = 0, ret = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a <= x) {
                    ret = Math.max(ret, a - prev);
                    if (j == n - 1) {
                        ret = Math.max(ret, 2 * (x - a));
                    }
                } else {
                    ret = Math.max(ret, 2 * (x - prev));
                }

                prev = a;
            }

            System.out.println(ret);
        }
    }
}
