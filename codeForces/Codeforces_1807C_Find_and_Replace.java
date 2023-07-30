// AC: 217 ms 
// Memory: 0 KB
// Check the same character distance are even or not.
// T:O(sum(ni)), S:O(1)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1807C_Find_and_Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            HashMap<Character, Integer> record = new HashMap<>();
            boolean ret = true;
            for (int j = 0; j < n; j++) {
                if (record.containsKey(s.charAt(j))) {
                    if ((j - record.get(s.charAt(j))) % 2 != 0) {
                        ret = false;
                        break;
                    }
                }
                record.put(s.charAt(j), j);
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
