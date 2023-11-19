// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1634A_Reverse_and_Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), ret = 1;
            String s = sc.next();
            if (k > 0) {
                ret = checkPalindrome(s) ? 1 : 2;
            }
            System.out.println(ret);
        }

    }

    private static boolean checkPalindrome(String s) {
        boolean ret = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                ret = false;
                break;
            }
        }

        return ret;
    }
}
