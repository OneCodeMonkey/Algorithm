// AC: 187 ms 
// Memory: 0 KB
// brute-force
// T:O(sum(log(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1368A_C_plus_equal {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
            int ret = 0;
            while (a <= n && b <= n) {
                if (a >= b) {
                    b += a;
                } else {
                    a += b;
                }
                ret++;
            }
            System.out.println(ret);
        }

    }
}
