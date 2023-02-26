// AC: 717 ms 
// Memory: 29800 KB
// .
// T:O(sum(nilogni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Codeforces_1454B_Unique_Bid_Auction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        TreeMap<Integer, Integer> count = new TreeMap<>();
        HashMap<Integer, Integer> valueToIndex = new HashMap<>();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = -1;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                count.merge(a, 1, Integer::sum);
                valueToIndex.put(a, j + 1);
            }
            for (int key : count.keySet()) {
                if (count.get(key) == 1) {
                    ret = key;
                    break;
                }
            }

            System.out.println(ret == -1 ? -1 : valueToIndex.get(ret));

            count.clear();
            valueToIndex.clear();
        }
    }
}
