// AC: 343 ms 
// Memory: 1200 KB
// .
// T:O(t), S:O(1)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1809A_Garland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            HashMap<Character, Integer> record = new HashMap<>();
            for (char c : s.toCharArray()) {
                record.merge(c, 1, Integer::sum);
            }
            if (record.size() == 1) {
                System.out.println(-1);
            } else {
                int maxOccur = 0, ret;
                for (char c : record.keySet()) {
                    maxOccur = Math.max(maxOccur, record.get(c));
                }
                if (maxOccur <= 2) {
                    ret = 4;
                } else {
                    ret = 6;
                }
                System.out.println(ret);
            }
        }
    }
}
