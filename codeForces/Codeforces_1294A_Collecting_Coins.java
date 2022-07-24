// AC: 296 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1294A_Collecting_Coins {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), n = sc.nextInt();
            if ((a + b + c + n) % 3 == 0) {
                int avg = (a + b + c + n) / 3;
                if (avg >= a && avg >= b && avg >= c) {
                    System.out.println("YES");
                    continue;
                }
            }
            System.out.println("NO");
        }
    }
}
