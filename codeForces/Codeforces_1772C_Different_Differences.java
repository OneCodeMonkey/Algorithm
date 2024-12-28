// Time: 265 ms
// Memory: 1100 KB
// .
// T:O(sum(k)), S:O(max(k))
// 
import java.util.Scanner;

public class Codeforces_1772C_Different_Differences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt(), n = sc.nextInt(), cur = 1, curDiff = 1;
            StringBuilder ret = new StringBuilder();
            while (cur <= n) {
                ret.append(cur);
                if (cur >= n) {
                    break;
                }
                k--;
                if (n - cur == k) {
                    cur++;
                } else {
                    if (n - cur - curDiff < k - 1) {
                        cur++;
                    } else {
                        if (cur + curDiff <= n) {
                            cur += curDiff;
                        } else {
                            cur = n;
                        }
                        curDiff++;
                    }
                }
                if (k == 0) {
                    break;
                }
                ret.append(" ");
            }

            System.out.println(ret);
        }
    }
}
