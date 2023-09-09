// AC: 1028 ms 
// Memory: 4900 KB
// HashMap & Check from 3 ~ 2n-1, and check dividers.
// T:O(sum(ni * sqrt(ni))), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1541B_Pleasant_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            HashMap<Integer, Integer> valueToIndex = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                valueToIndex.put(a, j + 1);
            }
            for (int k = 3; k <= n + n - 1; k++) {
                int sqrtN = (int) Math.sqrt(k);
                for (int j = 1; j <= (sqrtN * sqrtN == k ? sqrtN - 1 : sqrtN); j++) {
                    if (k % j == 0 && valueToIndex.containsKey(j) && valueToIndex.containsKey(k / j) &&
                            (valueToIndex.get(j) + valueToIndex.get(k / j) == k)) {
                        ret++;
                    }
                }
            }

            System.out.println(ret);
        }
    }
}
