// Time: 796 ms 
// Memory: 2400 KB
// Greedy.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1832C_Contrast_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), prev = -1, direction = 0, ret = 1;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (prev == -1) {
                    prev = a;
                    continue;
                }
                if (direction == 0) {
                    if (a > prev) {
                        direction = 1;
                    } else if (a < prev) {
                        direction = -1;
                    }
                } else if (direction == 1 && a < prev) {
                    ret++;
                    direction = -1;
                } else if (direction == -1 && a > prev) {
                    ret++;
                    direction = 1;
                }
                if (direction != 0 && j == n - 1) {
                    ret++;
                }
                prev = a;
            }

            System.out.println(ret);
        }
    }
}
