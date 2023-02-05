// AC: 233 ms 
// Memory: 0 KB
// Greedy.
// T:O(sum(ni * logni)), S:O(max(ni * logni))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1629A_Download_More_RAM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[][] record = new int[n][2];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                record[j][0] = a;
            }

            for (int j = 0; j < n; j++) {
                int b = sc.nextInt();
                record[j][1] = b;
            }
            Arrays.sort(record, (a, b) -> (a[0] == b[0] ? (b[1] - a[1]) : (a[0] - b[0])));
            for (int[] item : record) {
                if (item[0] > k) {
                    break;
                }
                k += item[1];
            }

            System.out.println(k);
        }
    }
}
