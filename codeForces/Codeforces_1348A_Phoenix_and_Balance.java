// AC: 171 ms 
// Memory: 0 KB
// .
// T:O(t * n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_1348A_Phoenix_and_Balance {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        int[] powValue = new int[31];
        int exp, base = 1;
        for (exp = 0; exp <= 30; exp++) {
            powValue[exp] = base;
            base *= 2;
        }
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = powValue[n];
            for (int j = 1; j <= n / 2 - 1; j++) {
                ret += powValue[j];
            }
            for (int j = n / 2; j < n; j++) {
                ret -= powValue[j];
            }
            System.out.println(ret);
        }
    }
}
