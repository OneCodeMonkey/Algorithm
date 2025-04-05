// Time: 265 ms 
// Memory: 800 KB
// brute-force.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1904A_Forked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(),
                    y2 = sc.nextInt(), ret = 0;
            int[][] moves;
            if (a == b) {
                moves = new int[][]{
                        new int[]{a, b},
                        new int[]{a, -b},
                        new int[]{-a, b},
                        new int[]{-a, -b}
                };
            } else {
                moves = new int[][]{
                        new int[]{a, b},
                        new int[]{a, -b},
                        new int[]{-a, b},
                        new int[]{-a, -b},
                        new int[]{b, a},
                        new int[]{b, -a},
                        new int[]{-b, a},
                        new int[]{-b, -a}
                };
            }
            for (int[] move : moves) {
                int x0 = move[0] + x1, y0 = move[1] + y1, xDiff = Math.abs(x0 - x2), yDiff = Math.abs(y0 - y2);
                if ((xDiff == a && yDiff == b) || (xDiff == b && yDiff == a)) {
                    ret++;
                }
            }

            System.out.println(ret);
        }
    }
}
