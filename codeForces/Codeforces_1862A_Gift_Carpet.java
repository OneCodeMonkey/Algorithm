// AC: 218 ms 
// Memory: 0 KB
// .
// T:O(sum(n * m)), S:O(max(n * m))
// 
import java.util.Scanner;

public class Codeforces_1862A_Gift_Carpet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String target = "vika";
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), pos = 0;
            boolean ret = false;
            String[] arr = new String[n];
            for (int j = 0; j < n; j++) {
                String s = sc.next();
                arr[j] = s;
            }
            if (m >= 4) {
                for (int j = 0; j < m; j++) {
                    char c = target.charAt(pos);
                    for (int k = 0; k < n; k++) {
                        if (arr[k].charAt(j) == c) {
                            pos++;
                            break;
                        }
                    }
                    if (pos >= target.length()) {
                        break;
                    }
                }
                if (pos >= target.length()) {
                    ret = true;
                }
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
