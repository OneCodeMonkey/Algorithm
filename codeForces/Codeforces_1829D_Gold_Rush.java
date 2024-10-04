// AC: 312 ms 
// Memory: 900 KB
// Math: First divide by GCD(), then try to /3 and /2, check factor times are /3 > /2.
// T:O(sum(logni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1829D_Gold_Rush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt();
            boolean ret = false;
            if (n == m) {
                ret = true;
            } else if (n > m && n % 3 == 0) {
                int gcd1 = gcd(n, m);
                n /= gcd1;
                m /= gcd1;
                int count1 = 0, count2 = 0;
                while (n % 3 == 0) {
                    n /= 3;
                    count1++;
                }
                while (m % 2 == 0) {
                    m /= 2;
                    count2++;
                }
                ret = n == 1 && m == 1 && count1 >= count2;
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }

    private static int gcd(int a, int b) {
        if (a > b) {
            return gcd(b, a);
        }
        if (b % a == 0) {
            return a;
        }
        return gcd(b % a, a);
    }
}
