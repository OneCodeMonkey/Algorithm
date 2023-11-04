// AC: 218 ms 
// Memory: 0 KB
// Implementation.
// T:O(sum(ni * mi)), S:O(max(mi))
// 
import java.util.Scanner;

public class Codeforces_1627A_Not_Shading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), r = sc.nextInt(), c = sc.nextInt(), ret = 0;
            boolean hasB = false, rRowHasB = false, cColumnHasB = false, rAndCHasB = false;
            for (int j = 0; j < n; j++) {
                String s = sc.next();
                if (rAndCHasB) {
                    continue;
                }
                if (!hasB && s.contains("B")) {
                    hasB = true;
                }
                if (j + 1 == r) {
                    if (s.charAt(c - 1) == 'B') {
                        rAndCHasB = true;
                    } else if (s.contains("B")) {
                        rRowHasB = true;
                    }
                } else {
                    if (s.charAt(c - 1) == 'B') {
                        cColumnHasB = true;
                    }
                }
            }
            if (!rAndCHasB) {
                if (rRowHasB || cColumnHasB) {
                    ret = 1;
                } else if (hasB) {
                    ret = 2;
                } else {
                    ret = -1;
                }
            }

            System.out.println(ret);
        }
    }
}
