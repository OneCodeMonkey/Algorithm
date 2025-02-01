// AC: 358 ms 
// Memory: 800 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2050A_Line_Breaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), curLen = 0, ret = 0;
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                String s = sc.next();
                if (!flag) {
                    continue;
                }
                if (curLen + s.length() <= m) {
                    curLen += s.length();
                    ret++;
                } else {
                    flag = false;
                }
            }
            System.out.println(ret);
        }
    }
}
