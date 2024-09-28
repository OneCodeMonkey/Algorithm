// AC: 514 ms 
// Memory: 1400 KB
// Math: 先排序，与原数组对比，所有不能被最小数整除，且位置上不相等的元素，都是不能通过操作来调换位置的，那么结果是 false.
// T:O(sum(ni * logni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1401C_Mere_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), minVal = Integer.MAX_VALUE, prev = -1;
            int[] arr = new int[n];
            boolean isSorted = true;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                minVal = Math.min(minVal, a);
                arr[j] = a;
                if (isSorted && j >= 1 && a < prev) {
                    isSorted = false;
                }
                prev = a;
            }
            boolean ret = true;
            if (minVal > 1 && !isSorted) {
                int[] copy = new int[n];
                System.arraycopy(arr, 0, copy, 0, n);
                Arrays.sort(copy);
                for (int j = 0; j < n; j++) {
                    if (arr[j] % minVal != 0 && arr[j] != copy[j]) {
                        ret = false;
                        break;
                    }
                }
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
