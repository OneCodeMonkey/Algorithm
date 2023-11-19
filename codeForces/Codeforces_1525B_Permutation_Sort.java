// AC: 311 ms 
// Memory: 0 KB
// Greedy: If first element is 1 or last element is N, then we need most 1 operation is ok.
// If first element is N and last element is 1, since we cannot operate whole array in one operation, we need 3 times to reach the result.
// Otherwise if it's not well sorted, we need 2 operations.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1525B_Permutation_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), first = -1, last = -1, prev = -1, ret = 0;
            boolean isStrictIncr = true;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (j == 0) {
                    first = a;
                } else {
                    if (j == n - 1) {
                        last = a;
                    }
                    if (isStrictIncr && a <= prev) {
                        isStrictIncr = false;
                    }
                }
                prev = a;
            }
            if (!isStrictIncr) {
                if (first == 1 || last == n) {
                    ret = 1;
                } else if (first == n && last == 1) {
                    ret = 3;
                } else {
                    ret = 2;
                }
            }

            System.out.println(ret);
        }
    }
}
