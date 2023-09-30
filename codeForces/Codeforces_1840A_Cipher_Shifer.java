// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1840A_Cipher_Shifer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder ret = new StringBuilder();
            char prev = ' ';
            for (int j = 0; j < n; j++) {
                if (prev != ' ') {
                    if (s.charAt(j) == prev) {
                        prev = ' ';
                    }
                } else {
                    prev = s.charAt(j);
                    ret.append(prev);
                }
            }

            System.out.println(ret);
        }
    }
}
