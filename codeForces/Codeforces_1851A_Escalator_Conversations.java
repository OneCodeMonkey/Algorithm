// AC: 296 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1851A_Escalator_Conversations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt(), H = sc.nextInt(), ret = 0;
            for (int j = 0; j < n; j++) {
                int h = sc.nextInt();
                if (H != h && (H - h) % k == 0 && Math.abs(H - h) / k <= m - 1) {
                    ret++;
                }
            }

            System.out.println(ret);
        }
    }
}
