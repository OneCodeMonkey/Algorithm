// AC: 327 ms 
// Memory: 0 KB
// Constructive.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1914B_Preparing_for_the_Contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), cur = n;
            StringBuilder ret = new StringBuilder();
            for (int j = 0; j < n - k - 1; j++) {
                ret.append(cur--);
                ret.append(" ");
            }
            ret.append(1);
            if (k != 0) {
                ret.append(" ");
            }
            cur = 2;
            for (int j = 0; j < k; j++) {
                ret.append(cur++);
                if (j != k - 1) {
                    ret.append(" ");
                }
            }

            System.out.println(ret);
        }
    }
}
