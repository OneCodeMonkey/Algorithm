// AC: 358 ms 
// Memory: 1400 KB
// Geometry: must be 2 * i^2 or 4 * i^2.
// T:O(sum(logni)), S:O(1)
//
import java.util.Scanner;

public class Codeforces_1515B_Phoenix_and_Puzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            boolean flag = false;
            if (n > 1 && n % 2 == 0) {
                int sqrtN = (int) Math.sqrt(n / 2);
                flag = sqrtN * sqrtN == n / 2;

                if (!flag && n % 4 == 0) {
                    sqrtN = (int) Math.sqrt(n / 4);
                    flag = sqrtN * sqrtN == n / 4;
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
