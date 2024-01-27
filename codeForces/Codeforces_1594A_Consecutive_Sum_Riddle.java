// AC: 389 ms 
// Memory: 700 KB
// Tricky: use (1-n), (2-n), ...., n-1, n, such sequence sum is just n.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1594A_Consecutive_Sum_Riddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong(), l = 1 - n, r = n;

            System.out.println(l + " " + r);
        }
    }
}
