// Time: 780 ms 
// Memory: 1000 KB
// Greedy：注意当 n 为奇数时，最小的元素不能全部被 k 减掉，而要考虑和第二小的元素的差值。
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Codeforces_2004C_Splitting_Items {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            Integer[] arr = new Integer[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            long ret = 0, diff = 0;
            Arrays.sort(arr, Collections.reverseOrder());
            for (int j = 0; j < n / 2; j++) {
                ret += arr[j * 2] - arr[j * 2 + 1];
                diff += arr[j * 2] - arr[j * 2 + 1];
            }
            if (n % 2 == 1) {
                ret += arr[n - 1];
            }
            ret = ret - Math.min(diff, k);

            System.out.println(ret);
        }
    }
}
