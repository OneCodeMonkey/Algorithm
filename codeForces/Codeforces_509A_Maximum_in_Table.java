// AC: 187 ms 
// Memory: 0 KB
// brute-force
// T:O(n^2), S:O(n^2)
// 
import java.util.Scanner;

public class Codeforces_509A_Maximum_in_Table {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        long[][] record = new long[n][n];
        for (int i = 0; i < n; i++) {
            record[0][i] = 1;
        }
        for (int i = 1; i < n; i++) {
            record[i][0] = 1;
            for (int j = 1; j < n; j++) {
                record[i][j] = record[i - 1][j] + record[i][j - 1];
            }
        }
        System.out.println(record[n - 1][n - 1]);
    }
}
