// AC: 343 ms 
// Memory: 1100 KB
// String: Can prove that if s[0] == s[s.length() - 1], then always have 'ab','ba' same occurence.
// T:O(t), S:O(1)
//
import java.util.Scanner;

public class Codeforces_1606A_AB_Balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.length() > 1 && s.charAt(0) != s.charAt(s.length() - 1)) {
                s = s.charAt(s.length() - 1) + s.substring(1);
            }

            System.out.println(s);
        }
    }
}
