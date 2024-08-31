// AC: 453 ms 
// Memory: 1200 KB
// Greedy. Place every array's smallest elements into the array with smallest second small one.
// T:O(sum(mi)), S:O(max(mi))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1859B_Olya_and_Game_with_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), minSecondSmall = Integer.MAX_VALUE, minAmongAll = Integer.MAX_VALUE;
            long sum = 0;
            for (int j = 0; j < n; j++) {
                int m = sc.nextInt();
                int[] arr = new int[m];
                for (int k = 0; k < m; k++) {
                    int a = sc.nextInt();
                    arr[k] = a;
                }
                Arrays.sort(arr);
                sum += arr[1];
                minSecondSmall = Math.min(minSecondSmall, arr[1]);
                minAmongAll = Math.min(minAmongAll, arr[0]);
            }

            System.out.println(sum - (minSecondSmall - minAmongAll));
        }
    }
}
