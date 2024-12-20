// Time: 374 ms 
// Memory: 700 KB
// Combinatorics.
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1674C_Infinite_Replacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next(), t = sc.next();
            long ret = 0;
            if (t.contains("a")) {
                if (t.length() > 1) {
                    ret = -1;
                } else {
                    ret = 1;
                }
            } else {
                ret = (long) Math.pow(2, s.length());
            }

            System.out.println(ret);
        }
    }
}
