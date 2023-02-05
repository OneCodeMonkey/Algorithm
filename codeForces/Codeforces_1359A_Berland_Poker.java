// AC: 218 ms 
// Memory: 0 KB
// Math & Greedy.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1359A_Berland_Poker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt(), ret = 0;
            int single = n / k;
            if (single >= m) {
                ret = m;
            } else {
                int maxOther = (int) Math.ceil((m - single) * 1.0 / (k - 1));
                ret = single - maxOther;
            }

            System.out.println(ret);
        }
    }
}
