// AC: Time: 374 ms 
// Memory: 0 KB
// hashmap
// T:O(n), S:O(n)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_268A_Games {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), ret = 0;
        HashMap<Integer, Integer> home = new HashMap<>();
        HashMap<Integer, Integer> guest = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            home.merge(a, 1, Integer::sum);
            guest.merge(b, 1, Integer::sum);
        }
        for (int a : home.keySet()) {
            if (guest.containsKey(a)) {
                ret += home.get(a) * guest.get(a);
            }
        }
        System.out.println(ret);
    }
}
