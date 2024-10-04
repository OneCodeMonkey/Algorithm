// AC: 343 ms 
// Memory: 600 KB
// Geometry.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1806A_Walking_Master {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            int ret = -1;
            if (b <= d && a + d - b >= c) {
                ret = d - b + (a + d - b - c);
            }

            System.out.println(ret);
        }
    }
}
