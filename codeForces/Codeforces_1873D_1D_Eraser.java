// AC: 233 ms 
// Memory: 0 KB
// Greedy.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1873D_1D_Eraser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), ret = 0;
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == 'B') {
                    ret++;
                    j += k - 1;
                }
            }

            System.out.println(ret);
        }
    }
}
