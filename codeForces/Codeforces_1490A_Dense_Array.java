// AC: 265 ms
// Memory: 0 KB
// Greedy.
// T:O(sum(n ~ nlogn)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1490A_Dense_Array {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), previous = -1, ret = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (previous == -1) {
                    previous = a;
                } else {
                    if (a > 2 * previous) {
                        ret += solve(previous, a);
                    } else if (2 * a < previous) {
                        ret += solve(a, previous);
                    }
                    previous = a;
                }
            }

            System.out.println(ret);
        }
    }

    private static int solve(int a, int b) {
        int ret = 0, cur = a;
        while (2 * cur < b) {
            cur *= 2;
            ret++;
        }

        return ret;
    }
}
