// Time: 280 ms 
// Memory: 500 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_2167B_Your_Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            sc.nextInt();
            String s = sc.next(), t = sc.next();
            HashMap<Character, Integer> record1 = new HashMap<>(), record2 = new HashMap<>();
            for (char c : s.toCharArray()) {
                record1.merge(c, 1, Integer::sum);
            }
            for (char c : t.toCharArray()) {
                record2.merge(c, 1, Integer::sum);
            }
            boolean flag = false;
            if (record1.size() == record2.size()) {
                boolean flag1 = true;
                for (char c : record1.keySet()) {
                    if (!record1.get(c).equals(record2.getOrDefault(c, 0))) {
                        flag1 = false;
                        break;
                    }
                }
                flag = flag1;
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
