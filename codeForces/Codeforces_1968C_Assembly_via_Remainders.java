// AC: 562 ms 
// Memory: 1300 KB
// Math & greedy.
// T:O(sum(ni)), S:O(max(ni))
//
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1968C_Assembly_via_Remainders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), prev = 501;
            List<Integer> ret = new ArrayList<>();
            ret.add(prev);
            for (int j = 0; j < n - 1; j++) {
                int x = sc.nextInt();
                ret.add(x + prev);
                prev = x + prev;
            }
            StringBuilder retStr = new StringBuilder();
            for (int item : ret) {
                retStr.append(item);
                retStr.append(" ");
            }
            retStr.deleteCharAt(retStr.length() - 1);

            System.out.println(retStr);
        }
    }
}
