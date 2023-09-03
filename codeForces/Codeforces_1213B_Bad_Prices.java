// AC: 358 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1213B_Bad_Prices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n], minVal = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int curMin = Integer.MAX_VALUE, ret = 0;
            for (int j = n - 1; j >= 0; j--) {
                curMin = Math.min(curMin, arr[j]);
                minVal[j] = curMin;
            }
            for (int j = 0; j < n; j++) {
                if (arr[j] > minVal[j]) {
                    ret++;
                }
            }

            System.out.println(ret);
        }
    }
}
