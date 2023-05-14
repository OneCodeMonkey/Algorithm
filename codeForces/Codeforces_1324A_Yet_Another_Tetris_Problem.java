// AC: 217 ms 
// Memory: 0 KB
// Check if all elements have same parity.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1324A_Yet_Another_Tetris_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), oddCount = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a % 2 == 1) {
                    oddCount++;
                }
            }
            System.out.println((oddCount == 0 || oddCount == n) ? "YES" : "NO");
        }
    }
}
