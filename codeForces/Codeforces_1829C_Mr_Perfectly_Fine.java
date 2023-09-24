// AC: 546 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1829C_Mr_Perfectly_Fine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = -1;
            HashMap<String, Integer> record = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int m = sc.nextInt();
                String s = sc.next();
                if (!record.containsKey(s) || record.get(s) > m) {
                    record.put(s, m);
                }
            }
            if (record.containsKey("01") && record.containsKey("10")) {
                ret = record.get("01") + record.get("10");
            }
            if (record.containsKey("11")) {
                if (ret != -1) {
                    ret = Math.min(ret, record.get("11"));
                } else {
                    ret = record.get("11");
                }
            }

            System.out.println(ret);
        }
    }
}
