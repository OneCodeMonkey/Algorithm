// AC: 327 ms 
// Memory: 0 KB
// notice the long-int input
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1506A_Strange_Table {
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int t = SC.nextInt();
        for (int i = 0; i < t; i++) {
            int n = SC.nextInt(), m = SC.nextInt();
            long x = SC.nextLong(), row = x % n, col = row == 0 ? x / n : x / n + 1, ret = 0;
            ret = row == 0 ? (long) (n - 1) * m + col : (long) (row - 1) * m + col;
            System.out.println(ret);
        }
    }
}
