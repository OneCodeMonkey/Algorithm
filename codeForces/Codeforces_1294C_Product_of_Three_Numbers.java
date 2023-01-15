// AC: 233 ms 
// Memory: 0 KB
// Math: we can know that a ^3 < n, and b ^ 2 < n / a, so travel through [2, Math.cbrt(n)] to find a, 
// and travel throught [a + 1, Math.sqrt(n / a)] to find b, notice check b^2 == n, because b < c.
// T:O(sum(pow(ni, 1/3))), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1294C_Product_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            if (n < 24) {
                System.out.println("NO");
                continue;
            }

            int cbrt = (int) Math.cbrt(n), a = -1, b = -1, c = -1;
            for (int j = 2; j <= cbrt; j++) {
                if (n % j == 0) {
                    a = j;
                    break;
                }
            }
            if (a == -1) {
                System.out.println("NO");
                continue;
            }
            n /= a;
            int sqrt = (int) Math.sqrt(n);
            for (int j = a + 1; j <= sqrt; j++) {
                if (n % j == 0) {
                    b = j;
                    break;
                }
            }
            if (b == -1 || b * b == n) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            System.out.printf("%d %d %d\n", a, b, n / b);
        }
    }
}
