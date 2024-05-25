// AC: 718 ms 
// Memory: 1200 KB
// map.
// T:O(n), S:O(n)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_0037A_Towers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), maxOccurTime = 0;
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            record.merge(l, 1, Integer::sum);
        }
        for (int key : record.keySet()) {
            maxOccurTime = Math.max(maxOccurTime, record.get(key));
        }

        System.out.println(maxOccurTime + " " + record.size());
    }
}
