// AC: Time: 374 ms 
// Memory: 0 KB
// 
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_318A_Even_Odds {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong(), k = sc.nextLong(), ret = 0;
        if (n % 2 == 0) {
            ret = (k <= n / 2) ? 2 * k - 1 : (k - n / 2) * 2;
        } else {
            ret = (k <= n / 2 + 1) ? 2 * k - 1 : (k - n / 2 - 1) * 2;
        }
        System.out.println(ret);
    }
}
