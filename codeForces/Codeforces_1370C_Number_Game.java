// AC: 312 ms 
// Memory: 1300 KB
// Math: Check if the n >=4 and have even factor >= 4, and odd factor that is prime or not.
// See the codes.
// T:O(sqrt(max) + sum(logni)), S:O(sqrt(max))
// 
import java.util.Scanner;

public class Codeforces_1370C_Number_Game {
    private static int maxN = 32_000;
    private static boolean[] primes = new boolean[maxN + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // init primes in [2, 10000]
        initPrimes();

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            boolean firstPlayerWin = true;
            if (n == 1) {
                firstPlayerWin = false;
            } else if (n == 2) {
//                firstPlayerWin = true;
            } else {
                if (n % 2 == 0) {
                    int nCopy = n;
                    while (nCopy % 2 == 0) {
                        nCopy /= 2;
                    }
                    if (n % 4 == 0) {
                        if (nCopy == 1) {
                            firstPlayerWin = false;
                        }
                    } else {
                        // Check oddPart of n is a prime, if so, the first player can only divide this odd part and get 2, then he lose.
                        // if oddPart is not prime, and has a smallest prime divider k, then first divide oddPart with (oddPart / k), then
                        // the second player must divider with k or minus by 1, either are the second player lose.
                        if (nCopy <= maxN && primes[nCopy]) {
                            firstPlayerWin = false;
                        } else {
                            firstPlayerWin = false;
                            for (int j = 3; j <= (int) Math.sqrt(nCopy); j += 2) {
                                if (primes[j] && (nCopy % j == 0)) {
                                    firstPlayerWin = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }

            System.out.println(firstPlayerWin ? "Ashishgup" : "FastestFinger");
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
