// AC: 327 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1365B_Trouble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), prev = 0;
            boolean hasOne = false, hasZero = false, isNonDecr = true;
            for (int j = 0; j < n; j++) {
                int val = sc.nextInt();
                if (!isNonDecr) {
                    continue;
                }
                if (val < prev) {
                    isNonDecr = false;
                }
                prev = val;
            }
            for (int j = 0; j < n; j++) {
                int type = sc.nextInt();
                if (!hasOne && type == 1) {
                    hasOne = true;
                }
                if (!hasZero && type == 0) {
                    hasZero = true;
                }
            }
            System.out.println((isNonDecr || (hasOne && hasZero)) ? "YES" : "NO");
        }
    }
}
