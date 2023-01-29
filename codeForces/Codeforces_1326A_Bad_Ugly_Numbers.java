// AC: 592 ms 
// Memory: 0 KB
// Constructive.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1326A_Bad_Ugly_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            if (n <= 1) {
                System.out.println(-1);
            } else {
                System.out.print(n % 3 == 1 ? 4 : 2);
                for (int j = 1; j < n - 1; j++) {
                    System.out.print(2);
                }
                System.out.print(3);
                System.out.println();
            }
        }
    }
}
