// AC: 888 ms 
// Memory: 5500 KB
// TreeMap || sort.
// T:O(n), S:O(n)
// 
import java.util.Scanner;
import java.util.TreeMap;

public class Codeforces_0977C_Less_or_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), curRank = 0;
        TreeMap<Integer, Integer> record = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            record.merge(sc.nextInt(), 1, Integer::sum);
        }
        for (int key : record.keySet()) {
            if (k == 0) {
                if (key <= 1) {
                    System.out.println("-1");
                    return;
                } else {
                    System.out.println(key - 1);
                    return;
                }
            } else {
                curRank += record.get(key);
                if (curRank == k) {
                    System.out.println(key);
                    return;
                } else if (curRank > k) {
                    System.out.println("-1");
                    return;
                }
            }
        }

        System.out.println("-1");
    }
}
