// AC: 358 ms 
// Memory: 1400 KB
// Math: 首先找到 a,b 最大公约数 gcd，然后 a = gcd * k, b = gcd * t. 
// 这里由于 a < b < x，那么在这里我们其实可以证明，如果 a/gcd < t, 那么是不存在 x 使得 a,b 是其最大除数的。所以只用讨论两种情况。
// 如果 k == 1, t > 1，那么 x = gcd * t * t, 
// 如果 k > 1, t > 1, 那么 x 为最大公倍数：x = gcd * k * t
// 
// T:O(sum(logni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1916B_Two_Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), ret = 0;
            int gcd = getGCD(a, b), remain1 = a / gcd, remain2 = b / gcd;
            if (remain1 == 1) {
                ret = gcd * remain2 * remain2;
            } else {
                ret = gcd * remain1 * remain2;
            }

            System.out.println(ret);
        }
    }

    /**
     * Get greatest common divisor
     *
     * @param a
     * @param b
     * @return
     */
    private static int getGCD(int a, int b) {
        if (a > b) {
            return getGCD(b, a);
        }
        if (a == 0) {
            return b;
        }
        if (b % a == 0) {
            return a;
        } else {
            return getGCD(b % a, a);
        }
    }
}
