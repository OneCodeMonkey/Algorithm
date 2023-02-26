// AC: 58 ms 
// Memory: 0 KB
// Math: Just check a1 + a2 > an, if not, then 1st, 2nd and the n-th element is the answer, 
// because if a1 + a2 > an, then any combination of (i, j, k), i < j < k, can meets the requirements.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1398A_Bad_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), a1 = 0, a2 = 0, an = 0;
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    a1 = sc.nextInt();
                } else if (j == 1) {
                    a2 = sc.nextInt();
                } else if (j == n - 1) {
                    an = sc.nextInt();
                } else {
                    sc.nextInt();
                }
            }

            System.out.println(a1 + a2 > an ? -1 : ("1 2 " + n));
        }
    }
}
