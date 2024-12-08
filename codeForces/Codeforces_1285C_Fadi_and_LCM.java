// AC: 358 ms 
// Memory: 1900 KB
// 1.快捷求 LCM， 2.遍历从 sqrt(x) 到 1，只要有一个成功，那么 Max(i, x/i) 必然是最大值，直接return.
// T:O(sqrt(n) * log(n)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1285C_Fadi_and_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int sqrtX = (int) Math.sqrt(x);
        long retA = 1, retB = 1;
        for (long i = sqrtX; i >= 1; i--) {
            if (x % i == 0 && getLCM(i, x / i) == x) {
                retA = i;
                retB = x / i;
                break;
            }
        }

        System.out.println(retA + " " + retB);
    }

    private static long getLCM(long a, long b) {
        return a * (b / getGCD(a, b));
    }

    private static long getGCD(long a, long b) {
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
