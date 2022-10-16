// AC: 545 ms 
// Memory: 0 KB
// greedy
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1343C_Alternating_Subsequence {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), curMax = Integer.MIN_VALUE, curSign = -2;
            long sum = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (curSign == -2) {
                    curSign = a > 0 ? 1 : -1;
                    curMax = a;
                } else {
                    if (a > 0) {
                        if (curSign > 0) {
                            curMax = Math.max(curMax, a);
                        } else {
                            sum += curMax;
                            curSign = 1;
                            curMax = a;
                        }
                    } else {
                        if (curSign < 0) {
                            curMax = Math.max(curMax, a);
                        } else {
                            sum += curMax;
                            curSign = -1;
                            curMax = a;
                        }
                    }
                }
                if (j == n - 1) {
                    sum += curMax;
                }
            }

            System.out.println(sum);
        }
    }
}
