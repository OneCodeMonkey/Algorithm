// AC: 1265 ms 
// Memory: 17700 KB
// Binary Search or Using Treemap collection.
// T:O(sum(ni + q * log(ni))), S:O(max(ni))
//
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Codeforces_1676E_Eating_Queries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), q = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int curSum = 0;
            TreeMap<Integer, Integer> record = new TreeMap<>();
            for (int j = n - 1; j >= 0; j--) {
                curSum += arr[j];
                record.put(curSum, n - j);
            }
            for (int j = 0; j < q; j++) {
                int x = sc.nextInt(), ret = -1;
                Integer targetSumKey = record.ceilingKey(x);
                if (targetSumKey != null) {
                    ret = record.get(targetSumKey);
                }
                System.out.println(ret);
            }
        }
    }
}
