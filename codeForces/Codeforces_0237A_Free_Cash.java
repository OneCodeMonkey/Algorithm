// AC: 716 ms 
// Memory: 0 KB
// Find maximum same time occurrence
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0237A_Free_Cash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ret = 1, cur = 0, prevH = -1, prevM = -1;
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt(), m = sc.nextInt();
            if (h == prevH && m == prevM) {
                cur++;
                ret = Math.max(ret, cur);
            } else {
                cur = 1;
            }
            prevH = h;
            prevM = m;
        }

        System.out.println(ret);
    }
}
