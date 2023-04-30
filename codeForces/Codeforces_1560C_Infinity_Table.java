// AC: 280 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1560C_Infinity_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt(), sqrtK = (int) Math.sqrt(k), row, col;
            int left = k - sqrtK * sqrtK;
            if (left == 0) {
                row = sqrtK;
                col = 1;
            } else if (left <= sqrtK + 1) {
                row = left;
                col = sqrtK + 1;
            } else {
                row = sqrtK + 1;
                col = sqrtK + 1 - (left - sqrtK - 1);
            }

            System.out.println(row + " " + col);
        }
    }
}
