// AC: 327 ms 
// Memory: 0 KB
// dp: see the regularity we can know dp[n] = dp[n-1]+1.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1339A_Filling_Diamonds {
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int t = SC.nextInt();
        for (int i = 0; i < t; i++) {
            int n = SC.nextInt();
            System.out.println(n);
        }
    }
}
