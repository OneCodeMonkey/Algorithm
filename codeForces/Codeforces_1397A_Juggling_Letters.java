// AC: 187 ms 
// Memory: 0 KB
// Hashmap.
// T:O(sum(ni)), S:O(1)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1397A_Juggling_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<Character, Integer> record = new HashMap<>();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            record.clear();
            for (int j = 0; j < n; j++) {
                String s = sc.next();
                for (char c : s.toCharArray()) {
                    record.merge(c, 1, Integer::sum);
                }
            }
            boolean flag = true;
            for (char c : record.keySet()) {
                if (record.get(c) % n != 0) {
                    flag = false;
                    break;
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
