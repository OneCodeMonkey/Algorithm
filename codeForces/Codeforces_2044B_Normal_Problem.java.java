// Time: 234 ms 
// Memory: 400 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_2044B_Normal_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String a = sc.next();
            StringBuilder ret = new StringBuilder();
            for (int j = a.length() - 1; j >= 0; j--) {
                char c = a.charAt(j), c1 = c;
                if (c == 'p') {
                    c1 = 'q';
                } else if (c == 'q') {
                    c1 = 'p';
                }
                ret.append(c1);
            }

            System.out.println(ret);
        }
    }
}
