// AC: 280 ms 
// Memory: 0 KB
// Geometry & Greedy.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1401A_Distance_and_Axis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), ret = 0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            if (k >= n) {
                ret = k - n;
            } else {
                ret = (n - k) % 2 == 0 ? 0 : 1;
            }

            System.out.println(ret);
        }
    }
}
