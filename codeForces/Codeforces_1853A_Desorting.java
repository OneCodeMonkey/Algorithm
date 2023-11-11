// AC: 187 ms 
// Memory: 0 KB
// Check if it is sorted, otherwise find the smallest increasing pair diff.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1853A_Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), prev = -1, minIncrDiff = Integer.MAX_VALUE;
            boolean hasDecrease = false;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (prev == -1) {
                    prev = a;
                    continue;
                }
                if (hasDecrease) {
                    continue;
                }
                if (a < prev) {
                    hasDecrease = true;
                } else {
                    minIncrDiff = Math.min(minIncrDiff, a - prev);
                }
                prev = a;
            }
            System.out.println(hasDecrease ? 0 : minIncrDiff / 2 + 1);
        }
    }
}
