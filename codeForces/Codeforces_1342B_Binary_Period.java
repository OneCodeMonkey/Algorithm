// Time: 249 ms	
// Memory: 1000 KB
// Notice it is subsequence, so simple construct a 2-period string.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1342B_Binary_Period {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int len = s.length(), countOne = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    countOne++;
                }
            }
            if (countOne == 0 || countOne == len) {
                System.out.println(s);
            } else {
                StringBuilder ret = new StringBuilder();
                if (s.charAt(0) == '0') {
                    ret.append('0').append("10".repeat(len - 1));
                } else {
                    ret.append('1').append("01".repeat(len - 1));
                }
                System.out.println(ret);
            }
        }
    }
}
