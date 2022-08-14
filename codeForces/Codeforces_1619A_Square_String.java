// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(sum(si.length())), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1619A_Square_String {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.length() % 2 == 0) {
                boolean flag = true;
                for (int j = 0; j < s.length() / 2; j++) {
                    if (s.charAt(j) != s.charAt(j + s.length() / 2)) {
                        flag = false;
                        break;
                    }
                }
                System.out.println(flag ? "YES" : "NO");
            } else {
                System.out.println("NO");
            }
        }
    }
}
