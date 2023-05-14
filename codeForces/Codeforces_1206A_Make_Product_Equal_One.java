// AC: 327 ms 
// Memory: 0 KB
// DP. Notice: Integer overflow, using long type
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_1206A_Make_Product_Equal_One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dpOne = new long[n + 1], dpNegaOne = new long[n + 1];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (i == 0) {
                dpOne[i + 1] = Math.abs(1 - a);
                dpNegaOne[i + 1] = Math.abs(-1 - a);
            } else {
                dpOne[i + 1] = Math.min(dpOne[i] + Math.abs(1 - a), dpNegaOne[i] + Math.abs(-1 - a));
                dpNegaOne[i + 1] = Math.min(dpOne[i] + Math.abs(-1 - a), dpNegaOne[i] + Math.abs(1 - a));
            }
        }

        System.out.println(dpOne[n]);
    }
}
