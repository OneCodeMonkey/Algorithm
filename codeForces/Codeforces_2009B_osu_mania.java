// AC: 280 ms 
// Memory: 600 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_2009B_osu_mania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            List<Integer> ret = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                String row = sc.next();
                ret.add(row.indexOf('#') + 1);
            }
            StringBuilder retStr = new StringBuilder();
            for (int j = ret.size() - 1; j >= 0; j--) {
                retStr.append(ret.get(j));
                if (j != 0) {
                    retStr.append(" ");
                }
            }

            System.out.println(retStr);
        }
    }
}
