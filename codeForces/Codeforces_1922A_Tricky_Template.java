// AC: 311 ms 
// Memory: 400 KB
// Unless for every char position in strings, all char c1 == c3 || c2 == c3, we can always find such template which can meets the requirement.
// So just check this situation: every index i, c1 == c3 || c2 == c3. If true, then the template not exists.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1922A_Tricky_Template {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String a = sc.next(), b = sc.next(), c = sc.next();
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                char c1 = a.charAt(j), c2 = b.charAt(j), c3 = c.charAt(j);
                if (c1 != c3 && c2 != c3) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "NO" : "YES");
        }
    }
}
