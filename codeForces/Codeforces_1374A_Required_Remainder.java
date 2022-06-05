// AC: 717 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1374A_Required_Remainder {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt();
            int m = (n / x) * x;
            System.out.println(m == 0 ? y : (m + y > n ? m - x + y : m + y));
        }
    }
}
