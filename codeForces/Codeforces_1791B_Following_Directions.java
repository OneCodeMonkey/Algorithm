// AC:187 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1791B_Following_Directions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), x = 0, y = 0;
            String s = sc.next();
            boolean isPassed = false;
            for (char c : s.toCharArray()) {
                if (c == 'L' || c == 'R') {
                    x += c == 'R' ? 1 : -1;
                } else {
                    y += c == 'U' ? 1 : -1;
                }

                if (x == 1 && y == 1) {
                    isPassed = true;
                    break;
                }
            }

            System.out.println(isPassed ? "YES" : "NO");
        }
    }
}
