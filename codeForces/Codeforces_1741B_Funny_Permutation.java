// AC: 296 ms 
// Memory: 0 KB
// construtive.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1741B_Funny_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (n == 3) {
                System.out.println(-1);
            } else {
                StringBuilder ret = new StringBuilder();
                if (n % 2 == 0) {
                    for (int j = 1; j <= n; j++) {
                        ret.append(j % 2 == 1 ? j + 1 : j - 1);
                        if (j != n) {
                            ret.append(" ");
                        } else {
                            ret.append("\n");
                        }
                    }
                } else {
                    for (int j = 4; j <= n; j++) {
                        ret.append(j % 2 == 0 ? j + 1 : j - 1);
                        ret.append(" ");
                    }
                    ret.append("1 2 3\n");
                }
                System.out.println(ret.toString());
            }
        }
    }
}
