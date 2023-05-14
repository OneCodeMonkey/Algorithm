// AC: 233 ms 
// Memory: 100 KB
// Once the length is even, and do not start with ')', do not end with '(', it can be replaced and make a regular bracket expression.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1469A_Regular_Bracket_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            boolean flag = false;
            if (s.length() % 2 == 0 && !s.startsWith(")") && !s.endsWith("(")) {
                flag = true;
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}
