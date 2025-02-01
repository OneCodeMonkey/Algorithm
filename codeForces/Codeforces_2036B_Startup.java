// AC: 1264 ms 
// Memory: 15900 KB
// greedy.
// T:O(sum(nilogni)), S:O(max(ni))
// 
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Codeforces_2036B_Startup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), ret = 0;
            HashMap<Integer, Integer> typeToCost = new HashMap<>();
            for (int j = 0; j < k; j++) {
                int b = sc.nextInt(), c = sc.nextInt();
                typeToCost.merge(b, c, Integer::sum);
            }
            List<Integer> costs = new ArrayList<>(typeToCost.values());
            Collections.sort(costs, Collections.reverseOrder());
            for (int j = 0; j < Math.min(n, costs.size()); j++) {
                ret += costs.get(j);
            }

            System.out.println(ret);
        }
    }
}
