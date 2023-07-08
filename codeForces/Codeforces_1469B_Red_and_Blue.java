// AC: 374 ms 
// Memory: 100 KB
// .
// T:O(m + n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1469B_Red_and_Blue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0, maxPrefixSumN = 0, maxPrefixSumM = 0, sum = 0;
            for (int j = 0; j < n; j++) {
                int r = sc.nextInt();
                sum += r;
                maxPrefixSumN = Math.max(maxPrefixSumN, sum);
            }
            int m = sc.nextInt();
            sum = 0;
            for (int j = 0; j < m; j++) {
                int b = sc.nextInt();
                sum += b;
                maxPrefixSumM = Math.max(maxPrefixSumM, sum);
            }

            System.out.println(maxPrefixSumN + maxPrefixSumM);
        }
    }
}
