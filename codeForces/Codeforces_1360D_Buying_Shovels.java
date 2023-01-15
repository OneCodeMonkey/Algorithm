// AC: 233 ms 
// Memory: 0 KB
// Math.
// T:O(sum(sqrt(n))), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1360D_Buying_Shovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), ret = n;
            if (n <= k) {
                ret = 1;
            } else {
                for (int j = 1; j <= (int) Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        if ((n / j) <= k) {
                            ret = j;
                            break;
                        } else if (j <= k) {
                            ret = Math.min(ret, n / j);
                        }
                    }
                }
            }

            System.out.println(ret);
        }
    }
}
