// AC: 217 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1542A_Odd_Set {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), oddCount = 0, evenCount = 0;
            for (int j = 0; j < 2 * n; j++) {
                int a = sc.nextInt();
                if (a % 2 == 1) {
                    oddCount++;
                }
                if (a % 2 == 0) {
                    evenCount++;
                }
            }

            System.out.println(oddCount == evenCount ? "YES" : "NO");
        }
    }
}
