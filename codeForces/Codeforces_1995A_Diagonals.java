// AC: 249 ms 
// Memory: 800 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1995A_Diagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), step = n, ret = 0;
            for (int j = 0; j < 2 * n && k > 0; j++) {
                if (j > 0) {
                    step = n - (j + 1) / 2;
                }
                k -= step;
                ret++;
            }

            System.out.println(ret);
        }
    }
}
