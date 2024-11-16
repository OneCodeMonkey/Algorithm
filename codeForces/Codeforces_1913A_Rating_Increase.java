// AC: 327 ms 
// Memory: 800 K
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1913A_Rating_Increase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int len = s.length(), a = 0, b = 0;
            for (int j = 1; j <= len / 2; j++) {
                if (s.charAt(j) == '0') {
                    continue;
                }
                int a1 = Integer.parseInt(s.substring(0, j)), b1 = Integer.parseInt(s.substring(j));
                if (b1 > a1) {
                    b = b1;
                    a = a1;
                    break;
                }
            }

            System.out.println(a == 0 ? -1 : (a + " " + b));
        }
    }
}
