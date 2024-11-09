// AC: 390 ms
// Memory: 700 KB
// Math & Greedy: find least common multiple, make the diff biggest.
// Notice the Integer range overflow, since LCM of (x, y) may be over Int32 range.
// T:O(sum(ni / (min(xi,yi)))), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1872D_Plus_Minus_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
            long ret = 0;
            if (x != y) {
                int gcd = gcd(x, y);
                long lcm = (long) x / gcd * y, n1 = n / x, n2 = n / y, n3 = n / lcm, num1 = n1 - n3, num2 = n2 - n3;
                long ySum = num2 * (num2 + 1) / 2, xSum = (n + n - num1 + 1) * num1 / 2;
                ret = xSum - ySum;
            }

            System.out.println(ret);
        }
    }

    private static int gcd(int a, int b) {
        if (a > b) {
            return gcd(b, a);
        }
        if (b % a == 0) {
            return a;
        } else {
            return gcd(b % a, a);
        }
    }
}

