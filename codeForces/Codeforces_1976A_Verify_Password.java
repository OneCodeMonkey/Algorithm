// AC: 249 ms 
// Memory: 900 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1976A_Verify_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            char prev = s.charAt(0);
            boolean ret = true;
            for (int j = 1; j < n; j++) {
                char c = s.charAt(j);
                if (c >= '0' && c <= '9') {
                    if (prev >= 'a' && prev <= 'z') {
                        ret = false;
                        break;
                    } else if (c < prev) {
                        ret = false;
                        break;
                    }
                } else {
                    if (prev >= 'a' && prev <= 'z' && c < prev) {
                        ret = false;
                        break;
                    }
                }
                prev = c;
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
