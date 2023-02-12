// AC: 249 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1077A_Frog_Jumping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
            long ret = k / 2 * (long) (a - b);
            if (k % 2 == 1) {
                ret += a;
            }

            System.out.println(ret);
        }
    }
}
