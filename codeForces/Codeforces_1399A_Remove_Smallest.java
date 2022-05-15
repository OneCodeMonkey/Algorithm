// AC: 249 ms 
// Memory: 0 KB
// .
// T:O(sum(nlogn)), S:O(max(n))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1399A_Remove_Smallest {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), pos = 0;
            int[] record = new int[n];
            for (int j = 0; j < n; j++) {
                record[pos++] = sc.nextInt();
            }
            Arrays.sort(record);
            boolean flag = true;
            for (int j = 0; j < n - 1; j++) {
                if (record[j + 1] - record[j] > 1) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}
