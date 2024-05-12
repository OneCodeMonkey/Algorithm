// AC: 343 ms 
// Memory: 6300 KB
// Notice: 1. The answer could be 10^5 * (10^5 + 1), which overflow Integer range.
//         2. Using prefix sum solution, we use a trick, to minus each element with 1, then check sum 0 occurrence.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1398C_Good_Subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), cur = 0;
            long ret = 0;
            String s = sc.next();
            HashMap<Integer, Integer> sumToCount = new HashMap<>();
            sumToCount.put(0, 1);
            for (char c : s.toCharArray()) {
                int digit = Integer.parseInt(String.valueOf(c)) - 1;
                cur += digit;
                if (sumToCount.containsKey(cur)) {
                    ret += sumToCount.get(cur);
                }
                sumToCount.merge(cur, 1, Integer::sum);
            }

            System.out.println(ret);
        }
    }
}
