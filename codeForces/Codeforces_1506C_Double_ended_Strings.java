// AC: 265 ms 
// Memory: 700 KB
// LCS: 找最长公共子串，不过我们可以使用暴力解法 过此题。
// T:O(n ^ 2 ~ n ^ 3), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1506C_Double_ended_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String a = sc.next(), b = sc.next();
            int maxCommon = 0, len1 = a.length(), len2 = b.length();
            for (int j = 0; j < len1; j++) {
                for (int k = 0; k < len2; k++) {
                    int step = 0;
                    while (j + step < len1 && k + step < len2 && a.charAt(j + step) == b.charAt(k + step)) {
                        step++;
                    }
                    maxCommon = Math.max(maxCommon, step);
                    if (len2 - k <= maxCommon) {
                        break;
                    }
                }
                if (len1 - j <= maxCommon) {
                    break;
                }
            }

            System.out.println(len1 + len2 - 2 * maxCommon);
        }
    }
}
