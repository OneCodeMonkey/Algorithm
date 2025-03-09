// Time: 296 ms 
// Memory: 600 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2025A_Two_Screens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String s = sc.next(), t = sc.next();
            int commonPrefix = 0;
            for (int j = 0; j < Math.min(s.length(), t.length()); j++) {
                if (s.charAt(j) == t.charAt(j)) {
                    commonPrefix++;
                } else {
                    break;
                }
            }

            System.out.println(commonPrefix == 0 ? (s.length() + t.length()) : (s.length() + t.length() - commonPrefix + 1));
        }
    }
}
