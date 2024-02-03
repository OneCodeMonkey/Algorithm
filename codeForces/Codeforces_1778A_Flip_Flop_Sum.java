// AC: 436 ms 
// Memory: 500 KB
// Can only flip once, so first find adjacent -1 pair, if not, check if has any -1, 
// if not, we have to conver "1 1" to "-1 -1", thus the sum will be minus by 4.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1778A_Flip_Flop_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), countNega = 0, sum = 0, prev = 0, ret = 0;
            boolean hasAdjacentNega = false;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a < 0) {
                    countNega++;
                }
                if (prev != 0) {
                    if (!hasAdjacentNega && a == -1 && prev == -1) {
                        hasAdjacentNega = true;
                    }
                }
                sum += a;
                prev = a;
            }
            if (countNega == 0) {
                ret = sum - 4;
            } else if (hasAdjacentNega) {
                ret = sum + 4;
            } else {
                ret = sum;
            }

            System.out.println(ret);
        }
    }
}
