// AC: 186 ms 
// Memory: 0 KB
// When n is even, then always f(n) = 2. 
// Otherwise when n is odd, find the smallest factor(>1), and then (k - 1) times add 2.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1350A_Orac_and_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), ret = n;
            if (n % 2 == 0) {
                ret += 2 * k;
            } else {
                int factor = 0;
                for (int j = 3; j <= n; j += 2) {
                    if (n % j == 0) {
                        factor = j;
                        break;
                    }
                }
                ret += factor;
                ret += 2 * (k - 1);
            }

            System.out.println(ret);
        }
    }
}
