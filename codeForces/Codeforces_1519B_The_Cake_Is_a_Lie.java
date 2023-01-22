// AC: 342 ms 
// Memory: 0 KB
// Any path cost is n * m - 1.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1519B_The_Cake_Is_a_Lie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            System.out.println(n * m - 1 == k ? "YES" : "NO");
        }
    }
}
