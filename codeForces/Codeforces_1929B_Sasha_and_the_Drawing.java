// AC: 312 ms 
// Memory: 1000 KB
// Geometry.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1929B_Sasha_and_the_Drawing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), ret = 0;
            if (k <= 4 * n - 4) {
                ret = k % 2 == 0 ? k / 2 : (k / 2 + 1);
            } else if (k <= 4 * n - 3) {
                ret = 2 * n - 1;
            } else {
                ret = 2 * n;
            }

            System.out.println(ret);
        }
    }
}
