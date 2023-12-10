// AC: 217 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1832A_New_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            boolean flag = true;
            char c = s.charAt(0);
            for (int j = 1; j < s.length() / 2; j++) {
                if (s.charAt(j) != c) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "NO" : "YES");
        }
    }
}
