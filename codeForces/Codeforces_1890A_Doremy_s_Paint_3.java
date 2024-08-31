// AC: 311 ms 
// Memory: 1100 KB
// Greedy.
// T:O(sum(ni)), S:O(1)
// 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Codeforces_1890A_Doremy_s_Paint_3 {
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
            boolean ret = false;
            if (record.size() == 1) {
                ret = true;
            } else if (record.size() == 2) {
                Iterator<Integer> it = record.keySet().iterator();
                int num1 = record.get(it.next()), num2 = record.get(it.next());
                if (Math.abs(num1 - num2) <= 1) {
                    ret = true;
                }
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
