// AC: 592 ms 
// Memory: 0 KB
// The answer must appear in adjacent pairs.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1554A_Cherry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt(), prev = sc.nextInt();
            long ret = 0;
            for (int j = 1; j < n; j++) {
                int a = sc.nextInt();
                ret = Math.max(ret, (long) prev * a);
                prev = a;
            }

            System.out.println(ret);
        }
    }
}
