// AC: 312 ms 
// Memory: 1400 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1766A_Extremely_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            if (n < 10) {
                ret = n;
            } else if (n < 100) {
                ret = 9 + n / 10;
            } else if (n < 1000) {
                ret = 18 + n / 100;
            } else if (n < 10000) {
                ret = 27 + n / 1000;
            } else if (n < 100_000) {
                ret = 36 + n / 10_000;
            } else if (n < 1000_000) {
                ret = 45 + n / 100_000;
            } else if (n < 10_000_000) {
                ret = 54 + n / 1000_000;
            } else if (n < 100_000_000) {
                ret = 63 + n / 10_000_000;
            } else if (n < Integer.MAX_VALUE) {
                ret = 72 + n / 100_000_000;
            }

            System.out.println(ret);
        }
    }
}
