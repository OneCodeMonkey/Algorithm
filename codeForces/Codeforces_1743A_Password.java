// AC: 249 ms 
// Memory: 0 KB
// Combination.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1743A_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0, remain = 10 - n;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
            }
            ret = (remain * (remain - 1) / 2) * 6;
            System.out.println(ret);
        }
    }
}
