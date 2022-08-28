// AC: 496 ms 
// Memory: 0 KB
// math.
// T: ?, S:O(1)
// 
import java.util.Scanner;

public class Codeforces_80A_Panoramix_s_Prediction {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        if (n == 2) {
            System.out.println(m == 3 ? "YES" : "NO");
        } else {
            for (int i = n + 2; i < Integer.MAX_VALUE; i++) {
                if (isPrime(i)) {
                    System.out.println(i == m ? "YES" : "NO");
                    return;
                }
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 2) {
            return n == 2;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
