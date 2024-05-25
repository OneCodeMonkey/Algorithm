// AC: 327 ms 
// Memory: 1100 KB
// Greedy.
// T:O(m + n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1206A_Choose_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max1 = 0, max2 = 0;
        for (int i = 0; i < n; i++) {
            max1 = Math.max(max1, sc.nextInt());
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            max2 = Math.max(max2, sc.nextInt());
        }

        System.out.println(max1 + " " + max2);
    }
}
