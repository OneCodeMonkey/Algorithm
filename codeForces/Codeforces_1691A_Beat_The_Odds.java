// AC: 326 ms 
// MEMORY: 0 KB
// Must be all the same parity.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1691A_Beat_The_Odds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt(), countOdd = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a % 2 == 1) {
                    countOdd++;
                }
            }
            if (countOdd == 0 || countOdd == n) {
                System.out.println(0);
            } else {
                System.out.println(Math.min(countOdd, n - countOdd));
            }
        }
    }
}
