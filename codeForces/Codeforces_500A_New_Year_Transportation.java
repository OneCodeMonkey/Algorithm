// AC: 233 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_500A_New_Year_Transportation {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), t = sc.nextInt();
        int[] record = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            record[i] = sc.nextInt();
        }
        int cur = 1;
        while (true) {
            cur += record[cur - 1];
            if (cur == t) {
                System.out.println("YES");
                return;
            }
            if (cur >= n) {
                System.out.println("NO");
                return;
            }
        }
    }
}
