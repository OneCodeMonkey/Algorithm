// Time: 374 ms 
// Memory: 900 KB
// 注意：polygons 是多边形，不是矩形。
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1957A_Stickogon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            HashMap<Integer, Integer> record = new HashMap<>();
            for (int j = 0; j < n; j++) {
                record.merge(sc.nextInt(), 1, Integer::sum);
            }
            for (int key : record.keySet()) {
                ret += record.get(key) / 3;
            }

            System.out.println(ret);
        }
    }
}
