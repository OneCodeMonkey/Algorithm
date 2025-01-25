// Time: 421 ms 
// Memory: 1100 KB
// Constructive.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1794B_Not_Dividing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), prev = -1;
            StringBuilder ret = new StringBuilder();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a == 1) {
                    a = 2;
                }
                if (prev != -1 && a >= prev && a % prev == 0) {
                    a++;
                }
                ret.append(a);
                prev = a;
                if (j != n - 1) {
                    ret.append(" ");
                }
            }

            System.out.println(ret);
        }
    }
}
