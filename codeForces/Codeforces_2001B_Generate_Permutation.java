// Time: 749 ms 
// Memory: 800 KB
// Constructive: 构造对称.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_2001B_Generate_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println(-1);
            } else {
                int[] ret = new int[n];
                ret[n / 2] = 1;
                int direction = 1, pos = 1;
                for (int j = 1; j <= n / 2; j++) {
                    if (direction == 1) {
                        ret[n / 2 + j] = pos + 1;
                        ret[n / 2 - j] = pos + 2;
                        pos += 2;
                        direction = -1;
                    } else {
                        ret[n / 2 - j] = pos + 1;
                        ret[n / 2 + j] = pos + 2;
                        pos += 2;
                        direction = 1;
                    }
                }
                for (int j = 0; j < n; j++) {
                    System.out.print(ret[j]);
                    if (j != n - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
