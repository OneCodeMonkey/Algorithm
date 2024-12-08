// AC: 249 ms 
// Memory: 1200 KB
// Notice: 最底下的砖块，对应 字符串的 0-index，别搞反了。
// T:O(sum(ni)), S:O(max(ni))
//
import java.util.Scanner;

public class Codeforces_1795A_Two_Towers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt();
            boolean ret = false;
            String s = sc.next(), t1 = sc.next();
            ret = (checkDupAdjacent(s) == 0 && checkDupAdjacent(t1) == 0) ||
                    checkDupAdjacent(t1 + new StringBuilder(s).reverse()) <= 1 ||
                    checkDupAdjacent(s + new StringBuilder(t1).reverse()) <= 1;

            System.out.println(ret ? "YES" : "NO");
        }
    }

    private static int checkDupAdjacent(String s) {
        int ret = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                ret++;
            }
        }

        return ret;
    }
}
