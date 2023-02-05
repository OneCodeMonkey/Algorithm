// AC: 187 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1632A_ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            if (n == 1) {
                System.out.println("YES");
            } else if (n == 2) {
                System.out.println(s.charAt(0) == s.charAt(1) ? "NO" : "YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
