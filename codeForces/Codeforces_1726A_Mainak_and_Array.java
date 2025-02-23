// Time: 328 ms 
// Memory: 1400 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1726A_Mainak_and_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int max1 = 0, min1 = Integer.MAX_VALUE, maxDiff = 0, ret = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arr[j] = a;
                if (j >= 1) {
                    max1 = Math.max(max1, a);
                    maxDiff = Math.max(maxDiff, Math.max(0, arr[j - 1] - a));
                }
                if (j < n - 1) {
                    min1 = Math.min(min1, a);
                }
            }
            if (n > 1) {
                // 3种情形：翻转 [2..n], 翻转 [1..n-1], 以及任意 arr[j] - arr[j+1] 或 arr[n-1]-arr[0]
                maxDiff = Math.max(maxDiff, Math.max(0, arr[n - 1] - arr[0]));
                ret = Math.max(maxDiff, max1 - arr[0]);
                ret = Math.max(ret, arr[n - 1] - min1);
            }
            System.out.println(ret);
        }
    }
}
