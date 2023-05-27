// AC: 202 ms 
// Memory: 0 KB 
// If the element is not on the last row or last column, then it can be 'R' or 'D', both are ok.
// T:O(m * n), S:O(m * n)
//
import java.util.Scanner;

public class Codeforces_1391B_Fix_You {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), ret = 0;
            String[] table = new String[n];
            for (int j = 0; j < n; j++) {
                String row = sc.next();
                table[j] = row;
            }
            for (int j = 0; j < m - 1; j++) {
                if (table[n - 1].charAt(j) != 'R') {
                    ret++;
                }
            }
            for (int j = 0; j < n - 1; j++) {
                if (table[j].charAt(m - 1) != 'D') {
                    ret++;
                }
            }

            System.out.println(ret);
        }
    }
}
