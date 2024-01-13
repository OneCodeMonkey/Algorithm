// AC: 234 ms 
// Memory: 0 KB
// Trick: if the Euclidean distance is integer, then one step can reach, otherwise just go (0, x1), and (x1, y1) two steps is ok.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1657A_Integer_Moves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), ret = 0;
            if (x != 0 || y != 0) {
                int sqrtVal = (int) Math.sqrt(x * x + y * y);
                if (x * x + y * y == sqrtVal * sqrtVal) {
                    ret = 1;
                } else {
                    ret = 2;
                }
            }
            System.out.println(ret);
        }
    }
}
