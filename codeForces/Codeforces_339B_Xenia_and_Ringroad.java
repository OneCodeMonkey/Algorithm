// AC: 560 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_339B_Xenia_and_Ringroad {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt(), cur = 1;
        long ret = 0;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            ret += a >= cur ? (a - cur) : (n + a - cur);
            cur = a;
        }
        System.out.println(ret);
    }
}
