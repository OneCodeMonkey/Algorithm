// AC: 685 ms 
// Memory: 100 KB
// greedy.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1811A_Insert_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), d = sc.nextInt();
            String s = sc.next(), retStr = "";
            if (d == 0) {
                retStr = s + d;
            } else {
                StringBuilder ret = new StringBuilder();
                boolean inserted = false;
                for (int j = 0; j < n; j++) {
                    if (!inserted && d > (s.charAt(j) - '0')) {
                        ret.append(d);
                        inserted = true;
                    }
                    ret.append(s.charAt(j));
                }
                if (!inserted) {
                    ret.append(d);
                }
                retStr = ret.toString();
            }

            System.out.println(retStr);
        }
    }
}
