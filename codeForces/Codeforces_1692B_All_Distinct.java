// AC: 248 ms 
// Memory: 0 KB
// If the element time is odd, then can count is as 1. If the element time is even, 
// it dependes on how many element with even time, if it's odd, then can output the number of distinct numbers, else we should decrease the result by one.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1692B_All_Distinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> record = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                record.merge(a, 1, Integer::sum);
            }
            int countEven = 0;
            for (int item : record.keySet()) {
                if (record.get(item) % 2 == 0) {
                    countEven++;
                }
            }
            System.out.println(countEven % 2 == 1 ? record.size() - 1 : record.size());
        }
    }
}
