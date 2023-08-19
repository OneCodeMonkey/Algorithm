// AC: 436 ms 
// Memory: 0 KB
// Math.
// T:O(n^2), S:O(k)
// 
import java.util.Scanner;

public class Codeforces_0026A_Almost_Prime {
    private static int maxN = 3000;
    private static boolean[] primes = new boolean[maxN + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ret = 0;
        initPrimes();
        for (int i = 6; i <= n; i++) {
            int countPrimeDividor = 0;
            boolean flag = true;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && primes[j]) {
                    countPrimeDividor++;
                    if (countPrimeDividor > 2) {
                        flag = false;
                        break;
                    }
                }
            }
            if (countPrimeDividor != 2) {
                flag = false;
            }
            if (flag) {
                ret++;
            }
        }

        System.out.println(ret);
    }

    // Euler prime filtering algo.
    private static void initPrimes() {
        for (int i = 2; i <= maxN; i++) {
            primes[i] = true;
        }
        for (int i = 2; i <= maxN; i++) {
            if (primes[i]) {
                for (int j = 2 * i; j <= maxN; j += i) {
                    primes[j] = false;
                }
            }
        }
    }
}
