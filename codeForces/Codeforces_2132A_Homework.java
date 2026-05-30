// Time: 218 ms 
// Memory: 1100 KB
// .
// T:O(n), S:(n)
// 
import java.util.Scanner;

public class Codeforces_2132A_Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String a = sc.next();
            int m = sc.nextInt();
            String b = sc.next(), c = sc.next();
            StringBuilder prefix = new StringBuilder(), suffix = new StringBuilder();
            for (int j = 0; j < m; j++) {
                if (c.charAt(j) == 'D') {
                    suffix.append(b.charAt(j));
                } else {
                    prefix.append(b.charAt(j));
                }
            }
            String ret = prefix.reverse() + a + suffix;

            System.out.println(ret);
        }
    }
}
