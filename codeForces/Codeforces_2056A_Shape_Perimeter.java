// Time: 499 ms 
// Memory: 700 KB
// Geometry.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2056A_Shape_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), ret = 0;
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt(), y = sc.nextInt();
                if (j == 0) {
                    ret += 4 * m;
                } else {
                    ret += 4 * m;
                    if (x <= m && y <= m) {
                        ret -= 2 * (m - x) + 2 * (m - y);
                    }
                }
            }

            System.out.println(ret);
        }
    }
}
