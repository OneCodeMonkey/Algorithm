// AC: 358 ms 
// Memory: 0 KB
// Hashmap.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1791D_Distinct_Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            String s = sc.next();
            HashMap<Character, Integer> record = new HashMap<>();
            for (int j = 0; j < s.length(); j++) {
                record.merge(s.charAt(j), 1, Integer::sum);
            }
            ret = record.size();
            if (record.size() == s.length() || record.size() == 26 * 2) {
                //
            } else {
                HashMap<Character, Integer> suffixRecord = new HashMap<>();
                for (int j = s.length() - 1; j >= 1; j--) {
                    char c = s.charAt(j);
                    suffixRecord.merge(c, 1, Integer::sum);
                    if (record.get(c) == 1) {
                        record.remove(c);
                    } else {
                        record.merge(c, -1, Integer::sum);
                    }
                    ret = Math.max(ret, record.size() + suffixRecord.size());
                    if (ret == s.length()) {
                        break;
                    }
                }
            }

            System.out.println(ret);
        }
    }
}
