// AC: 280 ms
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
//
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1971B_Different_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<Character, Integer> record = new HashMap<>();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            for (char c : s.toCharArray()) {
                record.merge(c, 1, Integer::sum);
            }
            if (record.size() == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                StringBuilder ret = new StringBuilder();
                for (char key : record.keySet()) {
                    ret.append(String.valueOf(key).repeat(record.get(key)));
                }
                if (ret.toString().equals(s)) {
                    ret.reverse();
                }
                System.out.println(ret);
            }
            record.clear();
        }
    }
}
