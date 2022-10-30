// AC: 233 ms 
// Memory: 0 KB
// greedy, combination count
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_478B_Random_Teams {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        long min = 0, max = 0;
        if (n > m) {
            int mod = n / m, left = n % m;
            min = (long) left * (mod + 1) * (mod) / 2 + (long) (m - left) * mod * (mod - 1) / 2;
            max = (long) (n - m + 1) * (n - m) / 2;
        }
        System.out.println(min + " " + max);
    }
}
