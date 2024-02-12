// AC: 264 ms 
// Memory: 300 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1882A_Increasing_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] record = new int[n], ret = new int[n];
            for (int j = 0; j < n; j++) {
                record[j] = sc.nextInt();
            }
            int prev = 0;
            for (int j = 0; j < n; j++) {
                prev++;
                while (prev == record[j]) {
                    prev++;
                }
                ret[j] = prev;
            }

            System.out.println(ret[n - 1]);
        }
    }
}
