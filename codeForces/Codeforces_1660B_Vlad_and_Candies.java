// AC: 529 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
//
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1660B_Vlad_and_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), ret = 0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] record = new int[n];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                record[j] = a;
            }
            Arrays.sort(record);

            if (n == 1) {
                System.out.println(record[0] >= 2 ? "NO" : "YES");
            } else {
                System.out.println(record[n - 1] - record[n - 2] >= 2 ? "NO" : "YES");
            }
        }
    }
}
