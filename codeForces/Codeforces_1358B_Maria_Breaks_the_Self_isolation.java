// AC: 499 ms 
// Memory: 6700 KB
// Sort and greedy.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1358B_Maria_Breaks_the_Self_isolation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 1;
            Integer[] arr = new Integer[n];
            HashMap<Integer, Integer> record = new HashMap<>(), countSum = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arr[j] = a;
                record.merge(a, 1, Integer::sum);
            }
            Arrays.sort(arr);
            int curCount = 0;
            for (int j = 0; j < n; j++) {
                curCount += record.get(arr[j]);
                countSum.put(arr[j], curCount);
                j += record.get(arr[j]) - 1;
            }
            for (int j = n - 1; j >= 0; j--) {
                int count = countSum.get(arr[j]);
                if (count >= arr[j]) {
                    ret = count + 1;
                    break;
                } else {
                    j -= record.get(arr[j]) - 1;
                }
            }

            System.out.println(ret);
        }
    }
}
