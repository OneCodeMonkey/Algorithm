// Time: 296 ms 
// Memory: 900 KB
// Constructive.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1779B_MKnez_s_ConstructiveForces_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (n % 2 == 1) {
                if (n == 3) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    int start = (n - 1) / 2 - 1, second = -(start + 1);
                    StringBuilder ret = new StringBuilder();
                    for (int j = 0; j < (n - 1) / 2; j++) {
                        ret.append(start).append(" ").append(second).append(" ");
                    }
                    ret.append(start);
                    System.out.println(ret);
                }
            } else {
                System.out.println("YES");
                StringBuilder ret = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    ret.append(j % 2 == 0 ? 1 : -1);
                    if (j != n - 1) {
                        ret.append(" ");
                    }
                }
                System.out.println(ret);
            }
        }
    }
}
