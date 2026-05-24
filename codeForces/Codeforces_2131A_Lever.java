// Time: 468 ms 
// Memory: 1000 KB
// When no a[i] > b[i], the iteration stop, and one round you can only decrease single a[i] by 1, so sum the diff "a[i] - b[i]".
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_2131A_Lever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n], b = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                b[j] = sc.nextInt();
            }
            int ret = 1;
            for (int j = 0; j < n; j++) {
                if (a[j] > b[j]) {
                    ret += a[j] - b[j];
                }
            }

            System.out.println(ret);
        }
    }
}
