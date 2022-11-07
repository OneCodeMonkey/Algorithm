// AC: 467 ms 
// Memory: 11200 KB
// hashmap
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1335C_Two_Teams_Composing {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            if (n > 1) {
                HashMap<Integer, Integer> count = new HashMap<>();
                for (int j = 0; j < n; j++) {
                    count.merge(sc.nextInt(), 1, Integer::sum);
                }
                if (count.size() == 1) {
                    ret = 1;
                } else {
                    int maxCount = 0;
                    for (int j : count.keySet()) {
                        maxCount = Math.max(maxCount, count.get(j));
                    }
                    ret = Math.min(maxCount, count.size() - 1);
                    if (maxCount - (count.size() - 1) >= 2) {
                        ret += 1;
                    }
                }
            } else {
                sc.nextInt();
            }
            System.out.println(ret);
        }
    }
}
