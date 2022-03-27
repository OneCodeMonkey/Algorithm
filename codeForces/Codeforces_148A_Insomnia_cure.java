// AC: Time: 374 ms 
// Memory: 0 KB
// 
// T:O(n), S:O(1)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_148A_Insomnia_cure {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int k = sc.nextInt(), l = sc.nextInt(), m = sc.nextInt(), n = sc.nextInt(), d = sc.nextInt(), ret = 0;
        for (int i = 1; i <= d; i++) {
            for (int j : Arrays.asList(k, l, m, n)) {
                if (j == 1) {
                    System.out.println(d);
                    return;
                }
                if (i % j == 0) {
                    ret++;
                    break;
                }
            }
        }
        System.out.println(ret);
    }
}
