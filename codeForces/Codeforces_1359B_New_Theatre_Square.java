// AC: 248 ms 
// Memory: 0 KB
// Greedy.
// T:(O(sum(ni)), S:O(max(mi))
// 
import java.util.Scanner;

public class Codeforces_1359B_New_Theatre_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt(), ret = 0;
            boolean alwaysUseSmall = 2 * x <= y ? true : false;
            for (int j = 0; j < n; j++) {
                String row = sc.next();
                if (alwaysUseSmall) {
                    int countWhite = 0;
                    for (char c : row.toCharArray()) {
                        if (c == '.') {
                            countWhite++;
                        }
                    }
                    ret += countWhite * x;
                } else {
                    for (int k = 0; k < m; k++) {
                        char c = row.charAt(k);
                        if (c == '.') {
                            if (k + 1 < m && row.charAt(k + 1) == '.') {
                                ret += y;
                                k++;
                            } else {
                                ret += x;
                            }
                        }
                    }
                }
            }

            System.out.println(ret);
        }
    }
}
