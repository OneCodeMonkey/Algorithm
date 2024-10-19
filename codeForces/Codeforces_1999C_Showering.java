// AC: 1015 ms 
// Memory: 700 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1999C_Showering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), s = sc.nextInt(), m = sc.nextInt(), prevR = 0;
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                int l = sc.nextInt(), r = sc.nextInt();
                if (flag) {
                    continue;
                }
                if (l - prevR >= s) {
                    flag = true;
                } else if (j == n - 1 && m - r >= s) {
                    flag = true;
                }
                prevR = r;
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
