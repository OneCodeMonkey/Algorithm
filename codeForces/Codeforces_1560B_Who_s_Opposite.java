// AC: 295 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1560B_Who_s_Opposite {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int circleLen = 2 * Math.abs(a - b);
            if (a < 1 || b < 1 || c < 1 || a > circleLen || b > circleLen || c > circleLen) {
                System.out.println(-1);
            } else {
                System.out.println(c <= circleLen / 2 ? c + circleLen / 2 : c - circleLen / 2);
            }
        }
    }
}
