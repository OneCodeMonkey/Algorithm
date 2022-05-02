// AC: Time: 202 ms 
// Memory: 0 KB
// sort
// T:O(nlogn), S:O(n)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_492B_Vanya_and_Lanterns {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), l = sc.nextInt(), pos = 0;
        double ret = 0;
        int[] record = new int[n];
        for (int i = 0; i < n; i++) {
            record[pos++] = sc.nextInt();
        }
        Arrays.sort(record);
        ret = Math.max(ret, record[0]);
        for (int i = 1; i < n; i++) {
            ret = Math.max(ret, (record[i] - record[i - 1]) * 1.0 / 2);
        }
        ret = Math.max(ret, l - record[n - 1]);

        System.out.println(ret);
    }
}
