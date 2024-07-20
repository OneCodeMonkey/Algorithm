// AC: 358 ms 
// Memory: 800 KB
// Two pointers.
// T:O(sum(mi + ni)), S:O(max(mi + ni))
// 
import java.util.Scanner;

public class Codeforces_1968B_Prefiquence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), curPos = 0, ret = 0;
            String a = sc.next(), b = sc.next();
            for (int j = 0; j < n && curPos < m; j++) {
                char c = a.charAt(j);
                while (curPos < m && b.charAt(curPos) != c) {
                    curPos++;
                }
                if (curPos < m && b.charAt(curPos) == c) {
                    curPos++;
                    ret++;
                }
            }

            System.out.println(ret);
        }
    }
}
