// Time: 467 ms 
// Memory: 0 KB
// greedy.
// T:(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1690A_Print_a_Pedestal_Codeforces_logo {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt(), ret = 0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), h1, h2, h3;
            if (n < 6) {
                System.out.println("0 0 0");
                continue;
            }
            int mod = (n - 3) / 3, left = (n - 3) % 3;
            h1 = 2 + mod + (left >= 1 ? 1 : 0);
            h2 = 1 + mod + (left >= 2 ? 1 : 0);
            h3 = mod;
            System.out.printf("%d %d %d%n", h2, h1, h3);
        }
    }
}
