// AC: 327 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1690D_Black_and_White_Stripe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), ret = Integer.MAX_VALUE, cur = 0;
            String s = sc.next();
            for (int j = 0; j < k; j++) {
                if (s.charAt(j) == 'W') {
                    cur++;
                }
            }
            ret = Math.min(ret, cur);
            if (ret > 0) {
                for (int j = k; j < n; j++) {
                    if (s.charAt(j) == 'W') {
                        cur++;
                    }
                    if (s.charAt(j - k) == 'W') {
                        cur--;
                    }
                    ret = Math.min(ret, cur);
                    if (ret == 0) {
                        break;
                    }
                }
            }
            System.out.println(ret);
        }
    }
}
