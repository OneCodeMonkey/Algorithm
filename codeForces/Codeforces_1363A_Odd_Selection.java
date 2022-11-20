// Time: 296 ms 
// Memory: 0 KB
// math.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1363A_Odd_Selection {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), x = sc.nextInt(), countEven = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                countEven += a % 2 == 0 ? 1 : 0;
            }
            if (countEven == n) {
                System.out.println("NO");
            } else if (countEven >= x - 1) {
                System.out.println("YES");
            } else {
                if ((x - 1) % 2 == 0) {
                    System.out.println(((n - countEven - 1) / 2 * 2 + countEven >= x - 1) ? "YES" : "NO");
                } else {
                    System.out.println((countEven > 0 && ((n - countEven - 1) / 2 * 2 + countEven - 1 >= x - 2)) ? "YES" : "NO");
                }
            }
        }
    }
}
