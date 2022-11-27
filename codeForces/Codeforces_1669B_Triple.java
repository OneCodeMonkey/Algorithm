// AC: 639 ms 
// Memory: 3900 KB
// hashmap
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1669B_Triple {
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int t = SC.nextInt();
        for (int i = 0; i < t; i++) {
            int n = SC.nextInt(), ret = -1;
            HashMap<Integer, Integer> record = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int a = SC.nextInt();
                if (ret == -1) {
                    if (record.containsKey(a) && record.get(a) >= 2) {
                        ret = a;
                    }
                    record.merge(a, 1, Integer::sum);
                }
            }
            System.out.println(ret);
        }
    }
}
