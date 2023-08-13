// AC: 1996 ms 
// Memory: 0 KB
// Prime filtering && cache
// T:O(sum(k * n)), S:O(N), 2 < k < 3, N = 1000_001
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_0230B_T_primes {
    private static boolean[] primeResult = new boolean[1000_001];
    private static HashMap<Long, Boolean> record = new HashMap<>();

    public static void main(String[] args) {
        initPrimeSet();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            boolean ret = false;
            long x = sc.nextLong();
            if (record.containsKey(x)) {
                ret = record.get(x);
            } else {
                long sqrtX = (long) Math.sqrt(x);
                if (sqrtX * sqrtX == x && primeResult[(int) sqrtX]) {
                    ret = true;
                }
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }

    // 素数筛
    private static void initPrimeSet() {
        int maxN = 1000_000;
        for (int i = 2; i <= maxN; i++) {
            primeResult[i] = true;
        }
        for (int i = 2; i <= maxN; i++) {
            if (primeResult[i]) {
                for (int j = 2 * i; j <= maxN; j += i) {
                    primeResult[j] = false;
                }
            }
        }
    }
}
