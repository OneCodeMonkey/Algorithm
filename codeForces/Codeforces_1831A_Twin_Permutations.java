// AC: 468 ms 
// Memory: 1200 KB
// Since ai + bi <= ai+1 + bi+1, just make ai + bi = n + 1 is fine.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1831A_Twin_Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            StringBuilder ret = new StringBuilder();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                ret.append(n + 1 - a);
                if (j != n - 1) {
                    ret.append(" ");
                }
            }

            System.out.println(ret);
        }
    }
}
