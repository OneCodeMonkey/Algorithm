// AC: 233 ms 
// Memory: 0 KB
// see the shape, you can not make 2 * n(n>2), or any edge > 2.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1345A_Puzzle_Pieces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt();
            boolean ret = (n == 1 || m == 1) || (n == 2 && m == 2);
            System.out.println(ret ? "YES" : "NO");
        }
    }
}
