// AC: 311 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1650B_DIV_plus_MOD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt(), r = sc.nextInt(), a = sc.nextInt(), ret = 0;
            if (a == 1) {
                ret = r;
            } else if (l == r) {
                ret = r / a + r % a;
            } else {
                if (r % a == 0) {
                    ret = r / a - 1 + a - 1;
                } else {
                    if (r < a) {
                        ret = r;
                    } else {
                        if (l <= r / a * a - 1) {
                            ret = Math.max(r / a + r % a, r / a - 1 + a - 1);
                        } else {
                            ret = r / a + r % a;
                        }
                    }
                }
            }
            System.out.println(ret);
        }
    }
}
