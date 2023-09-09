// AC: 358 ms 
// Memory: 0 KB
// Math: Find the largest two primes which great than or larger than 1 with d, the latter is great than or larger than the former with d, multiple them.
// T:O(t * k), S:O(k), k is 10000 which given.
// 
import java.util.Scanner;

public class Codeforces_1474B_Different_Divisors {
    public static int maxN = 40000;
    private static boolean[] primes = new boolean[maxN + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        initPrimes();
        for (int i = 0; i < t; i++) {
            int d = sc.nextInt(), primeGreatThanD = -1, primeGreatThanTwoD = -1;
            long ret = 0;
            for (int j = 2; j <= maxN; j++) {
                if (primes[j]) {
                    if (primeGreatThanD == -1 && j - 1 >= d) {
                        primeGreatThanD = j;
                    }
                    if (primeGreatThanD != -1 && j - primeGreatThanD >= d) {
                        primeGreatThanTwoD = j;
                        break;
                    }
                }
            }
            ret = (long) primeGreatThanD * primeGreatThanTwoD;

            System.out.println(ret);
        }
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
