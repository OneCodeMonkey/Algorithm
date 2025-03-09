// Time: 780 ms 
// Memory: 16400 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_2060C_Game_of_Mathletes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), ret = 0;
            HashMap<Integer, Integer> record = new HashMap<>();
            for (int j = 0; j < n; j++) {
                record.merge(sc.nextInt(), 1, Integer::sum);
            }
            for (int key : record.keySet()) {
                if (key >= k) {
                    continue;
                }
                if (record.containsKey(k - key)) {
                    ret += Math.min(record.get(key), record.get(k - key));
                }
            }

            System.out.println(ret / 2);
        }
    }
}
