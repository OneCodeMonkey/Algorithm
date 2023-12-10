// AC: 327 ms 
// Memory: 0 KB
// The problem does not require subsegment length >= 2, so just check if k exists is enough.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1878A_How_Much_Does_Daytona_Cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            boolean ret = false;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (!ret && a == k) {
                    ret = true;
                }
            }
            System.out.println(ret ? "YES" : "NO");
        }
    }
}
