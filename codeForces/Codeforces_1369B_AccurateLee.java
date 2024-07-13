// AC: 296 ms 
// Memory: 500 KB
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1369B_AccurateLee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            StringBuilder ret = new StringBuilder();
            String s = sc.next();
            int pos = 0, firstZero = 0, lastOne = 0;
            while (pos < s.length() && s.charAt(pos) == '0') {
                firstZero++;
                pos++;
            }
            pos = s.length() - 1;
            while (pos >= 0 && s.charAt(pos) == '1') {
                lastOne++;
                pos--;
            }
            if (firstZero + lastOne == s.length()) {
                System.out.println(s);
            } else {
                ret.append("0".repeat(firstZero));
                ret.append('0');
                ret.append("1".repeat(lastOne));
                System.out.println(ret.toString());
            }
        }
    }
}
