// AC: 342 ms 
// Memory: 200 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1729B_Decode_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder ret = new StringBuilder();
            for (int j = n - 1; j >= 0; j--) {
                char c;
                if (s.charAt(j) == '0') {
                    int code = Integer.parseInt(s.charAt(j - 2) + String.valueOf(s.charAt(j - 1))) - 1;
                    c = (char) ('a' + code);
                    j -= 2;
                } else {
                    int code = Integer.parseInt(String.valueOf(s.charAt(j))) - 1;
                    c = (char) ('a' + code);
                }
                ret.append(c);
            }

            System.out.println(ret.reverse());
        }
    }
}
