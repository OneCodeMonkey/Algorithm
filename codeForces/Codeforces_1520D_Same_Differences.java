// AC: 483 ms 
// Memory: 11300 KB
// count same diff of (value - index), elements with same diff can make n * (n-1)/2 pairs.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1520D_Same_Differences {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), pos = 0;
            HashMap<Integer, Integer> countDiff = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                pos++;
                countDiff.merge(a - pos, 1, Integer::sum);
            }
            long ret = 0;
            for (int diff : countDiff.keySet()) {
                int time = countDiff.get(diff);
                if (time > 1) {
                    ret += (long) time * (time - 1) / 2;
                }
            }
            System.out.println(ret);
        }
    }
}
