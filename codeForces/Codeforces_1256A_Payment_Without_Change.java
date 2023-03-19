// AC: 342 ms 
// Memory: 0 KB
// .
// T:O(q), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1256A_Payment_Without_Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt(), s = sc.nextInt();
            boolean flag = false;
            if ((long) a * n + b >= s) {
                int k = s / n;
                if (s - k * n <= b) {
                    flag = true;
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
