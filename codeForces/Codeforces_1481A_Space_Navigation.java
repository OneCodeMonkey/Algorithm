// AC: 218 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1481A_Space_Navigation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            String s = sc.next();
            HashMap<Character, Integer> record = new HashMap<>();
            for (char c : s.toCharArray()) {
                record.merge(c, 1, Integer::sum);
            }
            boolean flag = true;
            if (x > 0 && record.getOrDefault('R', 0) < x) {
                flag = false;
            } else if (x < 0 && record.getOrDefault('L', 0) < -x) {
                flag = false;
            } else if (y > 0 && record.getOrDefault('U', 0) < y) {
                flag = false;
            } else if (y < 0 && record.getOrDefault('D', 0) < -y) {
                flag = false;
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
