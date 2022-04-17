// AC: Time: 404 ms 
// Memory: 0 KB
// greedy.
// T:O(n), S:O(n)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_230A_Dragons {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int s = sc.nextInt(), n = sc.nextInt(), pos = 0;
        int[][] record = new int[n][2];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            record[pos++] = new int[]{x, y};
        }
        Arrays.sort(record, (o1, o2) -> o1[0] - o2[0]);
        for (int[] item : record) {
            if (item[0] >= s) {
                System.out.println("NO");
                return;
            }
            s += item[1];
        }

        System.out.println("YES");
    }
}
