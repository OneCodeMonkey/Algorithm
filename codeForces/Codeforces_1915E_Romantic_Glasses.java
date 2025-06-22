// Time: 921 ms 
// Memory: 14700 KB
// Prefix sum | dp.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1915E_Romantic_Glasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            HashMap<Long, Boolean> record = new HashMap<>();
            record.put(0L, true);
            long sumEven = 0, sumOdd = 0;
            boolean ret = false;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (ret) {
                    continue;
                }
                if ((j & 1) == 0) {
                    sumOdd += a;
                } else {
                    sumEven += a;
                }
                if (record.containsKey(sumOdd - sumEven)) {
                    ret = true;
                }
                record.put(sumOdd - sumEven, true);
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
