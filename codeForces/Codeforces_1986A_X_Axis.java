// AC: 249 ms 
// Memory: 1300 K
// Geometry.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1986A_X_Axis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x1 = sc.nextInt(), x2 = sc.nextInt(), x3 = sc.nextInt(), ret;
            ret = Math.max(Math.abs(x1 - x2), Math.abs(x1 - x3));
            ret = Math.max(ret, Math.abs(x2 - x3));

            System.out.println(ret);
        }
    }
}
