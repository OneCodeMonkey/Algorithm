// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_577A_Multiplication_Table {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextInt(), x = sc.nextInt();
        int ret = 0;
        if (n * n >= x) {
            int startRow = (int) (x / n);
            if (x % n == 0) {
                ret++;
            }
            for (int i = startRow + 1; i <= n; i++) {
                if (x % i == 0 && x <= i * n) {
                    ret++;
                }
            }
        }
        System.out.println(ret);
    }
}
