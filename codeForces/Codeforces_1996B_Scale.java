// AC: 374 ms 
// Memory: 200 KB
// Implementation.
// T:O(sum(ni ^ 2)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1996B_Scale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            for (int j = 0; j < n; j++) {
                String row = sc.next();
                if (j % k == 0) {
                    if (k == 1) {
                        System.out.println(row);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (int r = 0; r < n; r++) {
                            if (r % k == 0) {
                                sb.append(row.charAt(r));
                            }
                        }
                        System.out.println(sb);
                    }
                }
            }
        }
    }
}
