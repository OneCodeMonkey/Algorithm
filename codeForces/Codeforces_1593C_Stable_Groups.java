// Time: 890 ms 
// Memory: 6200 KB
// Sort & Greedy.
// T:O(n), S:O(n)
// 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1593C_Stable_Groups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong(), x = sc.nextLong(), ret = 0;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        List<Long> diffs = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            long diff = arr[i + 1] - arr[i];
            if (diff > x) {
                diffs.add(diff);
            }
        }
        if (diffs.size() > 0) {
            Collections.sort(diffs);
            for (long diff : diffs) {
                long extra = (diff % x == 0 ? diff / x : (diff / x + 1)) - 1;
                if (extra <= k) {
                    k -= extra;
                } else {
                    ret++;
                }
            }
        }

        System.out.println(ret + 1);
    }
}
