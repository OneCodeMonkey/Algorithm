// AC: 187 ms 
// Memory: 0 KB
// the number of operations is [ceil(n/2), n], so find k*m in this range.
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_476A_Dreamoon_and_Stairs {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        if (m > n) {
            System.out.println(-1);
        } else {
            for (int i = (int) Math.ceil(n / 2.0); i <= n; i++) {
                if (i % m == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
