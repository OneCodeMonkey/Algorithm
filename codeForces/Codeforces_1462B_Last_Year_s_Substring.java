// AC: 374 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1462B_Last_Year_s_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            if (s.startsWith("2020") || s.endsWith("2020") || (s.startsWith("2") && s.endsWith("020")) ||
                    (s.startsWith("20") && s.endsWith("20")) || (s.startsWith("202") && s.endsWith("0"))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
