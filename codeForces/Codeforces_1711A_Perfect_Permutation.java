// AC: 296 ms 
// Memory: 0 KB
// Constructive.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1711A_Perfect_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            StringBuilder ret = new StringBuilder();
            if (n % 2 == 1) {
                ret.append(1);
                for (int j = 2; j <= n; j++) {
                    ret.append(" ");
                    if (j % 2 == 0) {
                        ret.append(j + 1);
                    } else {
                        ret.append(j - 1);
                    }
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j % 2 == 1) {
                        ret.append(j + 1);
                    } else {
                        ret.append(j - 1);
                    }
                    if (j != n) {
                        ret.append(" ");
                    }
                }
            }

            System.out.println(ret);
        }
    }
}
