// AC: 358 ms 
// Memory: 900 KB
// Just assure the first element is the smallest of the permutation.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1896A_Jagged_Swaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), start = 0;
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (!flag) {
                    continue;
                }
                if (j == 0) {
                    start = a;
                } else {
                    if (a < start) {
                        flag = false;
                    }
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
