// AC: 280 ms 
// Memory: 900 KB
// hashset.
// T:O(n), S:O(k)
// 
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_0988A_Diverse_Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        HashSet<Integer> record = new HashSet<>();
        List<Integer> indexes = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (indexes.size() < k && record.add(a)) {
                indexes.add(i + 1);
            }
        }
        if (indexes.size() == k) {
            System.out.println("YES");
            StringBuilder ret = new StringBuilder();
            for (int i : indexes) {
                ret.append(i);
                ret.append(" ");
            }
            System.out.println(ret.toString().trim());
        } else {
            System.out.println("NO");
        }
    }
}
