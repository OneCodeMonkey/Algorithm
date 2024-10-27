// AC: 328 ms 
// Memory: 700 KB
// Greedy. Only check head and tail.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_2003A_Turtle_and_Good_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();

            System.out.println(s.charAt(0) != s.charAt(n - 1) ? "YES" : "NO");
        }
    }
}
