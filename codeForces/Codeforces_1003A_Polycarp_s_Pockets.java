// AC: 202 ms 
// Memory: 0 KB
// hashmap.
// T:O(n), S:O(n)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1003A_Polycarp_s_Pockets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ret = 0;
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            record.merge(a, 1, Integer::sum);
        }
        for (int key : record.keySet()) {
            ret = Math.max(ret, record.get(key));
        }
        System.out.println(ret);
    }
}
