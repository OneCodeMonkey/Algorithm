// AC: 280 ms 
// Memory: 0 KB
// Math.
// T:O(sum(log ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0598A_Tricky_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), maxScore = 0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long sum = (long) n * (n + 1) / 2, ret = 0;
            int largestPower = findLargestPowerBelow(n);
            ret = sum - 2 * (2L * largestPower - 1);

            System.out.println(ret);
        }
    }

    private static int findLargestPowerBelow(int num) {
        int cur = 1, base = 2;
        for (int exp = 0; exp < 31; exp++) {
            if (num >= cur && num < cur * base) {
                return cur;
            }
            cur *= base;
        }

        return -1;
    }
}
