// AC: 498 ms 
// Memory: 10900 KB
// HashSet.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1714B_Remove_Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            List<Integer> record = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                record.add(sc.nextInt());
            }
            HashSet<Integer> record2 = new HashSet<>();
            boolean flag = false;
            for (int j = n - 1; j >= 0; j--) {
                int elem = record.get(j);
                if (record2.contains(elem)) {
                    System.out.println(j + 1);
                    flag = true;
                    break;
                }
                record2.add(elem);
            }
            if (!flag) {
                System.out.println(0);
            }
        }
    }
}
